import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Demo2 {
	WebDriver driver;
  @Test
  
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Rama Kant ");
      driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Bhargava");
      driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Chandigarh mohali");
      driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Bhargava@gmail.com");
      driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("Bhargava@gmail.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new chromedriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  public void afterMethod();
	  driver.close();
  }

}
