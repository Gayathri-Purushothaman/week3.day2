package Week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
driver.findElement(By.xpath("//label[@for='Men']")).click();
driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
List<WebElement> we=driver.findElements(By.xpath("//a[@class='rilrtl-products-list__link']"));
int count=we.size();
System.out.println(count);
List<WebElement> weBrand=driver.findElements(By.xpath("//div[@class='brand']"));
List<String> str=new ArrayList<String>();
for(WebElement brand:weBrand)
{
	str.add(brand.getText());
}
for(int i=0;i<str.size();i++)
{
	System.out.println(str.get(i));
}
	}

}
