package seleniumgluecode;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.SearchPage;

import org.junit.Assert;


public class test{
	
public WebDriver driver;
	@Given("^user is  on google searchpage$")
	public void user_is_on_google_searchpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/Arunthiru/Downloads/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
      	    
	}
	
	@When("^user clicks on search field$")
	public void user_clicks_on_search_field() throws Throwable {
		SearchPage sp= new SearchPage(driver);
		sp.Searchfield().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@When("^user enters TechBeacon$")
	public void user_enters_TechBeacon() throws Throwable {
		SearchPage sp= new SearchPage(driver);
		sp.Searchfield().sendKeys("TechBeacon");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		sp.Searchfield().sendKeys(Keys.ENTER);
		//sp.Googlesearch().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    

	}

	@And("^select the third item from the google search results$")
	public void select_thirditem_googleresults() throws Throwable {
		 SearchPage sp= new SearchPage(driver);
		 sp.Thirdresult().click();
		 String URL = driver.getCurrentUrl();
		 Assert.assertEquals(URL,"https://twitter.com/hashtag/techbeacon");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.quit();
	      
	    
	}

   
      
}
