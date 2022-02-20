package API;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Homework21 {

    private final static String URL = "https://reqres.in/";

    @Test
    public void checkStatusCode() {
        Specification.installSpecification(Specification.requestSpecification(URL),
                Specification.responseSpecification(404));

        given()
                .when()
                .get("api/users/23")
                .then().log().all();
    }
}
