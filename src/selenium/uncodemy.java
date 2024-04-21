package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class uncodemy {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("https://uncodemy.com/");
WebElement Botx= driver.findElement(By.xpath("//button[@id='close-chat']"));
Botx.click();
WebElement category= driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
	Actions a=new Actions(driver);
	a.moveToElement(category).perform();
	Thread.sleep(2000);
	WebElement softwaretesting= driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
	a.moveToElement(softwaretesting).perform();
	
	
	}
	

}
