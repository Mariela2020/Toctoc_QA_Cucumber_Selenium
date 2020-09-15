package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanPage extends BasePage {

    public PlanPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//*[@id=\"planes\"]")
    private WebElement tituloplanes;
    private String titlePage30 = "TOCTOC.com - Gestión corredor - Planes de publicación";

    @FindBy (xpath = "/html/body/div[1]/div/div[3]/section[2]/div/div/div[2]/h3")
    private WebElement planseleccionado;

    @FindBy (xpath = "//*[@id=\"planes\"]/div/div/div[4]/ul/li[9]/button")
    private WebElement botoncontratar;


    public boolean isImagenDisplayed6() throws Exception {
        return this.isDisplayed(tituloplanes) && this.getTitle().equals(titlePage30);
    }

    public void clickOnTarjetaPlan() throws Exception {
        //Thread.sleep(2000);
        this.click(planseleccionado);
    }

  //  public boolean isImagenDisplayed7() throws Exception {
  //      return this.isDisplayed(tituloplanes) && this.getTitle().equals(titlePage30);
  //  }

  //  public void ClickOnCoontratar() throws Exception {
  //      this.click(botoncontratar);
  //  }



}
