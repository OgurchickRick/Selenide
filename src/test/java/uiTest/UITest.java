package uiTest;

import com.codeborne.selenide.Selenide;
import model.*;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Интернет банк")
public class UITest extends BaseTest{
    XpathLocators xpath = new XpathLocators();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    CardsPage cardsPage = new CardsPage();
    SettingsPage settingsPage = new SettingsPage();
    PaymentsAndTransfersPage paymentsAndTransfersPage = new PaymentsAndTransfersPage();


    @Test
    @Order(1)
    @DisplayName("Авторизация с валидным логином и паролем")
    public void login() {
        loginPage.InputUserName.val("demo").pressTab().val("demo").pressEnter();
        loginPage.InputConfirmationCode.val("0000").pressEnter();
        mainPage.IconClose.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Пополнение счёта > 100")
    public void refillSuccess() {
        login();
        mainPage.MenuItemCards.click();
        cardsPage.LinkCardPayments.click();
        cardsPage.WriteOffCard.click();
        cardsPage.SelectGoldCard.click();
        cardsPage.InputAmountForCard.val("194").pressEnter();
        cardsPage.CheckboxAgreeRules.click();
        Selenide.switchTo().frame("confirmation-frame");
        cardsPage.OTPInput.val("0000").pressEnter();
        cardsPage.AlertSuccessfulOperation.shouldBe(visible);
    }

    @Test
    @Order(3)
    @DisplayName("Пополнение счёта < 100")
    public void refillFalse() {
        login();
        mainPage.MenuItemCards.click();
        cardsPage.LinkCardPayments.click();
        cardsPage.WriteOffCard.click();
        cardsPage.SelectGoldCard.click();
        cardsPage.InputAmountForCard.val("45").pressEnter();
        cardsPage.RefillError.shouldBe(visible);
    }

    @Test
    @Order(4)
    @DisplayName("Смена аватара")
    public void avatarChange() {
        login();
        mainPage.UserAvatar.click();
        Selenide.switchTo().frame($x("//iframe[@class='full-page']"));
        settingsPage.InputGreeting.val("Привет мир!!!");
        settingsPage.NewUserAvatar.click();
        settingsPage.ButtonSaveNewAvatar.click();
        xpath.AlertError.shouldBe(visible);
    }

    @Test
    @Order(5)
    @DisplayName("Проверка и оплата последнего штрафа")
    public void checkingAndPayLastFines() {
        login();
        mainPage.MenuItemPaymentsAndTransfers.click();
        paymentsAndTransfersPage.LinkGIBDD.click();
        paymentsAndTransfersPage.InputVehicleRegistrationCertificate.val("78 ХС 471014").pressEnter();
        paymentsAndTransfersPage.PayLastFine.click();
        paymentsAndTransfersPage.ButtonForward.click();
        xpath.AlertError.shouldBe(visible);
    }

}
