package Runner;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Test_Runner {
	WebDriver driver;
	  @Test
	  public void test() throws InterruptedException {
		  //driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
		  System.out.println(driver.getTitle());
		  
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  //System.setProperty("webdriver.gecko.driver","E:/source/geckodriver.exe");
		  System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
		  driver=new FirefoxDriver();
		  
		  driver.get("http://13.251.143.66:8090/IPL-Fantasy-League-0.0.1-SNAPSHOT/");
		  //sThread.sleep(5000);
	  }

	  @AfterTest
	  public void afterTest() {
		 
		 System.out.println("Running1");
		 //driver.close();
	  
}

}
