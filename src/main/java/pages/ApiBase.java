package pages;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class ApiBase {
	protected static String URI;
	
	
	public String baseUri(String baseuri, int status) {
		URI=baseuri;
		given()
		.relaxedHTTPSValidation()
		.get(URI)
		.then()
		.statusCode(status)
		.contentType(ContentType.JSON);	
		return URI;
	}
	
	public String validateMessage() {
		String message = "Requires authentication";
		return message;
	}
	
	public String validateDocumentation() {
		String documentation = "https://developer.github.com/v3/users/#get-the-authenticated-user"; 
		return documentation;
	}
}
