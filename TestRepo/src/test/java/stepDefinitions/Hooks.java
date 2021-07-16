package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@smokeTest")
	public void IntializetheBrowser() {
		System.out.println("Intialized sucessfully");
	}
	
	@After("@smokeTest")
	public void closeApplication() {
		System.out.println("Application is closed");
	}
	
	
	

}
