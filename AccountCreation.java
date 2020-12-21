package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AccountCreation {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("https://accounts.google.com/signup");
		  List<WebElement> list=driver.findElements(By.tagName("input"));
		  // Iterate over the list and search for the input text box for creating the google account
		  for(int i=0;i<=list.size()-1;i++) {
			  if(list.get(i).getAttribute("id").contentEquals("firstName")){
				  list.get(i).sendKeys("Amrendra");
			  }
			  if(list.get(i).getAttribute("id").contentEquals("lastName")) {
				  list.get(i).sendKeys("Pal");

			  }
			  if(list.get(i).getAttribute("id").contentEquals("username")) {
				  list.get(i).sendKeys("Kittu181218");

			  }
			  if(list.get(i).getAttribute("name").contentEquals("Passwd")) {
				  list.get(i).sendKeys("HanuMan@647");

			  }
			  if(list.get(i).getAttribute("name").contentEquals("ConfirmPasswd")) {
				  list.get(i).sendKeys("HanuMan@647");

			  }
		  }
		  driver.findElement(By.xpath("//button[contains(@class,'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc')]")).click();
		  Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[contains(@class,'whsOnd zHQkBf')]")).sendKeys("7305528486");
		  Thread.sleep(2000);		 
	  }
		  //WebElement dropdown = driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button"));
		  //dropdown.click();
		  //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//  /html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button
			//Select b = new Select(dropdown);
			//b.selectByIndex(3);
			
	  
	  
	  
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
