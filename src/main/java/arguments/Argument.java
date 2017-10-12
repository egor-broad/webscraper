package arguments;

import parameters.WorkParameters;

import java.io.PrintStream;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 * This interface represents a command line argument flag.
 * It can use data from Parameters object and executes some logic, writing the results to the provided PrintStream.
 */
public interface Argument {
    void apply(WorkParameters parameters, PrintStream stream);
}
