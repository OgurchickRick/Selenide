package methods;

import pages.LoginPage;

public class Authorization {
    LoginPage loginPage = new LoginPage();
    public  void authorization() {
        loginPage.inputUserName.val("demo").pressTab().val("demo").pressEnter();
        loginPage.inputConfirmationCode.val("0000").pressEnter();
    }
}
