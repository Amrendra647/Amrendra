package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Scroll {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("http://sparshv2/Pages/Home.aspx");
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;

	        
	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
	  }
	  
	  
	  @BeforeTest
	  public void beforeTest() {
				System.setProperty("webdriver.chrome.driver",
						"D:\\ChromeDriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		  
	  }

	 // @AfterTest
		 // public void tearDown() throws Exception {
			//	driver.close();
	  //}
  

}
