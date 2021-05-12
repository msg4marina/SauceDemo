package pages;

import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public abstract class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }

}
