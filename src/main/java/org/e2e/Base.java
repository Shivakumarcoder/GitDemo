package org.e2e;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Base {
	
	
	public WebDriver driver;
	@Test
	public void initializeDriver() throws IOException {
		
		//if it is in chrome invoke chrome, firefox, IE
		//Created the global environment file to provide the browsers as input
		
		Properties prop = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\mgpsh\\eclipse-workspace\\E2EProjects\\src\\main\\java\\org\\e2e\\data.properties");
		prop.load(f);
		String browser = prop.getProperty("browser");
		
		//if browser = chrome execute below
		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser=="firefox") {
			
		}
		
		
	}

}
