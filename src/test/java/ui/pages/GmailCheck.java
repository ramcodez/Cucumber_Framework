package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ui.common.PageObject;

public class GmailCheck extends PageObject{

	public GmailCheck() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Privacy')]")
	WebElement privacy;
	
	public void clickPrivacy() throws InterruptedException {
		privacy.click();
		Thread.sleep(10000);
	}
	
}
