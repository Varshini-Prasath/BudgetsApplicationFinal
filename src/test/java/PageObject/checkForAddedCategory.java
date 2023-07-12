package PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;

public class checkForAddedCategory {
	
	public WebDriver driver;
	public checkForAddedCategory(WebDriver drivers)
	{
		this.driver = drivers;
	}
	
	List<String> categories = new ArrayList<String>();
	By buttoncheck = By.cssSelector("div#ngb-panel-3-header");
	By dropDownCheck = By.cssSelector("div#ngb-panel-3");
	By moveToElements = By.cssSelector("div[id=\"ngb-panel-24-header\"]");
	
	
	public void find_Category(DataTable datatable) throws InterruptedException {
		Thread.sleep(4000);
		List<WebElement> categoryNames = driver.findElements(By.xpath("//div[contains(@class,\"col-lg-4\")]"));
		for (WebElement element: categoryNames) {
			categories.add(element.getAttribute("innerText"));
		}
		List<Map<String, String>> catagoryName = datatable.asMaps(String.class, String.class);
		Assert.assertTrue(categories.contains(catagoryName.get(0).get("CategoryName")));
		System.out.println(categories.contains(catagoryName.get(0).get("CategoryName")));
		System.out.println(categories);
	}
	
	public void amount_Logic() {
		driver.findElement(buttoncheck).click();
		Assert.assertTrue(driver.findElement(dropDownCheck).isDisplayed());
		System.out.println(driver.findElement(dropDownCheck).isDisplayed());
		Actions action = new Actions(driver);
		//action.scrollToElement(driver.findElement(moveToElements)).build().perform();
	}

}
