package uiTest;

import model.XpathLocators;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Интернет банк")
public class UITest extends BaseTest{
    XpathLocators xpath = new XpathLocators();


    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void login() {
        xpath.InputUserName.val("demo").pressTab().val("demo").pressEnter();
        xpath.InputConfirmationCode.val("0000").pressEnter();
        xpath.IconClose.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Пополнение счёта")
    public void refill() {
        login();
        xpath.MenuItemCards.click();
        xpath.LinkCardPayments.click();
        xpath.WriteOffCard.click();
        xpath.SelectGoldCard.click();
        xpath.InputAmountForCard.val("194").pressEnter();
        xpath.CheckboxAgreeRules.click();
        xpath.OTPInput.val("0000").pressEnter();

    }

    @Test
    @Order(3)
    @DisplayName("Смена аватара")
    public void avatarChange() {
        login();
        xpath.UserAvatar.click();
        xpath.InputGreeting.val("Привет мир!!!");
        xpath.NewUserAvatar.click();
        xpath.ButtonSaveNewAvatar.click();
    }

}
