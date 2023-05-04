package maven.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maenexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\babbi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drier = new ChromeDriver();
		drier.manage().window().maximize();
		
		drier.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.9.0");
		

	}

}
