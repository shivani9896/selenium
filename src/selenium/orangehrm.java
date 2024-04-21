package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class orangehrm {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
Thread.sleep(2000);
     driver.manage().window().maximize();
//     System.out.println(driver.getTitle());
//     System.out.println(driver.getCurrentUrl());
     
     
     WebElement txt = driver.findElement(By.xpath("//input[@name=\"username\"]"));
     txt.sendKeys("Admin");
     
     WebElement rdx = driver.findElement(By.xpath("//input[@name=\"password\"]"));
     rdx.sendKeys("admin123");
     
     WebElement cdx = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
     cdx.click();
//     driver.navigate().back(); 
//     Thread.sleep(2000);
//    driver.navigate().forward(); 
     Thread.sleep(2000);
   WebElement vdx = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a"));
    vdx.click();
    Thread.sleep(2000);
    WebElement zdx = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));	
     zdx.sendKeys("shivi");
     WebElement sdx = driver.findElement(By.xpath("//button[@type='submit']"));
     sdx.click();
     
	}
}
  

