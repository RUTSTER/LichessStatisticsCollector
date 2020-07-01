import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        String personalAccessToken = "GOytCybFqf96znOQ";
        String statistics = (new APIWorker()).getStatistics(personalAccessToken);
        String result = (new JSONWorker()).parseJSON(statistics);
        System.out.println(result);
    }
}
