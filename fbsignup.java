import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //dimension set
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("payal_mittal");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("payal23");
        System.out.println(password.toString());
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        WebElement forgetPass = driver.findElement(By.cssSelector("a._97w4"));
        forgetPass.click();
        WebElement cancel = driver.findElement(By.cssSelector("#identify_yourself_flow>div>div:last-child>div>div>a"));
        cancel.click();
        
        
   
        
	}

}
