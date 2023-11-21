package Automationnovember;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilmatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				//load  the Application
				driver.get( "https://tamilmatrimony.com/'");
				//Maximize the Browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//select  the  matrimony profile for yourself

				WebElement forDD = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
				
				Select forDropDown = new Select(forDD);
				forDropDown.selectByVisibleText("myself");
				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("keerthika");

				driver.findElement(By.xpath("//input[@id='genderfemale']")).click();

				WebElement DateDD = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
				
				Select DateDropDown = new Select(DateDD);
				
				DateDropDown.selectByIndex(2);
				
				Select month = new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));
				
				month.selectByVisibleText("dec");
				
				Select year = new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
				
				year.selectByVisibleText("2000");
						
				WebElement religionDD = driver.findElement(By.xpath("//select[@id='RELIGION']"));
				
				Select RelDropDown = new Select(religionDD);
				
				RelDropDown.selectByVisibleText("Hindu");

				Select motherTongue = new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
				
				motherTongue.selectByVisibleText("Tamil");
				
				Select country = new Select(driver.findElement(By.xpath("//select[@id='COUNTRY']")));
				
				country.selectByVisibleText("India");
				
				Select countryCode = new Select(driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")));
				
				countryCode.selectByVisibleText("+91");
				
				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9384973765");

				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("keerthika.msc@gmail.com");
				
				driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("9384973765");
				
				//driver.close();
				
			}

		
				
				
	}


