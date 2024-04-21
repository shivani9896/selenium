package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webvisiblity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Boolean a,b,c,d;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	    a=login.isDisplayed();
	    b=login.isEnabled();
	    System.out.println("value of a" +a);
	    
	    if(a==true  && b==true) {
	    
	    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	    	
	    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
login.click();	    
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
            Thread.sleep(4000);
WebElement mbtn=driver.findElement(By.xpath("//label[normalize-space()='Male']")); //male radio button
            c=mbtn.isSelected();
            System.out.println(""+c);
            WebElement fbtn=driver.findElement(By.xpath("//label[normalize-space()='Female']"));   //female radio button
            d=fbtn.isSelected();
            System.out.println(""+d);

if(c==false) {
            fbtn.click();
            
	    }
            else {
                driver.navigate().refresh();  //for refresh web page  
            	//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //navigate to url
            	 
                
                
            }
	    
	    driver.quit();
	}


	}
}