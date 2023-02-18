package uiTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

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
