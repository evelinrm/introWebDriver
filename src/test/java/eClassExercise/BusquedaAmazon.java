package test.java.eClassExercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusquedaAmazon {
	public static void main(String[] args) {
		
		//Navegar a amazon
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://amazon.com.mx");
				
		//Busqueda de producto
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("laptop HP");
		searchBox.submit();
		
		//Verificar lista de productos
		List<WebElement> productos = driver.findElements(By.partialLinkText("HP"));
		
		//Obtener los precios e Imprimirlos
		List<WebElement> precios = driver.findElements(By.cssSelector(".a-price-whole"));
		for(WebElement actual: precios) {
			System.out.println(actual.getText());
		}
		
					
		//driver.close();
		
	}
}
