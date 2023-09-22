package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// driver.getTitle()
				// driver.navigate()
				// driver.getPageSorce()
				// driver.findElemens()
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    String url ="https://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
		  
	
		//working on navigate 
		driver.navigate().refresh();
		
		//getTitle
		System.out.println("page title :\t"+driver.getTitle());
		
		
		//getCurrent url
		System.out.println("Current url:"+url);
		
		
		
		//getPageSorce()
		
		WebElement pageSource = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String rab = pageSource.getText();
		System.out.println(rab);
		
	}


	    
	 
	}
