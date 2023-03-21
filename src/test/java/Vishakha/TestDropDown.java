package Vishakha;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDown {

	public static void main(String[] args) {
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
		List<WebElement> list1= driver.findElements(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]"));
		System.out.println(list1);
		
		for(WebElement drop:list1) {
			if(drop.getText().contains("About")) {
				drop.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");		
//		WebElement dropdown=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
//		
//		Select select= new Select(dropdown);
//		
//		//select.selectByIndex(2);
//		//select.selectByVisibleText("India");
//		select.selectByValue("ATA");
	}

}
