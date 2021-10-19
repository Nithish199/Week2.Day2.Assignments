package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		String url = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The url is:"+ url);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		if(driver.getPageSource().contains("HTTP Status 404 – Not Found")) {
			System.out.println("the page is broken");

		} else {
			System.out.println("the page is not broken");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		}
	}


