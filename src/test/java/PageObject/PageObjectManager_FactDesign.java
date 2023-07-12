package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager_FactDesign {
	
	public WebDriver driver;
	public PageObjectManager_FactDesign(WebDriver driverInit) {
		this.driver = driverInit;
	}
	
	public CategoryPageObject Category() {
		CategoryPageObject categories = new CategoryPageObject(this.driver);
		return categories;
	}
	
	public checkForAddedCategory checkForCategory() {
		checkForAddedCategory checkCategory = new checkForAddedCategory(this.driver);
		return checkCategory;
	}

}
