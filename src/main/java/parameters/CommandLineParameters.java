package parameters;

import arguments.Argument;

import java.io.PrintStream;
import java.util.Set;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 * This class represents a set of command line parameters and arguments entered by the user.
 * It keeps the data loaded from some source and applies the arguments to the data.
 */
public class CommandLineParameters implements WorkParameters {

    private final String sourceData;
    private final String[] wordsToSearch;
    private final Set<Argument> arguments;

    protected CommandLineParameters(String sourceData, String[] wordsToSearch, Set<Argument> arguments) {
        this.sourceData = sourceData;
        this.wordsToSearch = wordsToSearch;
        this.arguments = arguments;
    }

    public void execute(PrintStream stream) {
        for(Argument argument: arguments) {
            argument.apply(this, stream);
        }
    }

    public String getSourceData() {
        return sourceData;
    }

    public String[] getWordsToSearch() {
        return wordsToSearch;
    }
}
