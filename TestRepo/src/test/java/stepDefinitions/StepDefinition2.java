package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition2 {
	 @Given("^user is on Pay credit card page$")
	    public void user_is_on_pay_credit_card_page(){
	       System.out.println("Credit card page is launched");
	    }

	    @When("^user fills all details and select Minimum amount option$")
	    public void user_fills_all_details_and_select_minimum_amount_option(){
	    	System.out.println("User entered credi card details");
	    }

	    @Then("^Credit Card confirmation page is displayed$")
	    public void credit_card_confirmation_page_is_displayed(){
	    	System.out.println("Credit card confirmation page is displayed");
	    }

	    @And("^User clicks on Pay button$")
	    public void user_clicks_on_pay_button(){
	    	System.out.println("User clicked on Pay button");
	    }
	    
	    @When("^user fills \"([^\"]*)\" details and select Minimum amount option and enter amount as \"([^\"]*)\"$")
	    public void user_fills_something_details_and_select_minimum_amount_option_and_enter_amount_as_something(String name, String amount){
	        System.out.println(name);
	        System.out.println(amount);
	    }
	    
	    @Given("user is on registeration page")
	    public void user_is_on_registeration_page() {
	        System.out.println("User is on Registration page");
	    }
	    @When("user enters following details")
	    public void user_enters_following_details(DataTable dataTable) {
	        List<List<String>> obj=dataTable.asLists();
	        System.out.println(obj.get(0).get(0));
	        System.out.println(obj.get(0).get(1));
	        System.out.println(obj.get(0).get(2));
	        System.out.println(obj.get(0).get(3));
	        System.out.println(obj.get(0).get(4));
	        System.out.println(obj.get(0).get(5));
	    }
	    @When("user clicks on register button")
	    public void user_clicks_on_register_button() {
	        System.out.println("User clicked on Register button");
	    }
	    @Then("Registration sucessful popup is displayed")
	    public void registration_sucessful_popup_is_displayed() {
	        System.out.println("Registration popup is displayed");
	    }
	    
	    @When("^user fill (.+) details and enter amount as (.+)$")
	    public void user_fills_details_and_select_minimum_amount_option_and_enter_amount_as(String name, String amount){
	       System.out.println(name);
	       System.out.println(amount);
	    }
	    
	    @Given("^user intializing the browser$")
	    public void user_intializing_the_browser(){
	        System.out.println("Chrome browser is intialized");
	    }

	    @When("^user navigates to URL$")
	    public void user_navigates_to_url(){
	        System.out.println("User is navigated to the url");
	    }

	    @Then("^Application is launched sucessfully$")
	    public void application_is_launched_sucessfully(){
	        System.out.println("Apllication is displayed");
	    }

}
