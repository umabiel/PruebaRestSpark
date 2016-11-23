/**
 * Created by guxor on 11/23/16.
 */

import static spark.Spark.*;

public class PruebaRest {
    public static void main(String[] args) {
        get("/rest", (req, res) -> "Hola Rest!");
    }
}
