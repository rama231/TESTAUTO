package Projecttest01.Projecttest01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class AppTest {
	private static final String FileUtils = null;
	WebDriver driver;
  @Test(priority=2)
  
  public void fill() {
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Rama Kant ");
      driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Bhargava");
      driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Chandigarh mohali");
      driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Bhargava@gmail.com");
      driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("Bhargava@gmail.com");
   
  }
      @Test(priority=2)
      public void selcte() {
    	  //Select Gender from radio button
          WebElement radiobutton1 =driver.findElement(By.xpath("//label[normalize-space()='Male']"));
          radiobutton1.click();
          //Select hobby from radio button
          WebElement radioButton2 = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
          radioButton2.click();
      }
  @Test(priority=2)
	  public void select2()
	  {
	  WebElement skill = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
      Select skill1 = new Select(skill);

      // Select an option by visible text
      skill1.selectByValue("Desktop Publishing");
      skill.click();
      WebElement country= driver.findElement(By.id("select2-selection select2-selection--single"));
      Select country1=new Select(country);
      country1.selectByVisibleText("Japan");
      System.out.println(skill );
	  }
  @Test
  public void screeshot()
  {
	  driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\FR-CHD-00674\\Downloads\\jpeg-optimizer_IMG-20240727-WA0009.JPG");
	 TakesScreenshot rc=((TakesScreenshot)driver);
      File src=rc.getScreenshotAs(OutputType.FILE);
  File   dest=new File("C:\\Users\\FR-CHD-00674\\eclipse-workspace\\selen1\\Screenshot\\pic.png");
  try {
				File.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }

  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0, 1000);");
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.close();
  }

}