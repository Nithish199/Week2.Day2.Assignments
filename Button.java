package Week2.Day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		System.out.println("The Position is : "+driver.findElement(By.id("position")).getLocation());
		WebElement element = driver.findElement(By.id("color"));
		String color=element.getCssValue("color");
		System.out.println("The color is :"+color);
		System.out.println("The size :"+driver.findElement(By.id("size")).getSize());
		

	}

}
