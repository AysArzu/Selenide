package pages;

import com.codeborne.selenide.SelenideElement;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {
    public SelenideElement username = $(By.id("exampleInputEmail1"));

    public SelenideElement password = $("#exampleInputPassword1");

    public SelenideElement submit = $(By.xpath("//button[@type='submit']"));

    public SelenideElement message = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));
public SelenideElement year= $(By.id("year"));
public SelenideElement month= $(By.id("month"));
public SelenideElement day= $(By.id("day"));

public SelenideElement promptButton = $(By.xpath("//button[@onclick='jsPrompt()']"));
public SelenideElement result = $("#result");

public SelenideElement techproLink = $(By.xpath("//a[@type='button']"));



}
