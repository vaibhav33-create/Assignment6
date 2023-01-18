package assignment6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("(//*[text()='-- Select --'])[1]")).click();
		List<WebElement> ee = driver.findElements(By.xpath("((//*[text()='-- Select --'])[1]//..//..//..//div)[5]"));
		//List<WebElement> ee = driver.findElements(By.xpath("//*[@placeholder='Type for hints...']"));
		
		for(WebElement aa : ee) {
			System.out.println(aa.getText());
			Thread.sleep(2000);
			String aaa = aa.getText();
			if(aaa.contains("Admin")) {
				aa.click();
			}
		}
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("a");
		Thread.sleep(5000);
List<WebElement> el = driver.findElements(By.xpath("(//*[text()='Employee Name']//..//..//..//div)[8]"));
		
		for(int i=0;i<el.size();i++) {
			String en = el.get(i).getText();
			if(en.contains("Linda Jane Anderson")) {
				el.get(i).click();
			}
			
		}
		
		
		
		
		driver.findElement(By.xpath("(//*[text()='Status']//..//..//div)[6]")).click();
		List<WebElement> ef = driver.findElements(By.xpath("((//*[text()='-- Select --'])[2]//..//..//..//div)[5]"));
		//List<WebElement> ee = driver.findElements(By.xpath("//*[@placeholder='Type for hints...']"));
		
		for(WebElement ab : ef) {
			//System.out.println(aa.getText());
			Thread.sleep(2000);
			String aab = ab.getText();
			if(aab.contains("Enabled")) {
				ab.click();
			}
		}
				//driver.findElement(By.xpath("(//*[text()='Username']//..//..//div)[2]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//*[contains(@class,'oxd-input oxd-input--active')])[2]")).sendKeys("bansude");
				driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("Vaibhav@123");
				driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("Vaibhav@123");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@type='submit']")).click();
				
				
				Thread.sleep(6000);
				//driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).click();
				driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).sendKeys("bansude");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[text()=' Search ']")).click();
	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@role='cell']")).click();
				
				driver.findElement(By.xpath("//*[@class='oxd-icon bi-trash']")).click();
	
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[text()=' Yes, Delete ']")).click();
	
				Thread.sleep(3000);
				driver.quit();
	}

}
