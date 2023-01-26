package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegisterAccount {

    @Given("user is on the register page")
    public void user_is_on_the_register_page() {
        System.out.println("Application launched and navigated to register page");
    }



    @When("user fill out the registration form")
    public void user_fill_out_the_registration_form(io.cucumber.datatable.DataTable dataTable) {
       List<Map<String,String>> userData=dataTable.asMaps();
for(Map<String,String> e :userData){
    System.out.println(e.get("Gender"));
    System.out.println(e.get("FName"));
    System.out.println(e.get("LName"));
    System.out.println(e.get("Day"));
    System.out.println(e.get("Month"));
    System.out.println(e.get("Year"));
    System.out.println(e.get("Email"));
    System.out.println(e.get("Pass"));
}
    }



    @When("click on register button on the page")
    public void click_on_register_button_on_the_page() {
        System.out.println("#########3able to click on register button");
    }



    @Then("a new account should be created")
    public void a_new_account_should_be_created() {
        System.out.println("########Account  created");
    }






}
