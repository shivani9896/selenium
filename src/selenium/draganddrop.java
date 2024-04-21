package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		Actions action = new Actions(driver);
WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));		
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));
	
	    action.dragAndDrop(drag, drop).perform();
	}

}
