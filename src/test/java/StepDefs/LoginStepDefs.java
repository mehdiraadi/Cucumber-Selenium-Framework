package StepDefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by shahe on 13/11/2017.
 */
public class LoginStepDefs {


    

    @And("^I enter username and password$")
    public void iEnterUsernameAndPassword() throws Throwable {
        System.out.println("hi");
    }

    @When("^I click login$")
    public void iClickLogin() throws Throwable {
        System.out.println("are u ther");
    }

    @Then("^I get message that login successfully$")
    public void iGetMessageThatLoginSuccessfully() throws Throwable {
        System.out.println("i am here");
    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        System.out.println("print smething" );
    }


    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

       List<List<String>> list =table.raw();

        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(1).get(0));
        System.out.println(list.get(1).get(1));
    }



    }

