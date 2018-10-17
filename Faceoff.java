
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Faceoff {

	public static void main(String[] args) {
try
{
	java.util.Date d=new java.util.Date();
    String data=d.getDay()+""+d.getMonth()+d.getYear()+d.getHours()+d.getMinutes()+d.getSeconds();
    System.out.println("Launcing web browser");
	System.setProperty("webdriver.chrome.driver","/home/webonise/eclipse-workspace/Faceoff.java/Resources/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://web-stg.gofaceoff.com/");
	driver.findElement(By.xpath("//div/a[@href='/signup']")).click();
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("ab"+data+"@gmail.com");
	driver.findElement(By.xpath(" //*[@name='username']")).sendKeys(data);
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("simchand@79");
	driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Chandni");
	driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Tilani");
	driver.findElement(By.xpath("//*[@name='dateOfBirth']")).sendKeys("12/19/1996");
	
	WebElement element=driver.findElement(By.xpath("//*[@name='state']"));
	Select State=new Select(element);
	State.selectByVisibleText("IN");
	driver.findElement(By.xpath("//*[@name='referralCode']")).sendKeys("ian");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@href='accept-challenge'  and text()='Skip']")).click();
	driver.findElement(By.xpath("//span[@class='dropDownIcon']")).click();
    driver.findElement(By.xpath("//div/a[text()='Log Out']")).click();
	
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}