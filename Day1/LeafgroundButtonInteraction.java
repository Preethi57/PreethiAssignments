package week3.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Boolean status=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(status);
		
		WebElement submitButton=driver.findElement(By.xpath("//span[text()='Submit']"));
		Point location=submitButton.getLocation();
		System.out.println("location of the submit button is: "+location);
		 
	    WebElement button=driver.findElement(By.xpath("//span[text()='Save']"));
	    String bgColor=button.getCssValue("background-color");
	    System.out.println("Background colour of the button is: "+bgColor);
	    
	    WebElement button1=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));  
	    Dimension size=button1.getSize();
	    System.out.println("Height and width of the submit button is: "+size);
	    
	    driver.findElement(By.xpath("//span[text()='Click']")).click();  
		
	    String title=driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		if(title.equals("Dashboard")){
			System.out.println("Title matched successfully");
		}else {
				System.out.println("Title doesn't match");
		}
	    
	    driver.close();
	    
	    

	}
}


