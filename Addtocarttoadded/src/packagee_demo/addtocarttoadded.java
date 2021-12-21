package packagee_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addtocarttoadded 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
		
	@BeforeTest
	public void setup() 
	{
			System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
	}
	
	@Test
	public void Cauliflower() throws Exception 
	{
		WebElement buttons = driver.findElement(By.xpath("//*[@alt='Cauliflower - 1 Kg']/following::button[1]"));
		buttons.click();
		Thread.sleep(2000);
		System.out.println(buttons.getText());
		if(buttons.getText().contains("ADDED"))
		{
			System.out.println("Value Matched contains ADDED");
					
		}
		else
		{
			System.out.println("Value doesn't Matched");	
		}
	}
		
	@Test
	public void Brocolli() throws Exception 
	{
		WebElement buttons = driver.findElement(By.xpath("//*[@alt='Brocolli - 1 Kg']/following::button[1]"));
		buttons.click();
		Thread.sleep(2000);
		System.out.println(buttons.getText());
		if(buttons.getText().contains("ADDED"))
		{
			System.out.println("Value Matched contains ADDED");
			
		}
		else
		{
			System.out.println("Value doesn't Matched");	
		}
	}
	
	@Test
	public void Cucumber() throws Exception 
	{
		WebElement buttons = driver.findElement(By.xpath("//*[@alt='Cucumber - 1 Kg']/following::button[1]"));
		buttons.click();
		Thread.sleep(2000);
		System.out.println(buttons.getText());
		if(buttons.getText().contains("ADDED"))
		{
			System.out.println("Value Matched contains ADDED");
			
		}
		else
		{
			System.out.println("Value doesn't Matched");	
		}
	}
	
	@Test
	public void Beetroot() throws Exception 
	{
		WebElement buttons = driver.findElement(By.xpath("//*[@alt='Beetroot - 1 Kg']/following::button[1]"));
		buttons.click();
		Thread.sleep(2000);
		System.out.println(buttons.getText());
		if(buttons.getText().contains("ADDED"))
		{
			System.out.println("Value Matched contains ADDED");
			
		}
		else
		{
			System.out.println("Value doesn't Matched");	
		}
	}
	
	
	
	@AfterTest
	public void finish() 
	{
	driver.quit();
	}	
}
