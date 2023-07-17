package Random;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddNewPlaceData;
import pojo.LocationChild;
import pojo.NewPlaceResponse;

public class AddPlaceTest {

	public static void main(String[] args) {
		AddPlaceTest a = new AddPlaceTest();
		a.addNewPlaceOnGoogle();

	}

	public void addNewPlaceOnGoogle() {

		AddNewPlaceData d = new AddNewPlaceData();
		LocationChild c = new LocationChild();

		c.setLat(-38.383494);
		c.setLng(33.427362);

		d.setLocation(c);

		d.setAccuracy(50);
		d.setName("Test Automation");
		d.setPhone_number("9876543210");
		d.setAddress("Noida sector 62");

		ArrayList<String> list = new ArrayList<>();
		list.add("shoe park");
		list.add("shop");

		d.setTypes(list);
		d.setWebsite("https://google.com");
		d.setLanguage("English");

		
	RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		 .addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
	
	  ResponseSpecification resp=   new ResponseSpecBuilder().expectStatusCode(200)
	    .build();

	NewPlaceResponse res=given().log().all().spec(req).body(d).when()
				.post("maps/api/place/add/json").then().log().all().assertThat().spec(resp).extract().response()
				.as(NewPlaceResponse.class);
	
	       String status= res.getStatus();
	       
	       SoftAssert s = new SoftAssert();
	        s.assertEquals(status, "OK1");
	          s.assertAll();
	       
	         String placeid=res.getPlace_id();
	         System.out.println(placeid);
	         String scope= res.getScope();
	         Assert.assertEquals("APP", scope); // Hard assert
	         System.out.println("Test");
	      
	         

	}

}
