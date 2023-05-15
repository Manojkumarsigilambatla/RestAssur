package demo;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

import java.io.File;

public class SchemaValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //	https://dummy.restapiexample.com/api/v1/employee/1
		
		RestAssured.baseURI="https://dummy.restapiexample.com";
		given().pathParam("id",4).get("/api/v1/employee/{id}").then().log().all().assertThat().statusCode(200).body(JsonSchemaValidator.matchesJsonSchema(new File("C:\\Users\\MSIGILAM\\eclipse-workspace2\\DemoRestAssured\\JsonSchema.json")));

	}

}
