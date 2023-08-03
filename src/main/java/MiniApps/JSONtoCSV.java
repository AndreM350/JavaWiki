package MiniApps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoCSV {

    public static void main(String[] args) {

        String jsonString = "{\"atributo1\": \"valor1\", \"atributo2\": \"valor2\", \"atributo3\": \"valor3\", \"atributo4\": null}";
        String result = convertJSONToString(jsonString);
        System.out.println(result);

    }

    public static String convertJSONToString(String jsonString) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            StringBuilder stringBuilder = new StringBuilder();

            jsonNode.fields().forEachRemaining(entry -> {

                String value;

                if (entry.getValue().isNull()){
                    value = "";
                }else {
                    value = entry.getValue().asText();
                }
                stringBuilder.append(value).append(";");
            });

            return stringBuilder.toString();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
