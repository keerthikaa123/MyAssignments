package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {

public static void main(String[] args) {
		
		//launch the browser
	ChromeDriver driver= new ChromeDriver();
	
	//get the url
			driver.get("https://uibank.uipath.com/register-account");
			//maximize the browser
			driver.manage().window().maximize();
				
			//enter the name
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Keerthika");
			//enter the title
			driver.findElement(By.xpath("//select[@id='title']"));
			Select TitleDD=new Select(title);
			TittleDD.selectByVisibleText("Ms");

			//enter initial
			driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("R");

			//enter last name
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Rajakrishnan");
			//time duration
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//select gender
			WebElement Gender=driver.findElement(By.xpath("//select[@name='gender']"));
			Select GenderDD=new Select(Gender);
			GenderDD.selectByVisibleText("Female");
			
			//select employment status
			WebElement Emp=driver.findElement(By.xpath("//select[@id='employmentStatus']"));
			Select EmpDD=new Select(Emp);
			EmpDD.selectByVisibleText("Full-time");
			
			//enter name
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Keerthika");
			
			//enter email
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Keerthika.msc2023@gmail.com");
			
			//enter password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" Keerthikaa");
			
			//close the browser
			driver.close();
			
}	
}



