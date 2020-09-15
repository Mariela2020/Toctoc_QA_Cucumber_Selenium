package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetalleContratoPlan extends BasePage{

    private WebDriver driver;

    public DetalleContratoPlan(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "//*[@id=\\\"app\\\"]/div/div[4]/section/div/div[1]/h3[2]")
    private By pasotresdetres;

    //@FindBy (css ="div.row:nth-child(1) > h3:nth-child(1)")
    @FindBy (xpath = "/html/body/div/div/div[4]/section/div/div[1]/h3[1]")
    private WebElement detallecontrato;
    private String titlePage59 = "TOCTOC.com Gestión Corredoras";

    @FindBy (css = ".modal-header > h3")
    private WebElement mensaje;

    @FindBy (className = "btn btn-danger button-comprar")
    private WebElement btnAcepatar;


    public boolean istitledetalleDisplayed9() throws Exception {
         Thread.sleep(5000);
         //driver.switchTo().frame("_hjRemoteVarsFrame");
         //WebDriverWait wait = new WebDriverWait(driver, 10);
         //WebElement detallecontrato;
         // detallecontrato = wait.<org.openqa.selenium.WebElement>until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[4]/section/div/div[1]/h3[1]")));

        //assert detallecontrato.isDisplayed();
        return this.isDisplayed(detallecontrato) && this.getTitle().equals(titlePage59);
        // return this.isDisplayed(detallecontrato);
    }

  // public void ClickOnbtnPagar() throws Exception {
    //    this.click(btnPagar);  selector boton pagar .btn > span
 //  }

}
