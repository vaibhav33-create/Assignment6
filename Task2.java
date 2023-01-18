package assignment6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

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
		driver.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("a");
		Thread.sleep(5000);
		List<WebElement> el = driver.findElements(By.xpath("(//*[text()='Employee Name']//..//..//..//div)[8]"));
		
		for(int i=0;i<el.size();i++) {
			System.out.println(el.get(i).getText());
		}
	
		driver.findElement(By.xpath("//*[text()='User Role']"));
		driver.findElement(By.xpath("(//*[text()='-- Select --'])[1]"));
		driver.findElement(By.xpath("//*[text()='Status']"));
		
	}

}
