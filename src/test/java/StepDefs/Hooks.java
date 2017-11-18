package StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by shahe on 14/11/2017.
 */
public class Hooks {

    private static  WebDriver driver;

    private String baseUrl="http://www.amazon.co.uk";

    //@Before

    public  void initializeTest(){
        System.out.println("Open the browser");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\shahe\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

   // @After

    public void tearDown(){

        System.out.println("close the browser");
        driver.close();




    }
}
