package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Preethi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Murali");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Preethi");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation tester");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("preethi2000@testleaf.com");
		WebElement stateDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select dropdown = new Select(stateDropdown);
        dropdown.selectByVisibleText("Texas");
        driver.findElement(By.className("smallSubmit")).click(); 
        
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lead Form updated successfully");
        driver.findElement(By.className("smallSubmit")).click();
        
        String title = driver.getTitle();
        System.out.println("Resulting Page title: " + title);
        driver.close();


	}

}
