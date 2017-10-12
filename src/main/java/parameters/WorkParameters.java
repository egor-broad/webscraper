package parameters;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 * This interface represents a command which works on some text data.
 * It can be executed and writes its execution results to a PrintStream.
 *
 */
public interface WorkParameters extends Parameters {
    String getSourceData();
    String[] getWordsToSearch();
}
