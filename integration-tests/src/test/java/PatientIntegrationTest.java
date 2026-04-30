import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsNull.notNullValue;

public class PatientIntegrationTest
{
    @BeforeAll
    public static void shouldReturnPatientsWithValidToken(){

        String loginPayload = """
            {
                "email":"testuser@test.com",
                "password":"password123"
            }      \s
       \s""";

       String token = given().contentType("application/json").body(loginPayload).when().post("/auth/login").then().statusCode(200).extract().jsonPath().get("token");

        given().header("Authorization", "Bearer"+ token).when().get("/api/patients").then().statusCode(200).body("patients", notNullValue());

    }

}
