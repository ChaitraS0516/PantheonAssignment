package pantheontesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;

public class Assignment1 extends BaseTest{
	@Test (priority = 1)
		public void initiatePurchase() throws InterruptedException {
		driver.findElement(By.xpath ("//a[contains(text(), 'Nexus 6')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Add to cart')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	
		}
	
	@Test (priority = 2)
	   public void placeOrder() {
		driver.findElement(By.id("cartur")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
	}
	
	@Test (priority = 3)
	   public void completeOrder() {
		String name = BaseTest.getPropertyValue("/pantheontesting/config.properties", "name");  
		String country = BaseTest.getPropertyValue("/pantheontesting/config.properties", "country");
		String city= BaseTest.getPropertyValue("/pantheontesting/config.properties", "city");
		String card = BaseTest.getPropertyValue("/pantheontesting/config.properties", "card");
		String month = BaseTest.getPropertyValue("/pantheontesting/config.properties", "month");
		String year = BaseTest.getPropertyValue("/pantheontesting/config.properties", "year");
	
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("card")).sendKeys(card);
		driver.findElement(By.id("month")).sendKeys(month);
		driver.findElement(By.id("year")).sendKeys(year);
		driver.findElement(By.xpath("//button[contains(text(), 'Purchase')]")).click();	
	}
	
	
}
