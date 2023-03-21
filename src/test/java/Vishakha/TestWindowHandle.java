package Vishakha;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowHandle {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		String handle=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String window:windows) {
			if(!window.equals(windows)) {
				driver.switchTo().window(window);
			}
		}
		
		driver.findElement(By.xpath("//input[@id='Form_getForm_Email']")).sendKeys("Vikas");
		driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']")).click();
		
		driver.switchTo().window(handle);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Vikas");
		
		driver.quit();
		
	}

}
