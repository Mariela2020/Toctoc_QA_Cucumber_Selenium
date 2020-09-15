package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    private WebDriver driver;
    private List WebElement;

    public BasePage(WebDriver driver) {
         this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento:" + element);
        }
    }

    public void click(WebElement element) throws Exception {
        try {
            element.click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento:" + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento:" + element);
        }
    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try {
           return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento:" + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
           return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento:" + element);
        }
    }

    public String getText(WebElement element) throws Exception {
        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento:" + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver");
        }
    }

    public void type(String inputText, By element) throws Exception {
        try {
            driver.findElement(element).sendKeys(inputText);
        }catch (Exception e){
            throw new Exception("No se pudo escribir el texto sobre el elemento:" + element);
        }
    }

    void clear(String s, By element) throws Exception {
        try {
            driver.findElement(element).clear();
        } catch (Exception e) {
            throw new Exception("No se pudo limpliar el elemento:" + element);
        }
    }

   public List<org.openqa.selenium.WebElement> getWebElement(WebElement element) throws Exception {
        try {
            return driver.findElements((By) getWebElement(element));
            }catch (Exception e){
            throw new Exception("No se pudo seleccionar el elemento de la lista:" + element);
            }
        }

    public boolean setSelect(WebElement element) throws Exception {
        try{
            return element.isSelected();
        }catch (Exception e){
            throw new Exception("No esta marcado el checkbox: " + element);
        }
    }
}
