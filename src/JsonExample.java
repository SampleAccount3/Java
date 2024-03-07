import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JsonExample {

    public static void main(String[] args) {
        try {
            String urlString = "http://192.168.1.62:88/Wilcon.TSSS.Tablet/Request.aspx?function=custsearchbyname&name=ortega";

            // Read data from the URL
            String jsonData = readJsonFromUrl(urlString);

            // Parse the JSON data
            List<Customer> customerDataList = getCustomerList(jsonData);

            // Access the data as Java objects
            for (Customer customer : customerDataList) {
                // Write JSON data to a file for each customer
                writeJsonToFile(customer);
            }

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

    private static List<Customer> getCustomerList(String jsonData) {
        List<Customer> customerList = new ArrayList<>();
        // Parse the JSON array
        JSONArray jsonArray = new JSONArray(jsonData);

        // Iterate through each object in the array
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Customer customer = extractCustomerFromJson(jsonObject);
            customerList.add(customer);
        }

        return customerList;
    }

    private static Customer extractCustomerFromJson(JSONObject jsonObject) {
        Customer customer = new Customer();
        customer.setCustomerNumber(jsonObject.getString("CustomerNumber"));
        customer.setCustomerName(jsonObject.getString("CustomerName"));
        customer.setCustomerType(jsonObject.getString("CustomerType"));
        customer.setUserName(jsonObject.getString("UserName"));
        customer.setCompany(jsonObject.optString("Company", ""));
        customer.setAddress1(jsonObject.getString("Address1"));
        customer.setAddress2(jsonObject.getString("Address2"));
        customer.setAddress3(jsonObject.getString("Address3"));
        customer.setAddress4(jsonObject.getString("Address4"));
        customer.setPhone1(jsonObject.getString("Phone1"));
        customer.setPhone2(jsonObject.getString("Phone2"));
        customer.setIsVatExcempt(jsonObject.getString("IsVatExcempt"));
        customer.setPlace(jsonObject.getString("Place"));
        customer.setCity(jsonObject.getString("City"));
        customer.setFacsimileNumber(jsonObject.getString("FacsimileNumber"));
        customer.setReference1(jsonObject.getString("Reference1"));
        customer.setReference2(jsonObject.getString("Reference2"));
        customer.setEmail(jsonObject.getString("Email"));
        customer.setOurReference(jsonObject.getString("OurReference"));
        customer.setFreeField6(jsonObject.getString("FreeField6"));

        return customer;
    }

    private static void writeJsonToFile(Customer customer) throws IOException {
        try (FileWriter fileWriter = new FileWriter("output.json")) {
            // Write JSON data to a file for the given customer
            fileWriter.write(new JSONObject(customer).toString(4)); // The '4' is the number of spaces for indentation
        }
    }
}
