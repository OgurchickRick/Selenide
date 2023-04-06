package uiTest;

import com.codeborne.selenide.Configuration;
import methods.Authorization;
import org.junit.jupiter.api.BeforeEach;
import pages.*;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    Authorization auth = new Authorization();
    XpathLocators xpath = new XpathLocators();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    CardsPage cardsPage = new CardsPage();
    SettingsPage settingsPage = new SettingsPage();
    PaymentsAndTransfersPage paymentsAndTransfersPage = new PaymentsAndTransfersPage();

    public void setUp() {
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.screenshots = false;
        open("https://idemo.bspb.ru/");

    }


    @BeforeEach
    public void initTest() {
        setUp();
    }
}
