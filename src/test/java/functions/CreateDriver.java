package functions;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class CreateDriver {

    private static Properties properties = new Properties();
    private static InputStream inputStream = CreateDriver.class.getResourceAsStream("../testproperties");
    private static CreateDriver instance = null;


    public static WebDriver initConfig() throws IOException {
        WebDriver driver;

        try {
            log.info("#######");
            log.info(" [ POM configuration ] - Lee la configuracion de propiedades basicas del: ../test.properties");
            properties.load(inputStream);
            browser = properties.getProperty("browser");
            os = properties.getProperty("os");
            logLevel = properties.getProperty("logLevel");

        } catch (IOException e) {
            log.error("initConfig Error", e);
        }

        log.info(" [ POM Configuration ] - OS: " + os + " | Browser: " + browser + " | ");

    }
}
