package web.jeews;

import static spark.Spark.*;

public class WebJavaTry {

    public static void main(String[] args) {
        get("/hell", (req, res) -> "BURN IN THE FKING AGONY!");

        post("/hello", (request, response) ->
                "Hello World: " + request.body()
        );

        get("/private", (request, response) -> {
            response.status(401);
            return "DI NAHOOOY!";
        });

        get("/users/:name", (request, response) -> "Selected user: " + request.params(":name"));

        get("/news/:section", (request, response) -> {
            response.type("text/xml");
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><news>" + request.params("section") + "</news>";
        });

        get("/protected", (request, response) -> {
            halt(403, "I don't think so!!!");
            return null;
        });

        get("/redirect", (request, response) -> {
            response.redirect("/news/world");
            return null;
        });

        get("/", (request, response) -> "root");
    }
}

