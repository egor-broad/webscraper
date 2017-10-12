import parameters.CommandLineParametersFactory;
import parameters.Parameters;
import parameters.ParametersFactory;

/**
 * Created by Egor_Bobrov on 10/12/2017.
 */
public class ScraperApp {

    public static void main(String[] args) {
        Scraper scraper = new Scraper();
        scraper.setStream(System.out);
        ParametersFactory factory = new CommandLineParametersFactory();
        // String[] testArgs = {"C:\\Users\\Egor_Bobrov\\Desktop\\Stepic\\test.txt", "Java,to", "-c", "-w"};

        Parameters parameters = factory.createParameters(args);
        scraper.processCommand(parameters);
    }
}
