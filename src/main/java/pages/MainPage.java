package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement iconClose = $x("//*[@class='icon-close']");
    public SelenideElement menuItemCards = $x("//a[@id='cards-overview-index']");
    public SelenideElement userAvatar = $x("//a[@id='user-avatar']");
    public SelenideElement menuItemPaymentsAndTransfers = $x("//a[@id='payments-form']");
}
