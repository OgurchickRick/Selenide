package uiTest;

import com.codeborne.selenide.Selenide;
import model.XpathLocators;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

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
    @DisplayName("Пополнение счёта > 100")
    public void refillSuccess() {
        login();
        xpath.MenuItemCards.click();
        xpath.LinkCardPayments.click();
        xpath.WriteOffCard.click();
        xpath.SelectGoldCard.click();
        xpath.InputAmountForCard.val("194").pressEnter();
        xpath.CheckboxAgreeRules.click();
        Selenide.switchTo().frame("confirmation-frame");
        xpath.OTPInput.val("0000").pressEnter();
        xpath.AlertSuccessfulOperation.shouldBe(visible);
    }

    @Test
    @Order(3)
    @DisplayName("Пополнение счёта < 100")
    public void refillFalse() {
        login();
        xpath.MenuItemCards.click();
        xpath.LinkCardPayments.click();
        xpath.WriteOffCard.click();
        xpath.SelectGoldCard.click();
        xpath.InputAmountForCard.val("45").pressEnter();
        xpath.RefillError.shouldBe(visible);
    }

    @Test
    @Order(4)
    @DisplayName("Смена аватара")
    public void avatarChange() {
        login();
        xpath.UserAvatar.click();
        Selenide.switchTo().frame($x("//iframe[@class='full-page']"));
        xpath.InputGreeting.val("Привет мир!!!");
        xpath.NewUserAvatar.click();
        xpath.ButtonSaveNewAvatar.click();
        xpath.AlertError.shouldBe(visible);
    }

    @Test
    @Order(5)
    @DisplayName("Проверка и оплата последнего штрафа")
    public void checkingAndPayLastFines() {
        login();
        xpath.PaymentsAndTransfers.click();
        xpath.LinkGIBDD.click();
        xpath.InputVehicleRegistrationCertificate.val("78 ХС 471014").pressEnter();
        xpath.PayLastFine.click();
        xpath.ButtonForward.click();
        xpath.AlertError.shouldBe(visible);
    }

}
