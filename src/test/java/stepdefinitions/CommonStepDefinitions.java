package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;


public class CommonStepDefinitions {


    @Given("User go to {string}")
    public void user_go_to(String string) {
        open(string); //sayfaya gitmek icin open() kullanilir
    }

    @Then("wait {int} seconds")
    public void seconds(Integer number) {
        //Selenide default olarak 4 saniye bekler
        //4 saniyeden fazla beklemek icin sleep methodu kullanilir
        //sleep fonksiyonu milisecond kabul eder. Saniyeye cevirmek icin 1000 ile carpilir

        sleep(number * 1000);
    }

    @Then("go back to the previous page")
    public void go_back_to_the_previous_page() {
        back();

    }

    @Then("go to the next page")
    public void go_to_the_next_page() {
        forward();
    }

    @Then("refresh the page")
    public void refresh_the_page() {
        refresh();
    }

    @Then("keep the page open")
    public void keep_the_page_open() {

    }

}
