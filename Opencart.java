package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("input-username")).sendKeys("Nithish");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nithish Kumar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("K");
		driver.findElement(By.id("input-email")).sendKeys("nithishkumark11@gmail.com");
		WebElement country = driver.findElement(By.id("input-country"));
	Select dropDown=new Select(country);
	dropDown.selectByVisibleText("India");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1127@Nithish");
	// can't able create account because of captcha...
	
	}

}
