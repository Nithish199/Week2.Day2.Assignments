package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nithish");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-body']//a)[1]")).click();
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("Verified");
		} else {
			System.out.println("not verified");
		}
		driver.findElement(By.linkText("Edit")).click();
		String text = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NKK");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text != text1) {
			System.out.println("The Company name has been changed");
		} else {
			System.out.println("Company name not changed");
		}
		driver.close();
	}

}
