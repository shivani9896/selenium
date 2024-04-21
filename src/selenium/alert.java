package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
			
		Thread.sleep(2000);
		     driver.manage().window().maximize();
		     WebElement txt = driver.findElement(By.xpath("//button[@id='alertButton']']"));
		     txt.click();
		     Alert alert= driver.switchTo().alert();
		     Thread.sleep(5000);
		     alert.accept();
		     
		     
		     
		     
		     
	}

}
