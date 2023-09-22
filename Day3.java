package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
		   
		   
		
	     driver.get("https://www.saucedemo.com/");
	    WebElement username = driver.findElement(By.cssSelector("#user-name"));
	    WebElement password = driver.findElement(By.cssSelector("#password"));
	    WebElement login = driver.findElement(By.cssSelector("#login-button"));
	    

	    
	    username.sendKeys("standard_user");
	    password.sendKeys("secret_sauce");
	    login.click();
	    
	     
		
		
		
	    WebElement heading = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
	    if (heading.isDisplayed()) {
	    	System.out.println("test case pass");
	    }else {
	    	System.out.println("test case fail");
	    	
	    	//program1
	    	 String[][] credentials = {
	    	            {"standard_user", "secret_sauce"},
	    	            {"locked_out_user", "secret_sauce"},
	    	            {"problem_user", "secret_sauce"},
	    	            {"performance_glitch_user", "secret_sauce"},
	    	            
	    	        };
	    }
	    
	      

	}

}
