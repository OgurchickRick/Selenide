package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CardsPage {
    public SelenideElement linkCardPayments = $x("//*[@id=\"card-details-ownbank-10068\"]/div[2]/div[2]/div/div/div[1]/a");
    public SelenideElement inputAmountForCard = $x("//input[@name='data.amount']");
    public SelenideElement writeOffCard = $x("//select[@name='data.fromCardId']");
    public SelenideElement selectGoldCard = $x("//select[@name='data.fromCardId']/option[2]");
    public SelenideElement checkboxAgreeRules = $x("//input[@name='condition.generalConditions']");
    public SelenideElement alertSuccessfulOperation = $x("//*[contains(@class, 'alert-success')]");
    public SelenideElement OTPInput = $x("//*[@id=\"otp-input\"]");
    public SelenideElement refillError = $x("//input[contains(@class, 'error')]");
    public SelenideElement linkChangePinCode = $x("//*[@id=\"card-details-ownbank-10068\"]/div[2]/div[2]/div/div/div[3]/a");
    public SelenideElement inputPinCode = $x("//input[@id='pin']");
    public SelenideElement buttonChangePinCode = $x("//button[@id='set-pin']");
}
