package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PaymentsAndTransfersPage {
    public SelenideElement LinkGIBDD = $x("//a[@href='/gisgmp/traffic?subscriptionId=10432']");
    public SelenideElement InputVehicleRegistrationCertificate = $x("//input[@name='vehicleRegistrationCertificate']");
    public SelenideElement PayLastFine = $x("//table/tbody/tr[1]/td[4]/a");
    public SelenideElement ButtonForward = $x("//button[@id='forward']");
}
