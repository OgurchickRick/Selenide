package uiTest;

import org.testng.annotations.Test;
import steps.LoginSteps;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseTest{

    @Test(description = "Авторизация с валидным логином и паролем")
    public void loginValid() {
        LoginSteps.authorization("demo", "demo");
        loginPage.buttonLogin.click();
        loginPage.inputConfirmationCode.setValue("0000").pressEnter();
        mainPage.iconClose.shouldBe(visible);
    }

    @Test(description = "Авторизация с не валидным логином и паролем")
    public void loginNoValidPassword() {
        LoginSteps.authorization("admin", "admin");
        loginPage.buttonLogin.click();
        xpath.alertError.shouldBe(visible);
    }

    @Test(description = "Авторизация с не валидным кодом подтверждения")
    public void loginNoValidConfirmationCode() {
        LoginSteps.authorization("demo", "demo");
        loginPage.buttonLogin.click();
        loginPage.inputConfirmationCode.setValue("1111").pressEnter();
        xpath.alertError.shouldBe(visible);
    }
}
