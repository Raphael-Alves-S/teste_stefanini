package teste_api;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.restassured.response.Response;
import pages.ApiBase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestApi extends ApiBase{
	
	
	@Test
	public void a_validarUri() {
		baseUri("https://api.github.com/", 200);		
	}	

	@Test
	public void b_pegarNovaURI() {
		Response response =
		given()
	    .get(URI)
		.then()
		.extract().response();
		final String uri = response.jsonPath().getString("current_user_url");
		URI = uri;
	}
	
	@Test
	public void c_validarValores() {
		Response response =
		given()
	    .get(URI)
		.then()
		.extract().response();
		final String message = response.jsonPath().getString("message");
		assertEquals(validateMessage(), message);	
	}	
	
	@Test
	public void d_validarValores() {
		Response response =
		given()
	    .get(URI)
		.then()
		.extract().response();
		final String documetation = response.jsonPath().getString("documentation_url");
		assertEquals(validateDocumentation(), documetation);	
	}
	
}
