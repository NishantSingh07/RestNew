package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestBase {
	
	@Test
	public void ReadProp() throws IOException {
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\test.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Name"));
				
	}
	
}

