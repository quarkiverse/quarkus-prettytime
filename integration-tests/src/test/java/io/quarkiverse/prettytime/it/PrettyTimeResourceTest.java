package io.quarkiverse.prettytime.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PrettyTimeResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/prettyTime")
                .then()
                .statusCode(200)
                .body(containsString("moments"));
    }
}
