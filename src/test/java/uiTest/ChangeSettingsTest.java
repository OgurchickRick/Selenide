package uiTest;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Изменение настроек")
public class ChangeSettingsTest extends BaseTest{

    @Test
    @Order(1)
    @DisplayName("Смена аватара")
    public void avatarChange() {
        auth.authorization();
        mainPage.userAvatar.click();
        Selenide.switchTo().frame($x("//iframe[@class='full-page']"));
        settingsPage.inputGreeting.val("Привет мир!!!");
        settingsPage.newUserAvatar.click();
        settingsPage.buttonSaveNewAvatar.click();
        xpath.alertError.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Смена пин кода")
    public void ChangePinCode() {
        auth.authorization();
        mainPage.menuItemCards.click();
        cardsPage.linkChangePinCode.click();
        cardsPage.inputPinCode.val("1111");
        cardsPage.buttonChangePinCode.click();
        Selenide.switchTo().frame("confirmation-frame");
        cardsPage.OTPInput.val("0000").pressEnter();
        xpath.alertSuccess.shouldBe(visible);
    }
}
