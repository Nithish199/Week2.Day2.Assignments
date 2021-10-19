package Week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckList{
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		boolean a = driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected();
		if (a==true) {
			System.out.println("selenium is checked");
		}
		else {
			System.out.println("selenium is not checked");
		}
		boolean b = driver.findElement(By.xpath("(//div[@class='example']//input)[7]")).isSelected();
		boolean c = driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).isSelected();
		if (b==true) {
			driver.findElement(By.xpath("(//div[@class='example']//input)[7]")).click();
			
		}
		if (c==true) {
			driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
			
		}
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
		
		
	}
}
