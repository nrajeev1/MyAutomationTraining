package packagee_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assignment18 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	int broctotal = 0;
	int checkouttotal = 0;
	int websitetotal1 = 0;		
	int cucutotal = 0;
	
	
	@BeforeTest
	public void setup() 
	{
			System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.manage().window().maximize();
	}
	
	@Test
	public void Brocolli() throws Exception 
	{
		int brocprice=0;
		WebElement brocname = driver.findElement(By.xpath("//*[@alt='Brocolli - 1 Kg']/following::h4[1]"));
		WebElement brocoliprice = driver.findElement(By.xpath("//*[@alt='Brocolli - 1 Kg']/following::p[1]"));
		WebElement brocqtyadd = driver.findElement(By.xpath("//*[@alt='Brocolli - 1 Kg']/following::a[2]"));
		brocprice = Integer.parseInt(brocoliprice.getText());
		broctotal = broctotal+brocprice;
		brocqtyadd.click();
		broctotal = broctotal+brocprice;
		WebElement brocbutton = driver.findElement(By.xpath("//*[@alt='Brocolli - 1 Kg']/following::button[1]"));
		brocbutton.click();
		Thread.sleep(5000);
		System.out.println(brocname.getText());
		System.out.println("Price = " + brocoliprice.getText());
		System.out.println("Total Price = " + broctotal);
	}
	
	@Test
	public void Cucumber() throws Exception 
	{
		int cucuprice=0;
		WebElement cucuname = driver.findElement(By.xpath("//*[@alt='Cucumber - 1 Kg']/following::h4[1]"));
		WebElement cucumprice = driver.findElement(By.xpath("//*[@alt='Cucumber - 1 Kg']/following::p[1]"));
		WebElement brocqtyadd = driver.findElement(By.xpath("//*[@alt='Cucumber - 1 Kg']/following::a[2]"));
		cucuprice = Integer.parseInt(cucumprice.getText());
		cucutotal = cucutotal+cucuprice;
		brocqtyadd.click();
		cucutotal = cucutotal+cucuprice;
		WebElement cucubutton = driver.findElement(By.xpath("//*[@alt='Cucumber - 1 Kg']/following::button[1]"));
		cucubutton.click();
		Thread.sleep(5000);
		System.out.println(cucuname.getText());
		System.out.println("Price = " + cucumprice.getText());
		System.out.println("Total Price = " + cucutotal);
	}
	
	@Test
	public void printveg() throws Exception 
	{
		WebElement addcartmain = driver.findElement(By.xpath("//a[@class='cart-icon']//img"));
		addcartmain.click();
		WebElement proceedtocheck = driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		proceedtocheck.click();
		checkouttotal = broctotal+cucutotal;
		System.out.println("CheckOutTotal = " + checkouttotal);
		Thread.sleep(5000);
		WebElement websitetotal = driver.findElement(By.xpath("//b[text()='Total After Discount : ']/following::span"));
		System.out.println("Total After Discount  = " + websitetotal.getText());
		websitetotal1 = Integer.parseInt(websitetotal.getText());
		Assert.assertEquals(checkouttotal, websitetotal1);
	}
		
	@AfterTest
	public void finish() 
	{
	driver.quit();
	}	
}
