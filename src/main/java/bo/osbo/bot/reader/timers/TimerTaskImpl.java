package bo.osbo.bot.reader.timers;

import bo.osbo.bot.reader.process.BotProcessUpdates;
import java.util.Date;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author programmercito
 */
public class TimerTaskImpl extends TimerTask {

    public static int i = 0;
    int offset = 0;

    @Override
    public void run() {
        System.out.println("Updates in " + (new Date()) + " - " + ++i);
        BotProcessUpdates bot = new BotProcessUpdates();
        offset = bot.process(offset);
    }

}
