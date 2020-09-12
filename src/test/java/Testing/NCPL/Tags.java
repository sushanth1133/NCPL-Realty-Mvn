package Testing.NCPL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tags {
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
	public void checkTagsBuyNsellNtoleaseNforLease() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[4]/div[2]/div/div/div/div[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[4]/div[2]/div/div/div/div[2]/a")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[1]/a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[3]/div[2]/div/div/div/div[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[3]/div[2]/div/div/div/div[2]/a")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[1]/a")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/a")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"respMenu\"]/li[1]/a")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[1]/div[2]/div/div/div/div[2]/a")));
		driver.findElement(By.xpath("//*[@id=\"bs_carousel\"]/div[1]/div[1]/div[2]/div/div/div/div[2]/a")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);;
	}

	@Test(priority = 2)
	public void whyChooseUs() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"why-chose\"]/div/div[2]/div[1]/div"))).build()
				.perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"why-chose\"]/div/div[2]/div[2]/div"))).build()
				.perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"why-chose\"]/div/div[2]/div[3]/div")))
				.build().perform();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void services() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[1]"))).build()
				.perform();
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[1]"))).click()
				.build().perform();
		Thread.sleep(3000);
		String forSellers = driver.getTitle();
		assertEquals("Selling - NCPL Realty | Real Estate in Andhra Pradesh", forSellers);
		System.out.println(forSellers);
		driver.navigate().back();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[2]"))).build()
				.perform();
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[2]"))).click()
				.build().perform();
		Thread.sleep(3000);
		String forBuyers = driver.getTitle();
		assertEquals("Buying - NCPL Realty | Real Estate in Andhra Pradesh", forBuyers);
		System.out.println(forBuyers);
		driver.navigate().back();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[3]"))).build()
				.perform();
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[3]"))).click()
				.build().perform();
		Thread.sleep(3000);
		String forLease = driver.getTitle();
		assertEquals("Lease a property - NCPL Realty | Real Estate in Andhra Pradesh", forLease);
		System.out.println(forLease);
		driver.navigate().back();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[4]"))).build()
				.perform();
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[4]"))).click()
				.build().perform();
		Thread.sleep(3000);
		String toLease = driver.getTitle();
		assertNotEquals("Conditions to Lease a property - NCPL Realty | Real Estate in Andhra Pradesh", toLease);
		System.out.println(toLease);
		driver.navigate().back();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[5]"))).build()
				.perform();
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[5]"))).click()
				.build().perform();
		Thread.sleep(3000);
		String counselling = driver.getTitle();
		assertEquals("Counselling - NCPL Realty | Real Estate in Andhra Pradesh", counselling);
		System.out.println(counselling);
		driver.navigate().back();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[6]"))).build()
				.perform();
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[3]/div/div[2]/div[6]"))).click()
				.build().perform();
		Thread.sleep(3000);
		String legalOpinion = driver.getTitle();
		assertEquals("Legal Opinion - NCPL Realty | Real Estate in Andhra Pradesh", legalOpinion);
		System.out.println(legalOpinion);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void testimonials() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[2]"))).build().perform();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[2]"))).click().build().perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[3]/span"))).build().perform();	
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[3]/span"))).click().build().perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[4]/span"))).build().perform();	
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[4]/span"))).click().build().perform();
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[5]/span"))).build().perform();	
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"our-testimonials\"]/div/div[2]/div/div/div[2]/div[2]/div[5]/span"))).click().build().perform();

	}
	
	@Test(priority = 5)
	public void contactUs() throws InterruptedException
	{
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[7]/div/div/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[8]/div/div/div[4]/div/ul/li[1]/a/i"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[8]/div/div/div[4]/div/ul/li[1]/a/i"))).click().build().perform();
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[8]/div/div/div[4]/div/ul/li[2]/a/i"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"mm-0\"]/section[8]/div/div/div[4]/div/ul/li[2]/a/i"))).click().build().perform();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
	}

	@AfterTest
	public void closeTheDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
