package Utility;



import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.cucumber.java.Scenario;

public class Log {
    // Initialize Log4j logs
    private final static Logger Log = LoggerFactory.getLogger(Log.class.getName());

    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

    public static void startTestCase(String sTestCaseName) {

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");

        Log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName + "       $$$$$$$$$$$$$$$$$$$$$$$$$");

        Log.info("****************************************************************************************");

        Log.info("****************************************************************************************");


    }

    //This is to print log for the ending of the test case

    public static void endTestCase(String sTestCaseName) {
        Log.info("******************************************************************************************");

        Log.info("******************************************************************************************");

        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

        Log.info("******************************************************************************************");

        Log.info("******************************************************************************************");


    }


    // Need to create these methods, so that they can be called

    public static void info(String message) {

        Log.info(message);

    }

    public static void warn(String message) {

        Log.warn(message);

    }

    public static void error(String message) {

        Log.error(message);

    }


    public static void debug(String message) {

        Log.debug(message);

    }


}
