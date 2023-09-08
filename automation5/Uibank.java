package automation5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uibank {
	public static void main(String[] args) 
	{
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("https://uibank.uipath.com/register-account");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//5. enter the name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("keerthi");
		//6.select your title
		WebElement state=driver.findElement(By.xpath("//select[@id='title']"));
		Select state1=new Select(state);
		state1.selectByVisibleText("Ms");
		//enter the initial
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("R");
		//enter the last name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("keerthiRajesh");
		//select gender
		WebElement state2=driver.findElement(By.xpath("//select[@id='sex']"));
		Select state3=new Select(state2);
		state3.selectByVisibleText("Female");
		//select employee status
		WebElement state4=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select state5=new Select(state4);
		state5.selectByVisibleText("Full-time");
		//enter your email address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Keethikaa");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Keerthika.msc2023@gmail.com");
		//close the browser
		driver.close();

	}

}
