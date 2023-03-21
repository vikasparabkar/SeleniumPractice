package SeleniumPracticePackage;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectWIthoutSelect {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook pro");
//		
//		List<WebElement>list=driver.findElements(By.cssSelector(".s-suggestion-container"));
//		
//		//Thread.sleep(6000);
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
//		}
//		
//		//Thread.sleep(3000);
//		//driver.close();
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook pro");
//		List<WebElement> mackbook=driver.findElements(By.cssSelector(".s-suggestion-container"));
//		
//		for(int i=0;i<mackbook.size();i++) {
//			System.out.println(mackbook.get(i).getText());
//		}
		
		String email=randomstring()+"@gmail.com";
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(email);
		
	}
	
	public static String randomstring(){
		String generateString1 =RandomStringUtils.randomAlphabetic(5);
		return (generateString1);
	}
	
	

}
