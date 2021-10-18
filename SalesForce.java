package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Nithish Kumar");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("nithishkumark11@gmail.com");
		WebElement title = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dropDown1 = new Select(title);
		dropDown1.selectByVisibleText("Developer / Software Engineer / Analyst");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("KNK");
		WebElement employee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropDown2 = new Select(employee);
		dropDown2.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("8637437209");
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropDown3 = new Select(country);
		dropDown3.selectByValue("IN");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[1]")).click();
		driver.close();
	}
}
