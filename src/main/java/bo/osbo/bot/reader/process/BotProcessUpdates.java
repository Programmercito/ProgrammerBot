package bo.osbo.bot.reader.process;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

/**
 *
 * @author programmercito
 */
public class BotProcessUpdates {

    public int process(int offset) {
        HttpResponse<JsonNode> process = BotReaderUpdates.process(offset);
        JsonNode body = process.getBody();
        JSONObject object = body.getObject();
        JSONArray jsonArray = object.getJSONArray("result");
        int resultadito = 0;
        int ta = jsonArray.length();
        for (int i = 0; i < ta; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Integer id = (Integer) jsonObject.get("update_id");
            resultadito = id;
            System.out.println(id);
            
        }
        return resultadito+1;
    }

}
