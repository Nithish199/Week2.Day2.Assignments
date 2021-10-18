package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("nithishkumark11@gmail.com");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep (3000);
		String text = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).getText();
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		if(driver.getPageSource().contains("Duplicate Lead")) {
			System.out.println("verified the title duplicate lead");
		}else
		{
			System.out.println("not verified");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains(text2)) {
			System.out.println("Duplicate lead created");
		}
		else {
			System.out.println("Duplicate lead is not created");
		}
		driver.close();
		}

	}


