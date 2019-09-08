package ui.common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject extends ConfigProperties {
	
	public PageObject() {
		try {
			InitProperties();
			loadDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
  public static WebDriver driver=null;
	
  
  public static void loadDriver() {  
	   
	   if(driver==null) {
		   String driverName = prop.getProperty("browser");
	   if(driverName==null) {
		   driverName="chrome";
	   }
	   String driverPath=System.getProperty("user.dir");
	   File f = new File(driverPath+"//libs");
	   if("chrome".equalsIgnoreCase(driverName)&&f.exists()) {
			try {
				System.setProperty("webdriver.chrome.driver", new File(".").getCanonicalPath()+"\\libs\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	   }
	  
  }
  
  public static void driverQuit() {
	  driver.quit();
  }
	
	
}
