package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		Thread.sleep(2000);
		     driver.manage().window().maximize();
		     WebElement txt = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		     txt.sendKeys("Admin");
		    Thread.sleep(5000);
		     TakesScreenshot tss = (TakesScreenshot)driver;
			    File srcc = tss.getScreenshotAs(OutputType.FILE);
			    File filee = new File("D:\\screenshot.png");
			    FileUtils.copyFile(srcc, filee);
			    System.out.println("Screenshot is captured");

		     
		     
		     
		     
		     
	}
	
	

}
