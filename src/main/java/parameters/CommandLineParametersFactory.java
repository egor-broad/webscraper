package parameters;

import arguments.Argument;
import arguments.CalculateSpentTimeArg;
import arguments.CountCharsArg;
import arguments.CountWordsArg;
import arguments.ExactSentenseArg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 * This class is a factory for Parameters objects.
 * It parses the command line arguments entered by the user, checks them for validity, loads the necessary data.
 * Then it constructs the Parameters object and populates it with Arguments.
 */
public class CommandLineParametersFactory implements ParametersFactory {

    public Parameters createParameters(String... args) {
        if (args == null || args.length < 2) {
            // TODO: log error: parameters could not be created
            return null;
        }

        Parameters parameters;

        if (args.length == 2) {
            parameters = new HelpParameters();
            return parameters;
        }

        String sourceData = extractSourceData(args[0]);
        String[] wordsToSearch = args[1].split(",");
        Set<Argument> arguments = new HashSet<Argument>();

        for (int i = 2; i < args.length; i++) {
            Argument argument = null;
            switch (args[i].charAt(1)) {
                case 'v':
                    argument = new CalculateSpentTimeArg();
                    break;
                case 'w':
                    argument = new CountWordsArg();
                    break;
                case 'c':
                    argument = new CountCharsArg();
                    break;
                case 'e':
                    argument = new ExactSentenseArg();
                    break;
                default:
                    // TODO: log warning
                    break;
            }
            if (argument != null) {
                arguments.add(argument);
            }
        }

        parameters = new CommandLineParameters(sourceData, wordsToSearch, arguments);

        return parameters;
    }

    private String extractSourceData(String arg) {
        // TODO: logic
        if (arg.startsWith("http")) {
            return fetchDataFromWebSite(arg);
        }
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(arg))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (FileNotFoundException e) {
            // TODO: log error
            return null;
        } catch (IOException e) {
            // TODO: log error
            return null;
        }
        return builder.toString();
    }

    private String fetchDataFromWebSite(String arg) {
        // TODO: maybe later
        return null;
    }
}
