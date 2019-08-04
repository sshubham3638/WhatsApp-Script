import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MickyMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Exe/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://web.whatsapp.com/");		
        
        Thread.sleep(10000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message please: ");
        String message = sc.nextLine();
        List<WebElement> contacts = driver.findElements(By.xpath("//div[@class='_2wP_Y' or @class='_25Ooe']"));
        
         System.out.println(contacts.size());
        Iterator<WebElement> itr = contacts.iterator();
        while (itr.hasNext()) {
			WebElement contact = itr.next();
			contact.click();
			Thread.sleep(3000);
			
			
			WebElement msg_bx = driver.findElement(By.cssSelector("div[class='_2S1VP copyable-text selectable-text']"));
			//WebElement send_btn = driver.findElement(By.cssSelector("span[data-icon='send']"));
			
			msg_bx.sendKeys(message);
			//msg_bx.sendKeys(Keys.ENTER);
			
			/* JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView()", contact);
			*/
             
			contact.sendKeys(Keys.ARROW_DOWN);
        }
        
	}

}
