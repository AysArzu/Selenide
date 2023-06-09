package pages;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {
    public SelenideElement username = $(By.id("exampleInputEmail1"));

    public SelenideElement password = $("#exampleInputPassword1");

    public SelenideElement submit = $(By.xpath("//button[@type='submit']"));

    public SelenideElement message = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));


}
