package SeleniumPracticePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlePractice {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement googleserach=driver.findElement(By.name("q"));
		googleserach.sendKeys("mackbook");
		List<WebElement> search=driver.findElements(By.cssSelector("ul li.sbct"));
		
		for(int i=0;i<search.size();i++) {
			
			System.out.println(search.get(i).getText());
			if(search.get(i).getText().equals("macbook")) {
				search.get(i).click();
				break;
			}
		}
		
		//driver.close();
	}
		
}


