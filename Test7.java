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

public class Test7 {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("http://demo.guru99.com/test/delete_customer.php");
		  //WebElement dropdown = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button"));
		  //dropdown.click();
		  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//  /html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button
			//Select b = new Select(dropdown);
			//b.selectByIndex(3);
		  
		 // WebDriver driver = new ChromeDriver();

		  //JavascriptExecutor executor = (JavascriptExecutor)driver;

		 // executor.executeScript("document.getElementByname("cusid").value='55545'";)
		  
		  WebElement name=driver.findElement(By.name("cusid"));
		  ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='545'",name); 
		  
			
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
