package week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/.");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager ");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement( By.className("decorativeSubmit")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("label")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Preethi");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	driver.findElement(By.id("numberEmployees")).sendKeys("15");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	driver.findElement(By.className("smallSubmit")).click();
	
	String title=driver.getTitle();
	System.out.println("Title of the browser "+ title);
	
	driver.close();
	
	
	
	
	
	
	

	}

}
