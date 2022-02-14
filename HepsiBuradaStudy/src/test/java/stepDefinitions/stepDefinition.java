package stepDefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class stepDefinition {
	WebDriver driver;
	//ChromeOptions options;
	
	public void setUp(){
		//options = new ChromeOptions();
		//options.addArguments("user-agent=Mozilla/5.0 (WghrXkuMnF) AppleWebKit/5.0 Chrome/8.0 Safari/5.0");	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zeynep Selçok\\eclipse-workspace\\HepsiBuradaStudy\\chromedriver.exe");
	}
	
	@Given("^User is on \"https://www.hepsiburada.com/\"$")
	public void hb_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hepsiburada.com/");
	}
	
	@When("^User search a product$")
	public void search_product() {
		WebElement product_text = driver.findElement(By.className("desktopOldAutosuggestTheme-input"));
		product_text.sendKeys("iphone 13 pro max");
		
		WebElement search_button = driver.findElement(By.className("SearchBoxOld-buttonContainer"));
		search_button.click();
	}

	@And("^User select a product$")
	public void select_product() {
		List<WebElement> elements = driver.findElements(By.className("productListContent-item"));	
		java.util.Iterator<WebElement> i = elements.iterator();
		
		while(i.hasNext()) {
		    WebElement element = i.next();
	    	
		    if (element.isDisplayed()) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		    	elements.get(0).click();
		    }
			break;
		}
	}
	
	@And("^User click \"Degerlendirmeler\" tab$")
	public void click_tab() {	
		
	}
	
	@And("^User click \"Evet\" button for first comment$")
	public void click_like_button() {

	}
	
	@Then("^User should be check message$")
	public void check_message() {

	}
	
	@Then("^Close browser$")
	public void close_browser() {
		driver.quit();
	}
	
}
