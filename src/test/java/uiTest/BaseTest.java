package uiTest;

import com.codeborne.selenide.Selenide;
import methods.Authorization;
import org.testng.annotations.*;
import pages.*;
import service.webDriverSettings.Driver;

abstract public class BaseTest {

    Authorization auth = new Authorization();
    XpathLocators xpath = new XpathLocators();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    CardsPage cardsPage = new CardsPage();
    SettingsPage settingsPage = new SettingsPage();
    PaymentsAndTransfersPage paymentsAndTransfersPage = new PaymentsAndTransfersPage();
    Driver driver = new Driver();



    @BeforeMethod
    public void initTest() {
        driver.initDriver();
        Selenide.open("https://idemo.bspb.ru/");
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
