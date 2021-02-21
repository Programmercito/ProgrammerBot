package bo.osbo.bot.reader.process;

import kong.unirest.Unirest;
import bo.osbo.bot.utils.PropertiesBot;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

/**
 *
 * @author programmercito
 */
public class BotReaderUpdates {

    public static HttpResponse<JsonNode> process(int offset) {
        PropertiesBot pb = new PropertiesBot();
        String direccion = pb.getDireccion() + "/getUpdates";
        HttpResponse<JsonNode> asJson = Unirest.get(direccion).queryString("offset", offset).asJson();
        return asJson;
    }

}
