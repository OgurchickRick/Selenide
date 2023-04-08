package methods;

import pages.LoginPage;
import steps.LoginSteps;

public class Authorization {
    final LoginPage loginPage = new LoginPage();

    public  void authorization() {
        LoginSteps.authorization("demo", "demo");
        loginPage.buttonLogin.click();
        loginPage.inputConfirmationCode.setValue("0000").pressEnter();
    }
}
