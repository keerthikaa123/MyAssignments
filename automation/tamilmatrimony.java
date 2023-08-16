package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilmatrimony {
	public static void main(String[] args) {
	//launch the browser
		ChromeDriver driver= new ChromeDriver();
		//launch the application Url "https://www.tamilmatrimony.in/"
		driver.get("https://www.tamilmatrimony.in/");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//select the matrimony profile by yourself
				Select profile=new Select(driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")));
				profile.selectByValue("1");
				//Enter the name
				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Keerthika");
				//click on date 
 				WebElement DropDown=driver.findElement(By.xpath("//select[@id='DOBDAY']"));
 				Select DayDropDown=new Select(DropDown);
 				DayDropDown.selectByVisibleText("11");
 				//click on month
 				WebElement DD=driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
 				Select MonthDropDown=new Select(DD);
 				MonthDropDown.selectByVisibleText("apr");
 				// click on year
 				WebElement DroDow=driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
 				Select YearDropDown=new Select(DroDow);
 				YearDropDown.selectByVisibleText("2002");
 				
 				//select the religion
 				WebElement Religion=driver.findElement(By.xpath("//select[@id='RELIGION']"));
 				Select ReligionDropDown=new Select(Religion);
 				ReligionDropDown.selectByVisibleText("Hindu");
 				
 				//select the MotherTongue
 				WebElement MotherTongue=driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
 				Select MotherTongueDD=new Select(MotherTongue);
 				MotherTongueDD.selectByVisibleText("Tamil");
 				
 				//select the cast
 				WebElement Caste=driver.findElement(By.xpath("//select[@id='CASTE_NORMAL']"));
 				Select CastDropDown=new Select(Caste);
 				CastDropDown.selectByVisibleText("Don't wish to specify");
 				
 				//select the country
 				WebElement Country=driver.findElement(By.xpath("//select[@name='COUNTRY']"));
 				Select CountryDD=new Select(Country);
 				CountryDD.selectByVisibleText("India");
 				
 				//select country code
 				WebElement Code=driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
 				Select CodeDD=new Select(Code);
 				CodeDD.selectByVisibleText("+91");
 				
 				//enter the phone no
 				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9384973765");
 				
 				//enter email
 				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("Keerthika.msc2023@gmail.com");
 				
 				//close the browser
 				driver.close();
		
	}

}


