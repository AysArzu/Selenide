package stepdefinitions;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TestCenterPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertTrue;

public class TestCenterStepDefinitions {
    TestCenterPage testCenterPage = new TestCenterPage();

    @Given("enter the username")
    public void enter_the_username() {
        testCenterPage.username.setValue("techproed");
    }

    @Given("Enter your password")
    public void enter_your_password() {
        testCenterPage.password.setValue("SuperSecretPassword");
    }

    @When("Click submit button")
    public void click_submit_button() {
        testCenterPage.submit.click();
    }

    @Then("Assert login in")
    public void assert_login_in() {
        testCenterPage.message.shouldBe(visible);//Selenide assertion
    }

    @Then("user select for year {int} for month {string} for day {int}")
    public void userSelectForYearForMonthForDay(int year, String month, int day) {

        testCenterPage.year.selectOptionByValue(String.valueOf(year));
        sleep(2000);
        testCenterPage.month.selectOption(month);
        sleep(2000);
        testCenterPage.day.selectOption(day - 1);//13. day
    }

    @And("click alert promt")
    public void clickAlertPromt() {
        testCenterPage.promptButton.click();
    }

    @And("user send text {string}")
    public void userSendText(String text) throws InterruptedException {
        switchTo().alert().sendKeys(text);
        Thread.sleep(3000);
        switchTo().alert().accept();
        Thread.sleep(3000);
    }

    @Then("confirm that the user's input contains the word {string}")
    public void confirmThatTheUserSInputContainsTheWord(String result) {
        testCenterPage.result.shouldHave(text(result));//Choosen
       // assertTrue(testCenterPage.result.text().contains(result));assertion JUnit
    }

    @And("switch to frame {int}")
    public void switchToFrame(int frame) {
        switchTo().frame(frame-1);
    }

    @And("user click  back to techproeducation.com button")
    public void userClickBackToTechproeducationComButton() {
        testCenterPage.techproLink.click();
        System.out.println("Page url: "+url());
       // System.out.println("Page url: "+ WebDriverRunner.url());
    }

    @And("switch to window {int}")
    public void switchToWindow(int targetWindow) {
        switchTo().window(targetWindow-1, Duration.ofSeconds(5));//for extra wait
        System.out.println("New window url: "+ url());
    }
}
