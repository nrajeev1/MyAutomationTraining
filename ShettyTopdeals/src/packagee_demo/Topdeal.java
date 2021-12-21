package packagee_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topdeal
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
	public void Topdealclick() throws Exception
	{
		WebElement buttons = driver.findElement(By.xpath("//div//a[@href='#/offers']"));
		buttons.click();
				//Thread.sleep(2000);
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));
				WebElement search = driver.findElement(By.xpath("//input[@id='search-field']"));
				search.sendKeys("Tomato");
	}
	
	@Test
	public void tomato() throws Exception
	{
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-bordered']//tr"));
		String columfirst = "//table[@class='table table-bordered']//tr[";
		String columlast = "]//td";
		String column;
		List<WebElement> tablecolumns;
		for (int i=1;i<tableRows.size();i++)
		{
			column = columfirst+i+columlast;
			tablecolumns=driver.findElements(By.xpath(column));
			for (int j=0;j<tablecolumns.size();j++)
			{
				System.out.print(tablecolumns.get(j).getText()+" ");
			}
			System.out.println();
		}
	}
	
	@AfterTest
	public void finish() 
	{
	driver.quit();
	}	
}
