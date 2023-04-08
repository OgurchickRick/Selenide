package uiTest;

import org.junit.jupiter.api.*;
import steps.LoginSteps;

import static com.codeborne.selenide.Condition.visible;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Авторизация")
public class LoginTest extends BaseTest{

    @Test
    @Order(1)
    @DisplayName("Авторизация с валидным логином и паролем")
    public void loginValid() {
        LoginSteps.authorization("demo", "demo");
        loginPage.buttonLogin.click();
        loginPage.inputConfirmationCode.setValue("0000").pressEnter();
        mainPage.iconClose.shouldBe(visible);
    }

    @Test
    @Order(2)
    @DisplayName("Авторизация с не валидным логином и паролем")
    public void loginNoValidPassword() {
        LoginSteps.authorization("admin", "admin");
        loginPage.buttonLogin.click();
        xpath.alertError.shouldBe(visible);
    }

    @Test
    @Order(3)
    @DisplayName("Авторизация с не валидным кодом подтверждения")
    public void loginNoValidConfirmationCode() {
        LoginSteps.authorization("demo", "demo");
        loginPage.buttonLogin.click();
        loginPage.inputConfirmationCode.setValue("1111").pressEnter();
        xpath.alertError.shouldBe(visible);
    }
}
