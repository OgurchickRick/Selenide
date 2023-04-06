package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SettingsPage {
    public SelenideElement newUserAvatar = $x("//*[@id='avatars']/img[24]");
    public SelenideElement buttonSaveNewAvatar = $x("//button[@id='submit-button']");
    public SelenideElement inputGreeting = $x("//*[@name='greeting']");
}
