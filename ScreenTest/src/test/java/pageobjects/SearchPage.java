package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
		
	 WebDriver driver;
	 public SearchPage(WebDriver driver) {
		 this.driver=driver;
	 }

	//Common
	By searchfield =By.xpath("//input[@title='Search']");
	By googlesearch =By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/div/center/input[1]");
	By thirdresult=By.xpath("(//h3[@class='LC20lb'])[3]");
//	
	
	
	public WebElement Searchfield()
	
	{
		return driver.findElement(searchfield);
	}
	
public WebElement Googlesearch()
	
	{
		return driver.findElement(googlesearch);
	}

public WebElement Thirdresult()

{
	return driver.findElement(thirdresult);
}

}
