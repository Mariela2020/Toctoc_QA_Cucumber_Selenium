package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalleContratoPage extends BasePage {

     public DetalleContratoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/section/div/div[1]/h3[1]")
    private WebElement titledetalleContrato;
    private String titlePage26 = "TOCTOC.com Gestión Corredoras";

    @FindBy (xpath = "//*[@id=\"app\"]/div/div[4]/section/div/div[4]/div/a")
    private WebElement btnPagar;

    public boolean istitledetalleDisplayed() throws Exception {
        Thread.sleep(2000);
        return this.isDisplayed(titledetalleContrato) && this.getTitle().equals(titlePage26);
    }

    public void ClickOnbtnPagar() throws Exception {
        Thread.sleep(2000);
        this.click(btnPagar);
    }

}

