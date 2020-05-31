package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.ConfigUrl;

public class AddCustomerPage extends ConfigUrl{
	private String idSelect = "switch-version-select";
	private String visibleText = "Bootstrap V4 Theme";
	private String customerButtonSelector = "#gcrud-search-form > div.header-tools > div.floatL.t5 > a";
	private String idName = "field-customerName";
	private String idLastName = "field-contactLastName";
	private String idFirstName = "field-contactFirstName";
	private String idPhone = "field-phone";
	private String idAdress1 = "field-addressLine1";
	private String idAdress2 = "field-addressLine2";
	private String idCity = "field-city";
	private String idState = "field-state";
	private String idPostalCode = "field-postalCode";
	private String idCountry = "field-country";
	private String xPathEmployeer = "*//div[2]/div/div/div/div[2]/form/div[11]/div/div/a";
	private String cssInputTextEmployeer = "#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]";
	private String xpathValueEmployeer = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li";
	private String idCredit = "field-creditLimit";
	private String buttonSave = "form-button-save";
	private String idSucess = "report-success";
	private String xpathTextSucess = "//div[2]/div/div/div/div[2]/form/div[14]/div[2]/p";
	public static String MSG = "Your data has been successfully stored into the database.";
	
	
	
	
	public AddCustomerPage(WebDriver driver) {
		super(driver);
	}
	
	public void alterVersion() {
		Select select = new Select(driver.findElement(By.id(idSelect)));
		select.selectByVisibleText(visibleText);
	}
	
	public void customerButton() {
		WebElement element =  driver.findElement(By.cssSelector(customerButtonSelector));
		element.click();
	}
	
	public void includeCustomer() {
		
		WebDriverWait waitName = new WebDriverWait(driver, 5);
		waitName.until(ExpectedConditions.visibilityOfElementLocated(By.id(idName)));
		
		driver.findElement(By.id(idName)).sendKeys("Teste Stefanini");
		
		driver.findElement(By.id(idLastName)).sendKeys("Teste");
		
		driver.findElement(By.id(idFirstName)).sendKeys("Raphael");
		
		driver.findElement(By.id(idPhone)).sendKeys("51 9999-9999");
		
		driver.findElement(By.id(idAdress1)).sendKeys("Av Bento, 6681");
		
		driver.findElement(By.id(idAdress2)).sendKeys("Teste address");
		
		driver.findElement(By.id(idCity)).sendKeys("Porto Alegre");
		
		driver.findElement(By.id(idState)).sendKeys("RS");
		
		driver.findElement(By.id(idPostalCode)).sendKeys("91000-000");
		
		driver.findElement(By.id(idCountry)).sendKeys("Brasil");
		
		
		driver.findElement(By.xpath(xPathEmployeer)).click();
		driver.findElement(By.cssSelector(cssInputTextEmployeer)).sendKeys("Fixter");
		driver.findElement(By.xpath(xpathValueEmployeer)).click();
		
		driver.findElement(By.id(idCredit)).sendKeys("200");
		
		
	}
	
	public void clickSave() {
		driver.findElement(By.id(buttonSave)).click();
	}

	public String valSucess() {
		WebDriverWait waitSucess = new WebDriverWait(driver, 5);
		waitSucess.until(ExpectedConditions.visibilityOfElementLocated(By.id(idSucess)));
		String sucess = driver.findElement(By.xpath(xpathTextSucess)).getText();
		String[] parttext = sucess.split(" Edit");
		String textsucess = parttext[0];
		return textsucess;
		
	}
	
	public void exitBrowser() {
		driver.quit();
	}
	
}
