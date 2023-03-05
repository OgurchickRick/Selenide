package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement IconClose = $x("//*[@class='icon-close']");
    public SelenideElement MenuItemCards = $x("//a[@id='cards-overview-index']");
    public SelenideElement UserAvatar = $x("//a[@id='user-avatar']");
    public SelenideElement MenuItemPaymentsAndTransfers = $x("//a[@id='payments-form']");
}
