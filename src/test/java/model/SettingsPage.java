package model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SettingsPage {
    public SelenideElement NewUserAvatar = $x("//*[@id='avatars']/img[24]");
    public SelenideElement ButtonSaveNewAvatar = $x("//button[@id='submit-button']");
    public SelenideElement InputGreeting = $x("//*[@name='greeting']");
}
