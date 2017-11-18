package StepDefs;

import Pages.HomePage;
import Pages.SearchResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by shahe on 14/11/2017.
 */
public class SearchStepdefs {
    WebDriver driver;
    HomePage homePage;
    SearchResultPage searchResultPage;
   // Hooks hooks;
    private String baseUrl="http://www.amazon.co.uk";


    @Given("^I navigate to amazon uk website$")
    public void iNavigateToAmazonUkWebsite() throws Throwable {
        System.out.println("I navigate to www.amazon.co.uk");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\shahe\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
        homePage=new HomePage(new FirefoxDriver());

        homePage.navigateTo();


        /*System.setProperty("webdriver.gecko.driver","C:\\Users\\shahe\\Downloads\\geckodriver-v0.16.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        //homePage.searchBar();

    }

    @And("^I choose \"([^\"]*)\" from dropdown menu$")
    public void iChooseFromDropdownMenu(String item) throws Throwable {

        System.out.println("I choose item"+item+" from dropdown menu");
       /* Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
        System.out.println(s);
        s.selectByValue("search-alias=stripbooks");*/

        homePage.dropDownMenu();

    }



    @Then("^The books in that series is displayed$")
    public void theBooksInThatSeriesIsDisplayed() throws Throwable {

        System.out.println("book in that series is displayed");
        /*WebElement searchResult= driver.findElement(By.id("s-result-count"));
        searchResult.getText().contains("diary of a wimpy kid");*/
        //
        //homePage.checkSearchResult();
        searchResultPage =new SearchResultPage(driver);
        searchResultPage.checkSearchResult();
    }

    @And("^I enter the book name \"([^\"]*)\"$")
    public void iEnterTheBookName(String arg0) throws Throwable {
        System.out.println("I enter the book name");
        homePage.searchBar();
        /*WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("Diary of a wimpy kid");
        WebElement searchButton= driver.findElement(By.id("nav-search-submit-text"));
        searchButton.click();*/
    }
}
