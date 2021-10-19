package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		WebElement element = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if (element.getAttribute("onclick") == null) {
			System.out.println("the link is broken");

		} else {
			System.out.println("the link is fine");
		}
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

	}

}
