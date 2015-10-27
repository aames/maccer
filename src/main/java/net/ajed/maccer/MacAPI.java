package net.ajed.maccer;

/**
 * Created by Andrew on 27-Oct-15.
 */
import static spark.Spark.*;

public class MacAPI {
    public MacAPI(){
        post("/maccify", (request, response) -> MaccifyUtil.convertMacToListOfAlternatives(request.body()));
    }
}
