package week2.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager ");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement( By.className("decorativeSubmit")).click();
		
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Preethi");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement dd1=driver.findElement(By.name("industryEnumId"));
		Select option=new Select(dd1);
		option.selectByIndex(3);
		
		WebElement dd2=driver.findElement(By.name("ownershipEnumId"));
		Select opt=new Select(dd2);
		opt.selectByVisibleText("S-Corporation");
		
		WebElement dd3=driver.findElement(By.name("dataSourceId"));
		Select optn=new Select(dd3);
		optn.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dd4=driver.findElement(By.id("marketingCampaignId"));
		Select op=new Select(dd4);
		op.selectByIndex(6);
		
		WebElement dd5=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opn=new Select(dd5);
		opn.selectByValue("TX");
		
		
        driver.findElement(By.className("smallSubmit")).click();
        System.out.println("Account created succesfully");
        
        String accountName = driver.findElement(By.id("accountName")).getAttribute("value");
		System.out.println("Account Name: " + accountName);
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
