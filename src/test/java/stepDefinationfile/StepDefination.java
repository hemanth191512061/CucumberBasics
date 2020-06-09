package stepDefinationfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^the url used to land into the account is given$")
    public void the_url_used_to_land_into_the_account_is_given() throws Throwable {
        System.out.println("landed into the account");
    }

    @When("^the user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_enters_the_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("username and password are");
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^the user enters into account page$")
    public void the_user_enters_into_account_page() throws Throwable {
        System.out.println("account page is loaded");
    }

    @And("^he can verify the cards using \"([^\"]*)\"$")
    public void he_can_verify_the_cards_using_something(String strArg1) throws Throwable {
        System.out.println("to know about the access");
    	System.out.println(strArg1);
    }

}