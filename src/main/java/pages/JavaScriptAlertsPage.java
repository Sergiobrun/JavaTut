package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    public WebDriver driver;
    public By ClickJSSAlertbtn = By.xpath("//button[text()='Click for JS Alert']");
    public By results = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickClickJSAlertbtn(){
        driver.findElement(ClickJSSAlertbtn).click();
    }

    public void acceptAlertButton(){
        driver.switchTo().alert().accept();
    }

    public String getResultText(){
        return driver.findElement(results).getText();
    }

}
