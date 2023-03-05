package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// page_url = https://idemo.bspb.ru/
public class XpathLocators {

    public SelenideElement AlertError = $x("//div[contains(@class, 'alert-error')]");
    public SelenideElement AlertSuccess = $x("//div[contains(@class, 'alert-succes')]");
}
