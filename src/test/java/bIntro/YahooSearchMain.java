package test.java.bIntro;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchMain {	//clase publica YahooSearchMain
	

	public static void main(String[] args) {	//psvm
		//INICIALIZACION DE SYSTEM.SETPROPERTY()
	    WebDriver driver;	//declarar atributo de tipo WebDriver
		driver = new ChromeDriver();  //arranca el navegador, obvio Chrome
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS); //configura las esperas implicitas hasta 30 segundos
		driver.get("http://www.yahoo.com"); //navega a la url que le indiquemos
		WebElement searchBox = driver.findElement(By.id("header-search-input"));	//crea un objeto de tipo WebElement	llamado searchBox
		WebElement searchButton = driver.findElement(By.id("header-desktop-search-button"));	//crea un objeto de tipo WebElement	llamado searchButton
		
		searchBox.clear();	//limpiar searchBox
		searchBox.sendKeys("Selenium");	//enviar Selenium  a searchBox
		searchButton.click();	//dar Click en searchButton
		
		WebElement seleniumLink = driver.findElement(By.cssSelector("//h3[.='Selenium' and ./following-sibling::div[contains(.,'selenium.dev')] ] /a")); //declara objeto seleniumLink
		seleniumLink.click();	//click en SeleniumLink
		
		ArrayList<String> windowIds = new ArrayList<String>(driver.getWindowHandles());	//hace unobjeto de tipo lista de arreglos de tipo string llamado windowIds
		System.out.println("Number of windows: " + windowIds.size());	//imprime cadena y numero de windowIds
		
		for(String windowId: driver.getWindowHandles()) {	//ciclo de window ids, corre hasta que se acaba la lista de getWindowHandles 
			driver.switchTo().window(windowId);	//cambiar de ventana
		}
		
		WebElement downloadLink = driver.findElement(By.linkText("Downloads"));	//crea objeto downloadLink de tipo WebElement 
		downloadLink.click();	//click en download link
		
		driver.quit();	//quita todas las ventanas
		//driver.close	//cierra la ventana actual

	}

}
