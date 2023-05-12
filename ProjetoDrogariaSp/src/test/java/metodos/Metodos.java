package metodos;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos extends DriversFactory {

	public void abrirNavegador() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.drogariasaopaulo.com.br/");
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");

	}

	public void validarUrl(String texto) {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains(texto));
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
}