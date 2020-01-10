package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    public WebDriver driver;
    public By Example1 = By.linkText("Example 1: Element on page that is hidden");

    public DynamicLoadingPage(WebDriver driver){ this.driver = driver; }

    public void clickExample1(){
        driver.findElement(Example1).click();
    }



}
