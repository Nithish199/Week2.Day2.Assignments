package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//form[@method='post']//a)[3]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nithish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nithishkumarknk11@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nithishkumarknk11@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1127@Nithish");
		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dropDown1=new Select(date);
		dropDown1.selectByVisibleText("11");
		WebElement mounth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dropDown2=new Select(mounth);
		dropDown2.selectByIndex(10);
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dropDown3=new Select(year);
		dropDown3.selectByValue("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
	}

}
