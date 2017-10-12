package arguments;

import parameters.Parameters;
import parameters.WorkParameters;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 */
public class CountWordsArg implements Argument {
    public void apply(WorkParameters parameters, PrintStream stream) {
        String[] dataLowerCase = parameters.getSourceData().toLowerCase().split("[\\.\\,\\s]");
        for (String word: parameters.getWordsToSearch()) {
            String wordLowerCase = word.toLowerCase();
            int count = 0;
            for(String textWord: dataLowerCase) {
                if (textWord.equals(wordLowerCase)) {
                    count++;
                }
            }
            stream.printf("Occurences of %s: %d\n", word, count);
        }

    }
}
