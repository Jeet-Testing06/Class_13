// Verification Points

package thirteen_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Points {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.name("websubmit"));
		signup.click();
		
		String a = signup.getText();  // Inner Text
		System.out.println("Inner Text: "+a);
		
		String b = signup.getAttribute("name");  // Attribute value
		System.out.println("Attribute value of name: "+b);
		
		System.out.println("Element is visible: "+signup.isDisplayed()); // Element is visible or not
		
		System.out.println("Element is enabled: "+signup.isEnabled());  // Element is enable or not means click-able or not
		
		System.out.println("Element is selected: "+signup.isSelected());  // Element is selected or not
		
		driver.close();
		
	}

}