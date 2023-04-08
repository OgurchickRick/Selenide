package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class LoginPage {
    public SelenideElement inputUserName = $x("//input[@name='username']");
    public SelenideElement inputUserPassword = $x("//input[@name='password']");
    public SelenideElement buttonLogin = $x("//button['#login-button']");
    public SelenideElement inputConfirmationCode = $x("//input[@id='otp-code']");
}
