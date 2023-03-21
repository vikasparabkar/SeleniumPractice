package SeleniumPracticePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
	
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		System.out.println(driver.findElement(By.xpath("//table[@id=\"customers\"]")).getText());
		
		System.out.println(getRowNumber("Germany"));
	}
	
	public static boolean getRowNumber(String name) {
		int rowCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
		boolean flag=false;
		for(int i=1; i<rowCount; i++) {
			for(int j=1; j<=colCount; j++) {
				String actValue=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if(actValue.equals(name)) {
					flag=true;
					System.out.println(i+" : "+j);
					break;
				}
			}
		}
		if(flag) {
			return true;
		}
		return flag;
		
	}
	

}
