package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.PageObjectManager_FactDesign;

public class TestContainer {
	
	public ChromeDriver driver;
	public PageObjectManager_FactDesign pageObject;
	
	public TestContainer() {
		this.driver = WebDriver.driver();
		this.pageObject = new  PageObjectManager_FactDesign(this.driver);
	}
	
	
}
