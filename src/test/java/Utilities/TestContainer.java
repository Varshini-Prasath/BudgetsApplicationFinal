package Utilities;

import org.openqa.selenium.edge.EdgeDriver;
import PageObject.PageObjectManager_FactDesign;

public class TestContainer {
	
	public EdgeDriver driver;
	public PageObjectManager_FactDesign pageObject;
	
	public TestContainer() {
		this.driver = WebDriver.driver();
		this.pageObject = new  PageObjectManager_FactDesign(this.driver);
	}
	
	
}
