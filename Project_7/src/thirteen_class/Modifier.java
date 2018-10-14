//Modifier Keys in Action Class and Window/Tab Handling and this is the use of collection

package thirteen_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Modifier {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).perform();
		
		System.out.println("Current page url: "+driver.getCurrentUrl());
		
		String currentwindowaddress = driver.getWindowHandle();
		System.out.println("Current Window Address: "+currentwindowaddress);
		
		java.util.Set<String> allwindows = driver.getWindowHandles();
		
		int i=0;
		
		for(String s : allwindows)
		{
			i=i+1;
			if (i==2)
			{
			driver.switchTo().window(s);
			break;
			}
		}
		
		System.out.println("After Switching: "+driver.getCurrentUrl());
		
		driver.switchTo().window(currentwindowaddress);
		
		System.out.println("Original Page: "+driver.getCurrentUrl());
		
		//driver.close();
		
	}

}