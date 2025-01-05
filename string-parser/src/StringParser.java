import java.util.HashMap;
import java.util.Map;

public class StringParser {

    public static void main(String[] args) {
        String response =
                "Language: English\nQuote: \"The only limit to our realization of tomorrow is our doubts " + "of" +
                        " " + "today" + ".\"\nCategory: Motivation";

        Map<String, String> quoteData = parseResponseFromLLM(response);

        ObjectFromLLM quoteObject = new ObjectFromLLM(quoteData.get("Language"), quoteData.get("Quote"),
                quoteData.get("Category"));

        System.out.println(quoteObject.toString());
    }

    public static Map<String, String> parseResponseFromLLM(String response) {
        String[] lines = response.split("\n");

        Map<String, String> parsedResponse = new HashMap<>();

        for (String line : lines) {
            String[] parts = line.split(":", 2); // split into label and value
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();
                parsedResponse.put(key, value);
            }
        }

        return parsedResponse;
    }
}
