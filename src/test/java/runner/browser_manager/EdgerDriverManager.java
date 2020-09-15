package runner.browser_manager;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgerDriverManager extends DriverManager  {


    @Override
    protected void createDriver() {

        System.setProperty("webdriver.edge.driver", "src/test/resources/edgerdriver/MicrosoftWebDriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();

        }
}
