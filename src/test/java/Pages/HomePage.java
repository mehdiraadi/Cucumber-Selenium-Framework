package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by shahe on 14/11/2017.
 */
public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }



   // private static WebDriver driver =new FirefoxDriver();

    public HomePage dropDownMenu() {
        Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
        System.out.println(s);
        s.selectByValue("search-alias=stripbooks");
        return new HomePage(driver);

    }

    public HomePage searchBar(){
        WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("Diary of a wimpy kid");
        WebElement searchButton= driver.findElement(By.id("nav-search-submit-text"));
        searchButton.click();
        return new HomePage(driver);
    }
    public  void checkSearchResult(){
       WebElement searchResult= driver.findElement(By.xpath(".//*[@id='s-result-count']"));
       searchResult.getText();
       // String s= driver.
        //System.out.println(s);
              //  By.xpath(//h1[@id='s-result-count'])
        //String searchResult1 =searchResult.getText();
        //System.out.println(searchResult1);

    }

}


