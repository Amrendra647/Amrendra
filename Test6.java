package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test6 {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		  
		  Dimension dm = new Dimension(450,630);
	      //Setting the current window to that dimension
	      driver.manage().window().setSize(dm);
		  //WebElement dropdown = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button"));
		  //dropdown.click();
		  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
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
