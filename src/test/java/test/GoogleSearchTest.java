package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		bingSearch();

	}

	public static void bingSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eadesany\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google.com
		driver.get("https://www.google.com");
		
		//to click on ok button of the alert
		driver.findElement(By.id("W0wltc")).click();
		
		//enter text box
		driver.findElement(By.name("q")).sendKeys("Elijah Damilola Adesanya");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		
		//submit the search query
		driver.findElement(By.name("q")).submit();
		
		
		//wait for the search results to load
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//close browser
		driver.close();	
		
		//print output
		System.out.println("Test completed succesfully");
	
	}
}
