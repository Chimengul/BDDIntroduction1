package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;

public class CalculatorSteps {
    public  Calculator calculator;
    public int total;

    @Before
    public  void init(){
        total=0;
    }

    @Given("I have a calculator")
    public void i_have_a_calculator() {
calculator=new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(int num1,int num2) {
        total=calculator.add(num1,num2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int result) {
        Assert.assertEquals(total,result);
    }


}
