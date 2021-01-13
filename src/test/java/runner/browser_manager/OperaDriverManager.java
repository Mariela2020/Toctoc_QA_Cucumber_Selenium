package runner.browser_manager;

import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverManager extends DriverManager {

    @Override
    protected void createDriver() {

       // System.setProperty("webdriver.opera.driver", "src/test/resources/iedriver/operadriver_win64/operadriver.exe");
        System.setProperty("webdriver.opera.driver", "src/test/resources/operadriver/operadriver.exe");
        driver = new OperaDriver();


    }

}
