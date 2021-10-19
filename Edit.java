package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("nithishkumark11@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("kln");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean element = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if(element==true) {
			System.out.println("The field is enabled");
		}else
		{
			System.out.println("The field is disabled");
		}

	}

}
