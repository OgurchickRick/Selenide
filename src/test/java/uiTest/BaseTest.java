package uiTest;

import com.codeborne.selenide.Selenide;
import methods.Authorization;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterMethod;
import pages.*;
import service.webDriverSettings.Driver;

import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTest {

    Authorization auth = new Authorization();
    XpathLocators xpath = new XpathLocators();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    CardsPage cardsPage = new CardsPage();
    SettingsPage settingsPage = new SettingsPage();
    PaymentsAndTransfersPage paymentsAndTransfersPage = new PaymentsAndTransfersPage();
    Driver driver = new Driver();



    @BeforeEach
    public void initTest() {
        driver.initDriver();
        open("https://idemo.bspb.ru/");
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
