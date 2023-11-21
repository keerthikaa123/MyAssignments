package Automationnovember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		//open the ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//load  the Application
		driver.get("https://facebook.com/'");
		//Maximize the Browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click  on  create New Account button
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keerthika");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("keerthikarajakrishnan");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("keerthika.msc2023@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9384973765");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select Dropdown =new Select(findElement);
		
		Dropdown.selectByVisibleText("29");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select Dropdown2=new Select(findElement2);
		
		Dropdown2.selectByVisibleText("dec");
		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select Dropdown3 =new Select(findElement3);
		
		Dropdown3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		//driver.close();
		
	}


		
		

	}


