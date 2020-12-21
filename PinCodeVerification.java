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

public class PinCodeVerification {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("http://chennaiiq.com/chennai/pincode-by-name.php");
		 
		  List<WebElement> pinNumber = driver.findElements(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr/td[3]"));
		  int count = 0;
		  for(int i=1;i<(pinNumber.size()-1);i++) {
			  for(int j=i+1;j<=(pinNumber.size()-i);j++) {
				 if(pinNumber.get(i).getText().contentEquals(pinNumber.get(j).getText())){
					 System.out.println("Duplicate pin code present");
					 count+=1;
				 }
				 if(count>0) {
					 break;
				 }
			  }			  
			  if(count>0) {
				  break;
			  }
		  }
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
