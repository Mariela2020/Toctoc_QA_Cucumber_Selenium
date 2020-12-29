package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import runner.browser_manager.DriverManager;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(value = Cucumber.class)
@CucumberOptions(
                 features = "src/test/java/features",
                 glue = ("seleniumgluecode"),
                 plugin = {"json:test/report/cucumber_report.json"},
                 snippets = SnippetType.CAMELCASE,
                 tags = {"@producto"}

)

public class Testrunner {

    private static final Logger LOGGER = LogHelper.getLogger(Testrunner.class);

    @AfterClass
    public static void teardown(){

        try{
            LOGGER.log(Level.INFO, "Gererando reporte CI...");
            String[]cmd ={"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            LOGGER.log(Level.INFO, "Reporte generado satisfactoriamente PRUEBA !");
            } catch (Exception ex){
                LOGGER.log(Level.WARNING, "No se pudo generar el reporte.");
                ex.printStackTrace();
                }
    }
}
