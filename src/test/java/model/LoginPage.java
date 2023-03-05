package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class LoginPage {
    public SelenideElement InputUserName = $x("//input[@name='username']");
    public SelenideElement InputConfirmationCode = $x("//input[@id='otp-code']");
}
