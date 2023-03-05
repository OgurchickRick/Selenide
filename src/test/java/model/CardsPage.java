package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CardsPage {
    public SelenideElement LinkCardPayments = $x("//*[@id=\"card-details-ownbank-10068\"]/div[2]/div[2]/div/div/div[1]/a");
    public SelenideElement InputAmountForCard = $x("//input[@name='data.amount']");
    public SelenideElement WriteOffCard = $x("//select[@name='data.fromCardId']");
    public SelenideElement SelectGoldCard = $x("//select[@name='data.fromCardId']/option[2]");
    public SelenideElement CheckboxAgreeRules = $x("//input[@name='condition.generalConditions']");
    public SelenideElement AlertSuccessfulOperation = $x("//*[contains(@class, 'alert-success')]");
    public SelenideElement OTPInput = $x("//*[@id=\"otp-input\"]");
    public SelenideElement RefillError = $x("//input[contains(@class, 'error')]");
    public SelenideElement LinkChangePinCode = $x("//*[@id=\"card-details-ownbank-10068\"]/div[2]/div[2]/div/div/div[3]/a");
    public SelenideElement InputPinCode = $x("//input[@id='pin']");
    public SelenideElement ButtonChangePinCode = $x("//button[@id='set-pin']");
}
