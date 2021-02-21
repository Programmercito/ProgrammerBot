package bo.osbo.bot.reader;

import bo.osbo.bot.reader.timers.TimerTaskImpl;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author programmercito
 */
public class ReaderBot {

    public static void main(String[] args) {
        TimerTask tasknew = new TimerTaskImpl();
        Timer timer = new Timer();
        timer.schedule(tasknew, 0,1000);
    }

}
