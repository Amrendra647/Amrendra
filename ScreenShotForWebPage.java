package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScreenShotForWebPage {
	
	WebDriver driver;
	  @Test
	  public void f() throws IOException {
		  driver.get("https://api.jquery.com/dblclick/");
		  File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:\\TestcaseSS\\ScreenShot.png"));
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
