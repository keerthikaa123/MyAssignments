package Automationnovember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class uipath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				//load  the Application
				driver.get("https://uibank.uipath.com/");
				//Maximize the Browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.xpath("//button[@class='btn btn-black btn-xl get-started-button']")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("keerthika");
				
				driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("keerthirajakrishnan");
				
				WebElement findElement1 = driver.findElement(By.xpath("//select[@name='title']"));
				
				Select DropDowm=new Select(findElement1);
				
				DropDowm.selectByVisibleText("Ms");
				
				driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("R");
				
				WebElement findElement2 = driver.findElement(By.xpath("//select[@name='gender']"));
				
				Select Gender=new Select(findElement2);
				
				Gender.selectByVisibleText("female");
				
				WebElement findElement3 = driver.findElement(By.xpath("//select[@name='employmentStatus']"));
				
				Select Employee=new Select(findElement3);
			
				Employee.selectByVisibleText("Full-time");
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("keerthika");
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("keerthika.msc2023@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("9384973765");
				
				//driver.close();
				
			}

	}


