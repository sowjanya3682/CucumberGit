package stepGlue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	
	@When("Larry searches for products in the search field")
	public void larry_searches_for_products_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		for(String plist: pro_list) {
		//System.out.println(plist);
		driver.findElement(By .name("products")).sendKeys(plist);
		String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
		System.out.println(str);
		driver.findElement(By .name("products")).clear();
		}
		
	}

	@Then("Larry verifies")
	public void larry_verifies() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	@Given("sales executive logged into the machine")
	public void sales_executive_logged_into_the_machine() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=Drivers.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 
	}

	@When("Sales executive {string} and {string} as credentials")
	public void sales_executive_and_as_credentials(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
		 driver.findElement(By .name("userName")).sendKeys(string);
		 driver.findElement(By .name("password")).sendKeys(string2);
		 driver.findElement(By .name("Cancel")).click();
		 driver.quit();
	}
	
	@Given("Alex is existing customer")
	public void alex_is_existing_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("He has good purchase record with store")
	public void he_has_good_purchase_record_with_store() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Alex provides his moblie no")
	public void alex_provides_his_moblie_no() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Alex should get registration success")
	public void alex_should_get_registration_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Alex purchased of a microwave for {int} dollars")
	public void alex_purchased_of_a_microwave_for_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Alex has a receipt")
	public void alex_has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	}

	@When("Alex returns the faulty microwave")
	public void alex_returns_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Alex got refunded of {int} dollars")
	public void alex_got_refunded_of_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Then("Login is success")
	public void login_is_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	
	@Given("executive is at signup registration")
	public void executive_is_at_signup_registration() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("executive provides {string} and {string}")
	public void executive_provides_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("signup successful")
	public void signup_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("executive added the items to cart")
	public void executive_added_the_items_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("items price is calculated")
	public void items_price_is_calculated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("bill is generated with final amount")
	public void bill_is_generated_with_final_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
