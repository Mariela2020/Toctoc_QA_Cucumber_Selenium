package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageCorredor extends BasePage{

    //@FindBy(linkText = "Productos Marketing")
    @FindBy (xpath = "//*[@id=\"app\"]/div/div[3]/header/div/div/div[2]/div/a")
    private WebElement botonproductos;
    private String titlePage = "TOCTOC.com - Gestión corredor - Planes de publicación";

    @FindBy (xpath="//*[@id='app']/div/div[3]/header/div/div/div[2]/div/button")
    //@FindBy(linkText = "Ver Planes")
    private WebElement botonplanes;


    public HomePageCorredor(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titlePage);

    }

    public void clickOnProductos() throws Exception {
        this.click(botonproductos);
    }

    public boolean homePageIsDisplayed1() throws Exception {
        return this.getTitle().equals(titlePage);
    }

    public void clickOnPlanes() throws Exception {
        this.click(botonplanes);
    }

}
