import parameters.Parameters;

import java.io.PrintStream;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 */
public class Scraper {

    private PrintStream stream;

    public void processCommand(Parameters parameters) {
        parameters.execute(stream);
    }

    public void setStream(PrintStream stream) {
        this.stream = stream;
    }
}
