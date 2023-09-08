package automation5;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) 
	{
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("https://www.facebook.com/");
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on create new button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keerthi");

		//enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		//enter your mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9384973765");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Keerthika.msc2023@gmail.com");
		//select date
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select date1=new Select(date);
		date1.selectByValue("29");
		//11. Select month
		WebElement state2=driver.findElement(By.xpath("//select[@id='month']"));
		Select state3=new Select(state2);
		state3.selectByVisibleText("dec");
		//select year
		WebElement state4=driver.findElement(By.xpath("//select[@id='year']"));
		Select state5=new Select(state4);
		state5.selectByValue("2000");
		//click on your gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//close your browser
		driver.close();




	}

}
