package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.visible;

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
}
