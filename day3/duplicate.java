package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicate {
	
		public static void main(String[] args) {
			
		//launch browser
			ChromeDriver driver = new ChromeDriver();
			//launch URl
			driver.get("http://leaftaps.com/opentaps/control/login");
		    //maximize
			driver.manage().window().maximize();
			//user id using ID
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			// password using ID
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//hyperlink
			driver.findElement(By.linkText("CRM/SFA")).click();
			//lead button
			driver.findElement(By.linkText("Leads")).click();
			//create lead
			driver.findElement(By.linkText("Create Lead")).click();
			//company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABFK");
			// first name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthika");
			//last Name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			//first name local
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthika");
			//department
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Testing");
			//description
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Fresher testing in both Manual and Automation using Selenium");
			//email ID
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Keerthika.msc2023@gmail.com");
			//locate drop down
			WebElement provinceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			// select drop down
			Select provinceDropDown = new Select(provinceDD);
			//select by visible text
			provinceDropDown.selectByVisibleText("New York");
			// click create button
			driver.findElement(By.className("smallSubmit")).click();
			
			// get title 1
			String expectedTitle1 = "View Lead | opentaps CRM";
			String actualTitle = driver.getTitle();
			if(expectedTitle1.equals(actualTitle)) {
				System.out.println(expectedTitle1);
			}
			else {
				System.out.println("Error");
			}
			//duplicate lead
			driver.findElement(By.linkText("Duplicate Lead")).click();
			//clear company name
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			//another name for company
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infrosts");
			//clear name
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			//add name 
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mclaren");
			//create lead
			driver.findElement(By.className("smallSubmit")).click();
			
			// get title 2
			String expectedTitle2 = "View Lead | opentaps CRM";
			String actualTitle1 = driver.getTitle();
			if(expectedTitle2.equals(actualTitle1)) {
				System.out.println(expectedTitle2);
			}
			else {
				System.out.println("Error");
			}
		}
}
			
			
			
			
			
	


