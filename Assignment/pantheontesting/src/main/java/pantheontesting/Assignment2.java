package pantheontesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
			
				
					
					
					//
			

			

			public static void main(String[] args) throws InterruptedException {
				//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe"); 
				
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.demoblaze.com/");
				Thread.sleep(3000);
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath ("//a[contains(text(), 'Nexus 6')]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[contains(text(), 'Add to cart')]")).click();
				Thread.sleep(2000);
			
				driver.switchTo().alert().accept();
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("cartur")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("name")).sendKeys("Chaitra");
				driver.findElement(By.id("country")).sendKeys("India");
				driver.findElement(By.id("city")).sendKeys("Bangaloree");
				driver.findElement(By.id("card")).sendKeys("4811 1111 1111 1114");
				driver.findElement(By.id("month")).sendKeys("Dec-24");
				driver.findElement(By.id("year")).sendKeys("123");
				driver.findElement(By.xpath("//button[contains(text(), 'Purchase')]")).click();
				
			
				
				
				
//				
			
				////driver.close();
				
				
					

			}

		}
//public static void main(String[] args) throws IOException, InterruptedException {
//	//open the browser
//	WebDriver driver = new ChromeDriver(); //up casting
//	//enter the URL
//	driver.get("file:///C:/Users/Chaitra/Desktop/qsp.html");
//	//find the element by tag name 'a' & store its address
//    driver.findElement(By.tagName("a")).click();
//	//click on the element using its address
//    Thread.sleep(2000);
//	driver.navigate().back();
//	driver.findElement(By.name("n1")).click();
//	Thread.sleep(2000);
//	driver.navigate().back();
//	driver.findElement(By.className("c1")).click();
//	Thread.sleep(2000);
//	driver.navigate().back();
//	driver.findElement(By.linkText("Google")).click();
//	Thread.sleep(2000);
//	driver.navigate().back();
//	driver.findElement(By.partialLinkText("Goo")).click();
//	driver.close();
//	




		
		
		
		
		
		
		
//		before class 
//		before method
//		
		




