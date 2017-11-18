package Pages;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by shahe on 15/11/2017.
 */
public class BasePage {

    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage navigateTo() {
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\shahe\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
        driver.navigate().to("https://www.amazon.co.uk");
        //assertEquals("Symbiote", driver.getTitle());
        return new HomePage(driver);
   }

}
