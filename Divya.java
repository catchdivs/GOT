package seldemopackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cd9_AlloptionFromDropdownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement monthDDL = driver.findElement(By.id("month"));
		Select month = new Select(monthDDL);
		List<WebElement> options = month.getOptions();
		for(int i=1; i<options.size(); i++)
		{
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}
		
driver.close();
	}

}
