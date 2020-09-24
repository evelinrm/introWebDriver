package test.java.eClassExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazonSeleccionarMejorProducto {
	
	static WebDriver driver;
	public static void main(String[] args) {
		navegarUrl("https://amazon.com.mx");
		verificarHomePageAmazon();
		buscarProducto("HP Laptop");
		verificarListaProductos("HP");
		Articulo mejor = seleccionarMejorArticulo();
		verificarArticuloEnCarrito(mejor);
		cerrarBuscador();
	}
	
	private static void cerrarBuscador() {
		driver.quit();
		
	}

	private static void navegarUrl(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	private static void verificarHomePageAmazon() {
		driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		driver.findElement(By.cssSelector("[value=\"Ir\"]"));
	}
	private static void buscarProducto(String producto) {
		System.out.println("buscarProd");
		WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		WebElement searchButton = driver.findElement(By.cssSelector("[value=\'Ir\']"));
		searchBox.clear();
		searchBox.sendKeys(producto);
		searchButton.click();
	}
	private static void verificarListaProductos(String Productos) {
		
		
	}
	private static Articulo seleccionarMejorArticulo() {
		
		return null;
	}
	private static void verificarArticuloEnCarrito(Articulo mejor) {
		
		
	}
}
