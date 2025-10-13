package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Preethi");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("preethismurali@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("aeiou");
		
		WebElement day=driver.findElement(By.id("day"));
		Select option=new Select(day);
		option.selectByIndex(6);
		
		WebElement month=driver.findElement(By.id("month"));
		Select optn=new Select(month);
		optn.selectByVisibleText("Jul");
		
		WebElement year=driver.findElement(By.id("year"));
		Select opt=new Select(year);
		opt.selectByValue("2000");
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
        gender.click();
        
        Thread.sleep(3000);
	}
	

}
