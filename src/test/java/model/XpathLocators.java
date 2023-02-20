package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// page_url = https://idemo.bspb.ru/
public class XpathLocators {
    public SelenideElement InputUserName = $x("//input[@name='username']");
    public SelenideElement InputPassword = $x("//input[@name='password']");
    public SelenideElement ButtonLogin = $x("//button[@id='login-button']");
    public SelenideElement InputConfirmationCode = $x("//input[@id='otp-code']");
    public SelenideElement IconClose = $x("//*[@class='icon-close']");
    public SelenideElement MenuItemCards = $x("//a[@id='cards-overview-index']");
    public SelenideElement LinkCardPayments = $x("//a[@href='/card-to-card-payments/topup-card/10067']");
    public SelenideElement InputAmountForCard = $x("//input[@name='data.amount']");
    public SelenideElement WriteOffCard = $x("//select[@name='data.fromCardId']");
    public SelenideElement SelectGoldCard = $x("//select[@name='data.fromCardId']/option[2]");
    public SelenideElement CheckboxAgreeRules = $x("//input[@name='condition.generalConditions']");
    public SelenideElement AlertSuccessfulOperation = $x("//*[contains(@class, 'alert-success')]");
    public SelenideElement OTPInput = $x("//*[@id=\"otp-input\"]");
    public SelenideElement RefillError = $x("//input[contains(@class, 'error')]");
    public SelenideElement UserAvatar = $x("//a[@id='user-avatar']");
    public SelenideElement NewUserAvatar = $x("//*[@id='avatars']/img[24]");
    public SelenideElement ButtonSaveNewAvatar = $x("//button[@id='submit-button']");
    public SelenideElement InputGreeting = $x("//*[@name='greeting']");
    public SelenideElement AlertError = $x("//div[contains(@class, 'alert-error')]");
    public SelenideElement PaymentsAndTransfers = $x("//a[@id='payments-form']");
    public SelenideElement LinkGIBDD = $x("//a[@href='/gisgmp/traffic?subscriptionId=10432']");
    public SelenideElement InputVehicleRegistrationCertificate = $x("//input[@name='vehicleRegistrationCertificate']");
    public SelenideElement PayLastFine = $x("//table/tbody/tr[1]/td[4]/a");
    public SelenideElement ButtonForward = $x("//button[@id='forward']");
}
