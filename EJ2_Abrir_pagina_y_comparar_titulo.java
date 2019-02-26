package AutomatizacionFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio3 {

	public static void main(String[] args) {
		String dpath = "C:\\dchrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver driver = new ChromeDriver();
		String url = "https://www.youtube.com";
		driver.get(url);
		String titulo = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + titulo);
		String urlactual = driver.getCurrentUrl();
		if (urlactual.equals(url)) {
			System.out.println("La pagina abierta es la correcta");
		}else{
			System.out.println("La pagina abierta es incorrecta");
			System.out.println("Url actual es: " + urlactual);
			System.out.println("Url esperada es:" + url);
			}
			
		driver.close();
		}
}