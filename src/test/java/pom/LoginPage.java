package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#app > div > div > div.row.align-self-center > div.col-md.col-sm-6 > div:nth-child(1) > h3")
    private WebElement registerPageLocator;
    private String titlePage7 = "TOCTOC.com Gestión Corredoras";

    @FindBy(id = "email")
    private By emailLocator;

    @FindBy(name ="password")
    private By passwordLocator;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/button")
    private WebElement btningresar;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isImagenDisplayed3() throws Exception {
        return this.isDisplayed(registerPageLocator) && this.getTitle().equals(titlePage7);
    }

    public void typeEmailLocator() throws Exception {
        clear(" ", By.id("email"));
       // type("glori.sierra@hotmail.com", By.id("email"));
        type("hurtadomariela2@gmail.com", By.id("email"));
     }

    public void typePasswordLocator() throws Exception {

        clear(" ", By.name("password"));
        Thread.sleep(3000);
       // type("cuchufi",By.name("password"));
        type("prueba",By.name("password"));
    }

    public void ClickOnIngresar() throws Exception {
        this.click(btningresar);
    }


}
