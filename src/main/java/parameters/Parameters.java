package parameters;

import java.io.PrintStream;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 * This interface represents a command which can be executed and writes its execution results to a PrintStream.
 */
public interface Parameters {
    void execute(PrintStream stream);
}
