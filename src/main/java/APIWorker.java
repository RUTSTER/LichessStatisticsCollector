import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIWorker {

    public String getStatistics(String personalAccessToken) throws IOException {
        URL url = new URL("https://lichess.org/api/account");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", "Bearer " + personalAccessToken);

        return getResponse(connection);
    }

    private String getResponse(HttpURLConnection connection) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String newInput;
        StringBuilder content = new StringBuilder();
        while ((newInput = reader.readLine()) != null) {
            content.append(newInput);
        }
        reader.close();
        return content.toString();
    }
}