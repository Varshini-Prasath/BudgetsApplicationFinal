package PageObject;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;

public class CategoryPageObject {
	
	public WebDriver driver;
	String categoryPopUpValue = "Add a new category";
	String categoryNames = "Name of the category";
	String categoryAmountValue = "Maximum monthly budget";
	String categoryDescValue = "Description";
	List<WebElement> transtypeCollection = new ArrayList<WebElement>();
	List<String> defaultValue = new ArrayList<String>();
	
	public CategoryPageObject(WebDriver driverSetUp) {
		this.driver = driverSetUp;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy (css= "svg[data-icon=\"circle-plus\"]") 
	WebElement addIcon;
	@FindBy (xpath = "//button[text()=\"Category\"]")
	WebElement categoryOption;
	@FindBy(xpath = "//div[text()=\" Add a new category \"]")
	WebElement categoryPopUpText;
	@FindBy(css = "input[name=\"catName\"]")
	WebElement categoryName;
	@FindBy(css = "input[name=\"categoryMaxBudget\"]")
	WebElement categoryAmount;
	@FindBy(css = "textarea[name=\"categoryDescription\"]")
	WebElement categoryDescription;
	@FindBy(css = " select[name=\"transactionType\"]" )
	WebElement transcationType;
	@FindBy(xpath = "//button[text()=\"Add\"]")
	WebElement addButton;
	
	public void selectAddClickCategory() {
		addIcon.click();
		categoryOption.click();
	}
	
	public void checkCategoryPopUp() {
		String value = categoryPopUpText.getAttribute("innerText");
		assertEquals(value, categoryPopUpValue);
		System.out.println(value);
	}
	
	public void enter_Valid_Category_Option(String string,int num, String string2) {
		String nameValue = categoryName.getAttribute("placeholder");
		assertEquals(nameValue,categoryNames);
		System.out.println(nameValue);
		categoryName.sendKeys(string);
		
		String amountValue = categoryAmount.getAttribute("placeholder");
		assertEquals(amountValue,categoryAmountValue);
		System.out.println(amountValue);
		categoryAmount.sendKeys(String.valueOf(num));
		
		String descValue = categoryDescription.getAttribute("placeholder");
		assertEquals(descValue, categoryDescValue );
		System.out.println(descValue);
		categoryDescription.sendKeys(string2);
		
		
	}
	
	public void check_Options_TransType(DataTable dataTable) {
		List<List<String>> dataTableValue = dataTable.asLists(String.class);
		int size = dataTableValue.size();
		String[] valueList = new String[size];
		
		for(List<String> row: dataTableValue) {
			for (String column: row) {
				defaultValue.add(column);
			}}
		
		Select  select = new Select(transcationType);
		transtypeCollection = select.getOptions();
		for(WebElement element:transtypeCollection) {
			String transvalue = element.getText();
			if(defaultValue.contains(transvalue)) 
			{
			System.out.println(defaultValue.contains(transvalue));
			}
			else {
				System.out.println("Calculation Mismatched");
			}}
//		//check for selected transType
//		String selectedValue = select.getFirstSelectedOption().getText();
//		assertEquals(selectedValue,"expense");
//		System.out.println(selectedValue);
	}
	
	public void click_Add_Button() throws InterruptedException {
		System.out.println(addButton.getCssValue("color"));
		addButton.click();
		Thread.sleep(3000);
	}
	
	
}
