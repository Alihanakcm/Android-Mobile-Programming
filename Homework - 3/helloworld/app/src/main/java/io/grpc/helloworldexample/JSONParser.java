package io.grpc.helloworldexample;

import android.util.Log;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONParser {


    public JSONParser() {

    }

    public JsonObject getJSONFromUrl(String message) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\"");
        for (char word : message.toCharArray()) {
            if (word != ' ')
                stringBuilder.append(word);
            else
                stringBuilder.append("\" : \"");
        }
        stringBuilder.append("\"}");

        try {
            if (message != null)
                return (JsonObject) JsonParser.parseString(stringBuilder.toString());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
