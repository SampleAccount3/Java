import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GetRequestExample {
    public static void GetRequest(String name) {
        try {
            // Specify the URL for the GET request
            String url = "http://192.168.1.51:88/Wilcon.TSSS.Tablet/Request.aspx?function=validatetimestamp&unix=";

            // Create a URL object
            URL apiUrl = new URL(url+name);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                    System.out.println();
                }
                // Close the connection
                connection.disconnect();
                System.out.println(response.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}