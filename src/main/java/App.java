import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class.getName());

    public String getGreeting() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        LOGGER.trace("Entering application.");

        LOGGER.warn("warn: Entering application.");

        LOGGER.trace(new App().getGreeting());

        LOGGER.trace("Exiting application.");


    }
}
