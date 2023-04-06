package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// page_url = https://idemo.bspb.ru/
public class XpathLocators {

    public SelenideElement alertError = $x("//div[contains(@class, 'alert-error')]");
    public SelenideElement alertSuccess = $x("//div[contains(@class, 'alert-succes')]");
}
