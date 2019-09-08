package ui.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ui.common.PageObject;

public class CucumberPage extends PageObject{
	
	@FindBy(xpath="//a[text()='Gmail']")
	WebElement feelLucky;
	
	public CucumberPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void launchGoogle() {
		driver.get("https://www.google.com");
	}
	
	public void clickLucky() throws InterruptedException {
		feelLucky.click();
		Thread.sleep(10000);
	}

}
