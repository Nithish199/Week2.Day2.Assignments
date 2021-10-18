package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Nithish");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nithish");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Creating a Contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nithishkumark11@gmail.com");
		WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select dropDown1=new Select(country);
		dropDown1.selectByVisibleText("India");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown2=new Select(State);
		dropDown2.selectByVisibleText("TAMILNADU");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The page title is :"+driver.getTitle());
		
		
		
	}

}
