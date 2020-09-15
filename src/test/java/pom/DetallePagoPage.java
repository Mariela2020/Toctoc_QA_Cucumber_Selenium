package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetallePagoPage extends BasePage {

    public DetallePagoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/h1")
    private WebElement titledetallepago;
    private String titlePage27 = "Pago de servicios";

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[1]/p")
    private WebElement tcredito;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/p")
    private WebElement twebpay;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[3]/p")
    private WebElement transferencia;

    public boolean istitledetallepagoDisplayed() throws Exception {
        //Thread.sleep(2000);
        return this.isDisplayed(titledetallepago) && this.getTitle().equals(titlePage27);
    }

    public void ClickOnbformapago() throws Exception {
        this.click(twebpay);
    }


}
