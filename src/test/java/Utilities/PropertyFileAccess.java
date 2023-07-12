package Utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileAccess {
	
	public static Properties prop() throws IOException {
		
		Properties property = new Properties();
		FileReader stream = new FileReader("./src/test/java/Resource/Inputs.properties");
		property.load(stream);
		return property;
	}

}
