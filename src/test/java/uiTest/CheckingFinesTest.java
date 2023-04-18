package uiTest;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class CheckingFinesTest extends BaseTest{

    @Test(description = "Проверка и оплата последнего штрафа")
    public void checkingAndPayLastFines() {
        auth.authorization();
        mainPage.menuItemPaymentsAndTransfers.click();
        paymentsAndTransfersPage.linkGIBDD.click();
        paymentsAndTransfersPage.inputVehicleRegistrationCertificate.val("78 ХС 471014").pressEnter();
        paymentsAndTransfersPage.checkFines.click();
        paymentsAndTransfersPage.payLastFine.click();
        paymentsAndTransfersPage.buttonForward.click();
        xpath.alertError.shouldBe(visible);
    }

}
