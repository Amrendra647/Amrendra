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

public class Test8 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("http://www.zlti.com");
		  

		  	String url = "";
	        	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	        for(int i=0;i<=links.size()-1;i++) {
	   		 	url=links.get(i).getAttribute("href");
	   		 	System.out.println(url);
	   		 	if(url==null || url.isEmpty()) {
	   		 		System.out.println("link is broken");
	   		 }
	   	  }
			Thread.sleep(2000);
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

	  @AfterTest
		 public void tearDown() throws Exception {
			driver.close();
	  }
  

}
