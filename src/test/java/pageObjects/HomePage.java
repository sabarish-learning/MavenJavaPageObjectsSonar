package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	@FindBy(xpath = "//*[@id='masthead-search-term']")
    private WebElement searchBox;
	@FindBy(xpath = "//*[@id='search-btn']")
    private WebElement searchButton;
	
	public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
    public HomePage clickSearchBox() {
    	searchBox.click();
        return this;
    }
	
	public HomePage search(String contentToSearch) throws Exception{
		searchBox.click();
		searchBox.sendKeys(contentToSearch);
		Thread.sleep(3000);
		searchButton.click();
		return this;
    }

}
