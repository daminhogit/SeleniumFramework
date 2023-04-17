package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.GoogleSearchPage;


public class TestNG_Demo {

	WebDriver driver = null;
	

	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eadesany\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	
	

	public void googleSearch() {
		
		//navigate to google.com
		driver.get("https://www.google.com");
		
		//to click on ok button of the alert
		driver.findElement(By.id("W0wltc")).click();
		
		//enter text box
		//driver.findElement(By.name("q")).sendKeys("Elijah Damilola Adesanya");
		GoogleSearchPage.textbox_search(driver).sendKeys("Elijah Damilola Adesanya");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		
		//submit the search query
		//driver.findElement(By.name("q")).submit();
		
		GoogleSearchPage.button_search(driver).submit();
		
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		}
	

	public void tearDownTest() {
		//close browser
		driver.close();	
		driver.quit();
		
		//print output
		System.out.println("Test completed succesfully");
	}
}
