package arguments;

import parameters.WorkParameters;

import java.io.PrintStream;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 */
public interface Argument {
    void apply(WorkParameters parameters, PrintStream stream);
}
