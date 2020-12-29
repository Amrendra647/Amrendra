package Amrendra.Pal;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Rest7 {
  @Test
  public void f() {
	  
		
	  RestAssured.baseURI = "https://api.stripe.com/";
      RestAssured.basePath = "v1";
      
      /*Create a new customer*/
      Response response = given().formParam("name", "Amrendra").formParam("email", "Amrendra1005635@training.com")
                             .formParam("description", "Rest Assured Assign").header("Authorization","Bearer sk_test_nvzn8HiMPfyhxMT0xP99gpOL00HEKF2LPU")
                             .log().all()
                             .when()
                             .post("/customers");
                              System.out.println("Response Code : " +response.getStatusCode());
                              //response.prettyPrint();
                              Assert.assertEquals(response.getStatusCode() /*actual value*/, 200 /*expected value*/, "Correct status code returned");
                              JsonPath jp = response.jsonPath();
                              String id = jp.get("id");
                              System.out.println("ID OF THE POST REQUEST "+id);
	  
	  
	  
	  
	 /* ValidatableResponse vResponse =  given().log().all()
			  
              .header("Authorization","Bearer sk_test_nvzn8HiMPfyhxMT0xP99gpOL00HEKF2LPU")
              .when()
              .get("/customers/" +id)
              .then()
              .log().all()
              .statusCode(200)
              .statusLine("HTTP/1.1 200 OK")
             
              .body("name", Matchers.equalTo("Amrendra"));*/
                              
                              //Validating text from response
                              String responseBody = response.getBody().asString();
                              Assert.assertEquals(responseBody.contains("Martin") /*Expected value*/, true /*Actual Value*/, "Response body does not contain martin");
	 
	  
              
  }

  }

