import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
public class JsonExample {

    public static void main(String[] args) {
        try {
            String urlString = "http://192.168.1.51:88/Wilcon.TSSS.Tablet/Request.aspx?function=validatetimestamp&unix=1709803758";

            // Read data from the URL
            String jsonData = readJsonFromUrl(urlString);//jsonData = {"valid":"False"}

            // Parse the JSON data
            TimeStampObject timeStampObject = getTimeStampObjectFromJson(jsonData);

            // Access the data as Java objects
            System.out.println("Valid: " + timeStampObject.isValid());

            // Write JSON data to a file
            writeJsonToFile(new JSONObject(jsonData));
        } catch (IOException e) {
            e.printStackTrace(); // You might want to log the exception or provide a user-friendly message.
        }
    }

    private static String readJsonFromUrl(String urlString) throws IOException {
        URL url = new URL(urlString);

        try (InputStream inputStream = url.openStream()) {
            byte[] bytes = inputStream.readAllBytes();
            return new String(bytes, StandardCharsets.UTF_8);
        }
    }

    private static TimeStampObject getTimeStampObjectFromJson(String jsonData) {
        TimeStampObject timeStampObject = new TimeStampObject();

        JSONObject jsonObject = new JSONObject(jsonData);

        // Extract data from the JSON and set it in the Java object
        timeStampObject.setValid(jsonObject.getString("valid"));

        return timeStampObject;
    }

    private static void writeJsonToFile(JSONObject jsonObject) throws IOException {
        try (FileWriter fileWriter = new FileWriter("output.json")) {
            fileWriter.write(jsonObject.toString(4)); // The '4' is the number of spaces for indentation
        }
    }
}