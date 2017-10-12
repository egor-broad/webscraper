package arguments;

import parameters.Parameters;
import parameters.WorkParameters;

import java.io.PrintStream;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 */
public class CountCharsArg implements Argument {
    public void apply(WorkParameters parameters, PrintStream stream) {
        stream.println("Number of characters: " + parameters.getSourceData().length());
    }
}
