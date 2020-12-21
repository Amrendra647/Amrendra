package Amrendra.Pal;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class DataProvider1 {
	
public  WebDriver driver;
    

    @BeforeTest
    public void setup(){
    	System.setProperty("webdriver.chrome.driver",
				"D:\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("https://google.com");
    }
 
    

    @Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws InterruptedException{
	    {
	      //  By driver = null;
			//WebElement searchText = driver.findElement((SearchContext) By.name("q"));
	    	WebElement searchText = driver.findElement(By.name("q"));
	        //search value in google searchbox
	        searchText.sendKeys(searchKey);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        AssertJUnit.assertTrue(testValue.equalsIgnoreCase(searchKey));
	    }
    }
    
    @AfterClass
    public void endTest()
	{
		
		driver.close();
	}
    
    @DataProvider (name = "SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][]
    		{	
    	
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
      
	
	};
    

}
}
