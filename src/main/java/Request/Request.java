package Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import Main.Main;

public class Request {
    static String baseUrl = "http://localhost:8080/";
    public static String userID = "059bd12d-efaf-42f1-ab46-c8904f77ff5b";

    public static Response createUser(String bodyUser) {
        return RestAssured.given()
                .baseUri(baseUrl + "user")
                .body(bodyUser)
                .log()
                .body()
                .contentType(ContentType.JSON)
                .post(baseUrl + "user")
                .then()
                .log()
                .body()
                .extract()
                .response();
    }

    public static Response getUser(String getUser) {
        return RestAssured.given()
                .given().header("Authorization","c3VnYXJvazpwc3dyZDE=")
                .baseUri(baseUrl + "user/" + userID)
                .when()
                .contentType(ContentType.JSON)
                .get(baseUrl + "user/" + userID)
                .then()
                .log()
                .body()
                .extract()
                .response();
    }

}
