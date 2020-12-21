package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PopupTest {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("http://demo.guru99.com/test/delete_customer.php");
		   driver.findElement(By.name("cusid")).sendKeys("545");
		   driver.findElement(By.name("submit")).click();
		   String pal = driver.switchTo().alert().getText();
		   
		   System.out.println(pal);
		   //driver.switchTo().alert().getText();
		   driver.switchTo().alert().accept();
		   Thread.sleep(1000);
		   
          String cal = driver.switchTo().alert().getText();
		   
		   System.out.println(cal);
		   //driver.switchTo().alert().getText();
		   driver.switchTo().alert().accept();
		   
		  
		  //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//  /html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button
			//Select b = new Select(dropdown);
			//b.selectByIndex(3);
			
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
