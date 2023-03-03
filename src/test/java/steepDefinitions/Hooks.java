package steepDefinitions;

import functions.CreateDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {

    public static WebDriver driver;
    Logger log = Logger.getLogger(Hooks.class);
    Scenario scenario = null;

    @Before
    public void initDriver(Scenario scenario) throws IOException {
        log.info("#######");
        log.info("[ Configuration ] - Inicializando la configuracion del controlador");
        log.info("#######");
        driver = CreateDriver.initConfig();
        this.scenario = scenario;
        log.info("#######");
        log.info("[ Scenario ] - " + scenario.getName());
        log.info("#######");
    }

    @After
    public void  embedScreenshot(Scenario scenario) throws IOException{ log.info("#######");
        log.info("[ Driver Status ] - Limpiar y cerrar la instancia del controlador ");
        log.info("#######");
        driver.quit();

    }
}
