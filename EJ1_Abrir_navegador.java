package AutomatizacionFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio1 {

	public static void main(String[] args) {
		String exePath = "C:\\dchrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
