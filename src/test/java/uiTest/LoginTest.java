package uiTest;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Авторизация")
public class LoginTest extends BaseTest{

    @Test
    @Order(1)
    @DisplayName("Авторизация с валидным логином и паролем")
    public void loginValid() {
        loginPage.inputUserName.val("demo").pressTab().val("demo").pressEnter();
        loginPage.inputConfirmationCode.val("0000").pressEnter();
        mainPage.iconClose.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Авторизация с не валидным логином и паролем")
    public void loginNoValidPassword() {
        loginPage.inputUserName.val("admin").pressTab().val("admin").pressEnter();
        xpath.alertError.shouldBe(visible);
    }

    @Test
    @Order(3)
    @DisplayName("Авторизация с не валидным кодом подтверждения")
    public void loginNoValidConfirmationCode() {
        loginPage.inputUserName.val("demo").pressTab().val("demo").pressEnter();
        loginPage.inputConfirmationCode.val("1111").pressEnter();
        xpath.alertError.shouldBe(visible);
    }
}
