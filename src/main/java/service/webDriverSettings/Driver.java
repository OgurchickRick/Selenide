package service.webDriverSettings;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;

public class Driver {

    public void initDriver() {
        Configuration.browser = Browsers.CHROME;
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.screenshots = false;
    }
}
