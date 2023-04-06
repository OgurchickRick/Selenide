package uiTest;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Пополнение счёта")
public class RefillTest extends  BaseTest{

    @Test
    @Order(1)
    @DisplayName("Пополнение счёта > 100")
    public void refillSuccess() {
        auth.authorization();
        mainPage.menuItemCards.click();
        cardsPage.linkCardPayments.click();
        cardsPage.writeOffCard.click();
        cardsPage.selectGoldCard.click();
        cardsPage.inputAmountForCard.val("194").pressEnter();
        cardsPage.checkboxAgreeRules.click();
        Selenide.switchTo().frame("confirmation-frame");
        cardsPage.OTPInput.val("0000").pressEnter();
        cardsPage.alertSuccessfulOperation.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Пополнение счёта - пограничное значение")
    public void refillFalse() {
        auth.authorization();
        mainPage.menuItemCards.click();
        cardsPage.linkCardPayments.click();
        cardsPage.writeOffCard.click();
        cardsPage.selectGoldCard.click();
        cardsPage.inputAmountForCard.val("99").pressEnter();
        cardsPage.refillError.shouldBe(visible);
    }

    @Test
    @Order(3)
    @DisplayName("Пополнение счёта < 100")
    public void refillFalse2() {
        auth.authorization();
        mainPage.menuItemCards.click();
        cardsPage.linkCardPayments.click();
        cardsPage.writeOffCard.click();
        cardsPage.selectGoldCard.click();
        cardsPage.inputAmountForCard.val("45").pressEnter();
        cardsPage.refillError.shouldBe(visible);
    }

}
