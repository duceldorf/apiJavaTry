package web.jeews;
import static spark.Spark.*;

public class WebJavaTry {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");

    }
}

