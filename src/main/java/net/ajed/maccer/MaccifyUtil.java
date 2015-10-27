package net.ajed.maccer;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.util.Map;

/**
 * Created by Andrew on 27-Oct-15.
 */
public class MaccifyUtil {

    public static String convertMacToListOfAlternatives(String JSONString){
        //Temp vars for types
        String inputMac = null;
        String dots = null;
        String dashes = null;
        String colons = null;
        String upper = null;
        String lower = null;

        //Unwrap the JSON Object
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(JSONString);
            Map mappy = (Map)obj;
            inputMac = mappy.get("mac").toString();
        } catch (ParseException e) {
            // Thrown if parser can't parse real JSON - means you've POST-ed garbage
            e.printStackTrace();
        } catch (ClassCastException e) {
            // Thrown if you POST an array instead of an object with key and value pair
            e.printStackTrace();
        }

        //TODO: Implement conversions

        if (inputMac != null){
            // Do some conversions!
        }

        // Then add them all into a JSON object...
        JSONObject ret=new JSONObject();
        ret.put("mac","foo");


        return JSONValue.toJSONString(ret);
    }
}
