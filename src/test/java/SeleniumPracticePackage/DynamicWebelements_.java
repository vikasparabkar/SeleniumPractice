package SeleniumPracticePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebelements_ {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Vikas\\Chrome.exe\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
		
//		List<WebElement>list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbct sbh1']"));
//		System.out.println(list.size());
		
//		WebElement rightclick=driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
//		
//		act.contextClick(rightclick).build().perform();
		
		
		//act.clickAndHold(source).release(target).build().perform();
		act.dragAndDrop(source, target).build().perform();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(0,400)", "");
		
		WebElement scroll1=driver.findElement(By.xpath("//div[normalize-space()='Interactions']"));
		js.executeScript("arguments[0].scrollIntoView()", scroll1);
		
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
