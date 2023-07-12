package Utilities;


import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver {
	
	public static EdgeDriver driver() {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =  new EdgeDriver();	
		return driver;
	}
	

}
