package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PaymentsAndTransfersPage {
    public SelenideElement linkGIBDD = $x("//a[@href='/gisgmp/traffic?subscriptionId=10432']");
    public SelenideElement inputVehicleRegistrationCertificate = $x("//input[@name='vehicleRegistrationCertificate']");
    public SelenideElement checkFines = $x("//*[@id=\"gisgmp-check-charges\"]/div/div[5]/div/button");
    public SelenideElement payLastFine =  $x("//tr[1]/td[4]/a");
    public SelenideElement buttonForward = $x("//button[@id='forward']");
}
