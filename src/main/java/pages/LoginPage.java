package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class LoginPage {
    public SelenideElement inputUserName = $x("//input[@name='username']");
    public SelenideElement inputConfirmationCode = $x("//input[@id='otp-code']");
}
