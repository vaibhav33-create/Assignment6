package assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()='Username']"));
		driver.findElement(By.xpath("//*[contains(@name,'name')]"));
		driver.findElement(By.xpath("//*[text()='Username']//..//..//input"));
		
		
		driver.findElement(By.cssSelector("input[name='username']"));
		driver.findElement(By.cssSelector("input[placeholder='username']"));
		
		
		
		
		driver.findElement(By.xpath("//*[text()='Password']"));
		driver.findElement(By.xpath("//*[contains(@name,'pass')]"));
		driver.findElement(By.xpath("//*[text()='password']//..//..//input"));
		
		driver.findElement(By.cssSelector("input[name='password']"));
		driver.findElement(By.cssSelector("input[placeholder='password']"));
		
		
		driver.findElement(By.xpath("//*[text()=' Login ']"));
		driver.findElement(By.xpath("//*[contains(@class,'button')]"));
		driver.findElement(By.xpath("//*[text()=' Login ']//..//button"));
		
		driver.findElement(By.cssSelector("button[type='submit']"));
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		
		
		

	}

}
