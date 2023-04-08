package steps;

import pages.LoginPage;

public abstract class LoginSteps{
    static LoginPage loginPage = new LoginPage();

    public static void authorization(String userName, String password){
        loginPage.inputUserName.setValue(userName);
        loginPage.inputUserPassword.setValue(password);
    }
}
