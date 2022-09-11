package amazonUsers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithdifferentUsers {

	public static void main(String[] args) {
		//here the idea is to create custom hasmap object for value part
//		The objective is to login in amazon website as different users
//		1.customer user
//		2.Admin User
//		3.seller User
//		4.Delivery guy user
//		like every user has different username and password for log in into the website
//		so the idea is to make key as the type of user and value will a customized object that taking both 
//		username and password .
		
//---------------------------------------------------------------------------------------------------------------------------
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\91797\\Desktop\\Selenium Folder\\Chromdriver\\chromedriver_win32\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://www.facebook.com/");
//	        driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]")).sendKeys("nigam");
//	        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");
//		Here i haVE BEEN Trying to make some input to the user name and password field
	        Map<String,CustomObject> hm=new HashMap<>();
	        hm.put("Customer User",new CustomObject("Nigam","nigam123"));
	        hm.put("Admin User",new CustomObject("Susmita","susmita123"));
	        hm.put("Seller user",new CustomObject("Dibya","dibya123"));
	        hm.put("Delivery Boy User",new CustomObject("Deliveryboy","deliveryboy123"));
	        
	        //i have created a hashmap object which also implements map interface classes and methods
	        //now i need to iterate over that object so that i can test each user login with negative scenarios
	        
	        //iterate with entryset
	        
	        Iterator<Entry<String,CustomObject>>it=hm.entrySet().iterator();
	        while(it.hasNext()) {
	        	Entry<String,CustomObject>itr=it.next();
	        	if(itr.getKey().contains("Admin User")) {
	        	driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]")).sendKeys(itr.getValue().getUsername());
	        	 driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(itr.getValue().getPassword());
	        	}
	        }
	        
	        
	        
		
	}

}
