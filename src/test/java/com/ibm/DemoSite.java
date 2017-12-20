package com.ibm;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class DemoSite {
	public static WebDriver driver = null;
	

	/*@When("^Client will launch the demo site$")
	public void client_will_launch_the_demo_site() throws Throwable {
		
			System.setProperty("webdriver.firefox.marionette","\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("New instant of firefox created.");
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//passing the url to the driver.
			driver.get("http://thedemosite.co.uk/addauser.php");
			driver.manage().window().maximize();

			System.out.println("Demo home page is displayed");
		
	}
	
	@When("^Enter username \"(.*)\"$")
	public void enter_Username(String UN) throws Throwable {
			//find the username text box and send data2
			driver.findElement(By.name("username")).sendKeys(UN);
			System.out.println("username is entered");
	}
	
	@When("^Enter password \"(.*)\"$")
	public void enter_Password(String PW) throws Throwable {
			//find the password textbox and send password
			driver.findElement(By.name("password")).sendKeys(PW);
			System.out.println("password is entered");
	}
	
		
	@When("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
			//Click on the save button
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.findElement(By.name("FormsButton2")).click();
			System.out.println("Click on the save button.");
	
	}
			
			
			
	@Then("^Validate username \"(.*)\" & password \"(.*)\"$")
	public void validate_username_and_password(String UN, String PW) throws Throwable {
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					System.out.println("UserName from feature file :"+UN);
					System.out.println("Password from feature file :"+PW);
					String A="The username: "+UN;
					String B="The password: "+PW;
					String ExpectedResult =A+"\n"+B; 
					String ActialResult=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText();
					System.out.println("ExpectedResult from feature file :\n"+ExpectedResult);
					System.out.println("Actual result from Demo Site :\n"+ActialResult);
					ActialResult.equals(ExpectedResult);
	}
		

	@Then("^Close the firefox window$")
	public void close_the_firefox_window() throws Throwable {
					//Close the driver
					driver.quit();
					System.out.println("firefox is closed.");

	}*/
	
	@When("^Client will launch the demo site$")
	public void client_will_launch_the_demo_site() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters the following data$")
	public void user_enters_the_following_data(DataTable arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		System.out.println(arg1.raw());
		
	}
}
