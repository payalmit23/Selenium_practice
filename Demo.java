import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement search_box = driver.findElement(By.id("search"));
		search_box.sendKeys("the body project");
		WebElement isearch = driver.findElement(By.id("search-icon-legacy"));
		isearch.click();
		driver.quit();		
	}

}
