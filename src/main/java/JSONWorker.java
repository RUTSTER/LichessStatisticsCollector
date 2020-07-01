import org.json.JSONObject;

public class JSONWorker {

    public String parseJSON(String jsonString) {
        JSONObject jsonObj = new JSONObject(jsonString);
        JSONObject blitzGamesJsonObj = jsonObj.getJSONObject("perfs").getJSONObject("blitz");
        int gamesNumber = blitzGamesJsonObj.getInt("games");
        int rating = blitzGamesJsonObj.getInt("rating");
        return gamesNumber + ":" + rating;
    }
}
