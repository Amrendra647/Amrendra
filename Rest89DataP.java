package Amrendra.Pal;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.DataProvider;

public class Rest89DataP {
  @Test(dataProvider="SearchProvider")
  public void f(String id) {
	  RestAssured.baseURI = "https://api.stripe.com/";
      RestAssured.basePath = "v1";
             
              // Get the RequestSpecification of the request that you want to sent to the server
              // The server is specified by the BaseURI that we have specified in the above step
             
              RequestSpecification request = RestAssured.given();
              request.auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "");
             
              request.header("Accept","application/application/x-www-form-urlencoded");
              request.contentType(ContentType.JSON);
	               
	                

     
  io.restassured.response.Response  response = request.get("/customers/"+id);
  String responseBody = response.getBody().prettyPrint();
	}
	  
 


  
  @DataProvider (name = "SearchProvider")
  public Object[][] getDataFromDataprovider(){
  return new Object[][]
  		{	
  	
          { "cus_IezuboJRtOFAYk" },
          { "cus_IezvkQeCbmg3xj" }
         
    
	
	};
  }
}
