package parameters;

import java.io.PrintStream;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 */
public class HelpParameters implements Parameters {
    private static final String HELP_MESSAGE =
            "Please use the Scraper with some of the possible arguments: –v, –w, –c, –e";

    public void execute(PrintStream stream) {
        stream.println(HELP_MESSAGE);
    }
}
