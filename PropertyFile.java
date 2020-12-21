package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PropertyFile {
	private Properties properties;
	 private final String propertyFilePath= "config//config.properties";
	 
	WebDriver driver;
	  @Test
	  public void f() throws IOException {
		  //Below line creates an object of Properties called 'prop'
	  Properties prop = new Properties();
	  //Below line creates an object of FileInputStream called 'fi'. Give the path of the properties file which you have created
	  FileInputStream fi = new FileInputStream("config/config.properties");
	  //Below line of code will load the property file
	  prop.load(fi);
	  driver.get(prop.getProperty("url"));
	  //Maximize the window 
	  driver.manage().window().maximize();
	  
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
