package Amrendra.Pal;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Rest3 {
  @Test
  public void f() {
	  RestAssured.baseURI = "https://api.stripe.com/";
      RestAssured.basePath = "v1";
      
      /*Create a new customer*/
      Response response = given().formParam("name", "Rest Assured").formParam("email", "RestAssured28@training.com")
                             .formParam("description", "Rest Assured Training").header("Authorization","Bearer sk_test_nvzn8HiMPfyhxMT0xP99gpOL00HEKF2LPU")
                             .log().all()
                             .when()
                             .post("/customers");
                              System.out.println("Response Code : " +response.getStatusCode());
                              response.prettyPrint();
                              
                              JsonPath jp = response.jsonPath();
                              String id = jp.get("id");
                              System.out.println("ID OF THE POST REQUEST "+id);
                              
      /*Retrieve created customer*/                        
      Response response1 = given().header("Authorization","Bearer sk_test_nvzn8HiMPfyhxMT0xP99gpOL00HEKF2LPU")
                              .log().all()
                                 .when()
                              .get("/customers/" +id);
                               System.out.println("Response Code : " +response1.getStatusCode());
                               response1.prettyPrint();
  }
}
