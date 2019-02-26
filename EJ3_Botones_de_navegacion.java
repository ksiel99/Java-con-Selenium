package AutomatizacionFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio4 {

	public static void main(String[] args) {
		String dpath = "C:\\dchrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver driver = new ChromeDriver();
		String abrirgoogle = "https://www.google.com";
		driver.get(abrirgoogle);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to(abrirgoogle);
		driver.navigate().refresh();
		driver.close();
	}

}
http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert