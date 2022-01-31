package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Pegaloginpage 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	@BeforeTest
	@Parameters("browserName")
	    
	    public void setup(String browserName) 
	 	{
	        System.out.println("Browser name is : " + browserName);
	        System.out.println("Thread ID : "+ Thread.currentThread().getId());
	        if (browserName.equalsIgnoreCase("chrome")) 
	        {
	            System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
	            driver = new ChromeDriver();
	        } 
	        else if (browserName.equalsIgnoreCase("firefox")) 
	        {
	            System.setProperty("webdriver.gecko.driver", projectPath+"/Driver/geckodriver.exe");
	            driver = new FirefoxDriver();
	        } 
	        else if (browserName.equalsIgnoreCase("edge")) 
	        {
	            System.setProperty("webdriver.edge.driver", projectPath+"/Driver/msedgedriver.exe");
	            driver = new EdgeDriver();
	        }
	    }
	 
	@Test
	public void launch_app() throws Exception 
	{
		driver.get("https://pega-86-demo.iqzsystems.io/prweb/app/default/b0aUC_g2NnC90uEC3dhEbKXJdQTMkXeP*/!STANDARD");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(5000);
	}
	
	@Test (dependsOnMethods = "launch_app")
	public void enter_user() throws Exception 
	{
	WebElement username = driver.findElement(By.xpath("//input[@id='txtUserID']"));
	username.sendKeys("tcapron");
		//Thread.sleep(3000);
	}
	
	@Test (dependsOnMethods = "enter_user")
	public void enter_pswd() throws Exception 
	{
	WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	password.sendKeys("rules@123");
		//Thread.sleep(3000);
	}
	
	@Test (dependsOnMethods = "enter_pswd")
	public void clicklogin() throws Exception 
	{
	WebElement loginbutton = driver.findElement(By.xpath("//button[@id='sub']"));
	loginbutton.click();
		//Thread.sleep(3000);
	}
	
	@Test (dependsOnMethods = "clicklogin")
	public void get_title() throws Exception 
	{
		System.out.println("Page title is : " + driver.getTitle());
		//Thread.sleep(3000);
	}
	
	@Test (dependsOnMethods = "get_title")
	public void Create_individuallead() throws Exception 
	{
		WebElement createaddition = driver.findElement(By.xpath("//a//span[1]//span[@class='menu-item-icon-imageclass pi pi-plus']"));
		createaddition.click();
		WebElement clickcreate = driver.findElement(By.xpath("//span[text()='Individual Lead']"));
		clickcreate.click();
	}
	
	@Test (dependsOnMethods = "Create_individuallead")
	public void newindividualleadmodal() throws Exception 
	{
		WebElement lastname = driver.findElement(By.id("6e54da89"));
		lastname.sendKeys("TestName1");
		Select stage = new Select(driver.findElement(By.name("$PpyWorkPage$pLeadStage")));
		stage.selectByVisibleText("Sales Qualified");
		WebElement submit = driver.findElement(By.name("pyCaseActionAreaButtons_pyWorkPage_15"));
		submit.click();
				
	}
	
	@Test (dependsOnMethods = "newindividualleadmodal")
	public void editindividuallead() throws Exception 
	{
		WebElement editbutton = driver.findElement(By.xpath("//body/div[5]/main[1]/div[1]/form[1]/div[3]/div[1]/section[1]/div[1]/span[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]"));
		editbutton.click();
	}
	
	@Test (dependsOnMethods = "editindividuallead")
	public void updateindividuallead() throws Exception 
	{
		WebElement firstname = driver.findElement(By.id("546ad300"));
		firstname.sendKeys("TestFirstName1");
		WebElement lastname = driver.findElement(By.id("6e54da89"));
		lastname.clear();
		lastname.sendKeys("TestNameNEW");
		Select stage = new Select(driver.findElement(By.name("$PpyWorkPage$pLeadStage")));
		stage.selectByVisibleText("Marketing Qualified");
		WebElement submit = driver.findElement(By.name("pyCaseActionAreaButtons_pyWorkPage_15"));
		submit.click();
	}
	
	@Test (dependsOnMethods = "updateindividuallead")
	public void convertlead() throws Exception 
	{
		WebElement clickaction = driver.findElement(By.xpath("//body/div[5]/main[1]/div[1]/form[1]/div[3]/div[1]/section[1]/div[1]/span[1]/div[1]/span[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/span[1]/button[1]"));
		clickaction.click();
		WebElement convertlead = driver.findElement(By.xpath("//span[contains(text(),'Convert lead')]"));
		convertlead.click();
	}
	
	@Test (dependsOnMethods = "convertlead")
	public void convertleadmodal() throws Exception 
	{
		WebElement Opportunityname = driver.findElement(By.id("8dcd183b"));
		Opportunityname.sendKeys("Opportunitytest");
		WebElement amount = driver.findElement(By.id("1dfe6fd2"));
		amount.sendKeys("12345");
		WebElement datepicker = driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]/img[1]"));
		datepicker.click();
		WebElement dateclick = driver.findElement(By.xpath("//tbody/tr[6]/td[1]/a[1]"));
		dateclick.click();
		WebElement clicksubmit = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		clicksubmit.click();
	}
	
	@AfterTest
	public void finish() 
	{
		driver.quit();
		System.out.println("Test is successful");
	}
}