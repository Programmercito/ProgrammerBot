package bo.osbo.bot.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author properties
 */
public class PropertiesBot {

    private Properties appProps;

    public PropertiesBot() {
        try {
            appProps = new Properties();
            appProps.load(new FileInputStream("prop.properties"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropertiesBot.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error al cargar las propiedades");
        } catch (IOException ex) {
            Logger.getLogger(PropertiesBot.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error al cargar las propiedades");
        }
    }

    public String getDireccion() {
        String resultado = appProps.getProperty("url") + appProps.getProperty("keybot");
        return resultado;
    }
}
