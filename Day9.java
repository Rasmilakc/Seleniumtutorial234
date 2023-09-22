package seleniumtutorials;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		
		
		 driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	        String url="https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
	        driver.get(url);
	        
	        //List<WebElement> ac=driver.findElements(By.xpath("//input[@type='radio']"));
	        List<WebElement> ac=driver.findElements(By.cssSelector("#radio-buttons"));
	        System.out.println(ac.size());
	       
	        //for loop
	        for(int i=0;i<ac.size();i++) {
	        	System.out.println("radio Buttons text: "+ac.get(i).getAttribute("value"));
	        }
		}
	

	}


