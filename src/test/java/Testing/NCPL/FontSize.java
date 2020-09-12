package Testing.NCPL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FontSize {

	WebDriver driver;

	@BeforeTest
	public void webdriverInitalization() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\susha\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ncplrealty-v2.ncplportal.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void fontSizeOfTitles()
	{
		WebElement home = driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[1]/a"));
		home.click();
		System.out.println("Clicked On ----   Home\nHome Page Font Size is: " + driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[2]/a")).getCssValue("font-size"));
		WebElement aboutUs = driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[5]/a/span"));
		aboutUs.click();
		System.out.println("Clicked On ----   AboutUs\nAboutUs Page Font Size is: " + driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[2]/a")).getCssValue("font-size"));		
		WebElement Services = driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[3]/a"));
		Services.click();
		System.out.println("Clicked On ----   Services\nServices Page Font Size is: " + driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[2]/a")).getCssValue("font-size"));
		WebElement Charges = driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[3]/a"));
		Charges.click();
		System.out.println("Clicked On ----   Charges\nCharges Page Font Size is: " + driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[3]/a")).getCssValue("font-size"));
		WebElement Contact = driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[3]/a"));
		Contact.click();
		System.out.println("Clicked On ----   Contact\nContact Page Font Size is: " + driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[5]/a/span")).getCssValue("font-size"));
	}
	
	@AfterTest
	public void closeTheDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
