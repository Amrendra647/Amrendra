package Amrendra.Pal;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import okhttp3.Response;
import static io.restassured.RestAssured.*;
public class Rest2 {
  @Test
  public void f() {
	// TODO Auto-generated method stub
			//io.restassured.response.Response response;
	        // Make a request to the server by specifying the method Type and the method URL.
	        // This will return the Response from the server. Store the response in a reference variable created above.
	       
//	        response = RestAssured.get("http://10.82.48.225:8081/EDUBank/AccountAPI/getAccount?accountNumber=443328602688019");
			RestAssured.baseURI = "https://api.stripe.com/";
	        RestAssured.basePath = "v1";
	               
	                // Get the RequestSpecification of the request that you want to sent to the server
	                // The server is specified by the BaseURI that we have specified in the above step
	               
	                RequestSpecification request = RestAssured.given();
	                request.auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc", "");
	               
	                request.header("Accept","application/application/x-www-form-urlencoded");
	                request.contentType(ContentType.JSON);
		               
		                

	       
	    io.restassured.response.Response  response = request.get("/customers/cus_IezuboJRtOFAYk");
	       
	        //print the message body of the response received from the server
	       // String responseBody = response.getBody().prettyPrint();
		}
	
  }

