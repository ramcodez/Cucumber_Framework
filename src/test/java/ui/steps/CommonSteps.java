package ui.steps;


import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import ui.common.PageObject;
import ui.pages.CucumberPage;
import ui.pages.GmailCheck;

public class CommonSteps {
	
	CucumberPage cpage =new CucumberPage();
	GmailCheck gcheck = new GmailCheck();
	
	@Given("^I want to write a step with precondition$")
	public void cucumber_check() throws InterruptedException {
		System.out.println("In Cucumber framework");
		cpage.launchGoogle();
		cpage.clickLucky();
		gcheck.clickPrivacy();
	}
	
	@After
	public void exitDriver() {
		PageObject.driverQuit();
	}

}
