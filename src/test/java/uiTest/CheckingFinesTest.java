package uiTest;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.visible;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("UI тесты. Проверка штрафов")
public class CheckingFinesTest extends BaseTest{

    @Test
    @Order(1)
    @DisplayName("Проверка и оплата последнего штрафа")
    public void checkingAndPayLastFines() {
        auth.authorization();
        mainPage.menuItemPaymentsAndTransfers.click();
        paymentsAndTransfersPage.linkGIBDD.click();
        paymentsAndTransfersPage.inputVehicleRegistrationCertificate.val("78 ХС 471014").pressEnter();
        paymentsAndTransfersPage.payLastFine.click();
        paymentsAndTransfersPage.buttonForward.click();
        xpath.alertError.shouldBe(visible);
    }

}
