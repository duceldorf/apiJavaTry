package web.jeews;

import static spark.Spark.*;

public class WebJavaTry {

    public static void main(String[] args) {
        get("/hell", (req, res) -> "BURN IN THE FKING AGONY!    ");

    }
}

