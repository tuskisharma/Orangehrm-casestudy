package orangehrm_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class code1 {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@BeforeTest
	public void BT()throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(enabled=true,priority=0)
	public void testcase1() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		
		
	}
	@Test(enabled=true,priority=1)
	public void testcase2() {
		List<WebElement> links=driver.findElements(By.tagName("a"));
		links.size();
		System.out.println("number of links are "+links.size());
		for (int i=0; i<links.size(); i++)
	      {
		 System.out.println(links.get(i).getText());
		 System.out.println(links.get(i).getAttribute("href"));
	       }
		
	}
	@Test(enabled=true,priority=2)
	public void testcase3() throws InterruptedException{
//		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[2]/a")).click();
	 //driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(2).click();
	 Thread.sleep(3000);
	 driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
	 Thread.sleep(3000);
	 driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(2).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	 Thread.sleep(3000);
	 
	}
	@Test(enabled=true,priority=3)
	public void testcase4() throws InterruptedException{
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		
	}
	@AfterTest
	public void AT() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
