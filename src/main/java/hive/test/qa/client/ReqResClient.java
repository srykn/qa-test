package hive.test.qa.client;

import hive.test.qa.model.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ReqResClient {

	private static String REQ_RES_HOST = "https://reqres.in/";

    private static String LOGIN_API = "api/login";

    public Response login(String email, String password){
    	Response response = given().contentType(ContentType.JSON).body(new User(email, password)).post(REQ_RES_HOST + LOGIN_API);
        return response;
    }

}
