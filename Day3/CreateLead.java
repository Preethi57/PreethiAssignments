package week2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	
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
			driver.findElement( By.linkText("Leads")).click();
			driver.findElement( By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Preethi");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Murali");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TechLead");
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(5000);
			

			String title=driver.getTitle();
			System.out.println("Title of the browser "+ title);
			
			driver.close();
			
	}

}
