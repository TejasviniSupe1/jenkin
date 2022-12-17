package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondScript {
	
	WebDriver driver;
	
	  @Test
	  public void firstMeth() throws InterruptedException {
		  System.out.println("In Test");
		
		  driver.get("https://www.lambdatest.com");
		  
		  WebElement sign_up_for_free_field=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div/div/div[1]/div[1]/a"));
		  sign_up_for_free_field.click();
		  Thread.sleep(2000);
	 
		  WebElement  name_field=driver.findElement(By.id("name"));
		  name_field.sendKeys("Tejasvini Ramchandra Supe");
		  Thread.sleep(2000);

		  
		  WebElement email_field=driver.findElement(By.id("email"));
		  email_field.sendKeys("business.seleni12@gmail.com");
		  Thread.sleep(2000);
		  
		  WebElement pass_field=driver.findElement(By.id("userpassword"));
		  pass_field.sendKeys("Abc@xyz11");
		  Thread.sleep(2000);
		  
		  WebElement phone_field=driver.findElement(By.id("phone"));
		  phone_field.sendKeys("1234123445");
		  Thread.sleep(2000);
	 
		  WebElement cehckbox_field=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp"));
		  cehckbox_field.click();
		  Thread.sleep(2000);
		  
		  WebElement free_sign_field=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[6]/button"));
		  free_sign_field.click();
		  
		  
	  }
	  
	  @Test
	  public void secondMeth() throws InterruptedException {
		  driver.get("https://www.lambdatest.com");
		  
		  WebElement sign_up_free_field=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[1]/div/div/div[1]/div[1]/a"));
		  sign_up_free_field.click();
		  
		  WebElement sign_up=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[3]/p/a"));
		  sign_up.click();
		  Thread.sleep(2000);
		  
		  WebElement email_Ent=driver.findElement(By.id("email"));
		  email_Ent.sendKeys("business.seleni12@gmail.com");
		  Thread.sleep(2000);
		  
		  WebElement password_field=driver.findElement(By.id("password"));
		  password_field.sendKeys("Abc@xyz11");
		  Thread.sleep(2000);
		  
		  WebElement sign_in=driver.findElement(By.id("login-button"));
		  sign_in.click();
		  
		  WebElement atomat=driver.findElement(By.xpath("//*[@id=\"WS_automation\"]/div/div[2]"));
		  atomat.click();
		  
		  
		 	  
	  }
	  

	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("In Before Test");
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sairam\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		    

	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("In After Test");
	  }



}
