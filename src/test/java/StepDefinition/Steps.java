package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public static String driverPath = "c:\\Chromedriver\\Chromedriver.exe";
	ChromeDriver driver; 
	
	@Given("Abrir Chrome")
	public void abrir_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("En este paso abre el navegador de google -> chrome");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/evaluacion2/index.jsp");
	}

	@When("Ingresa username {string} y password {string}")
	public void ingresa_username_y_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("En este paso ingresa las credenciales de usuario");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		//driver.findElement(By.id("username")).sendKeys(string);
		//driver.findElement(By.id("password")).sendKeys(string2);
	}

	@Then("Inicia Sesion")
	public void inicia_sesion() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("En este paso inicia la sesion con los datos de archivo feature");
	    driver.findElement(By.id("loginbtn")).click();
		//driver.findElement(By.name("login")).click();
		
	}
}
