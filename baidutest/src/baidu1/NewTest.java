package baidu1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  ChromeDriver driver;
  
  @Test
  public void f() {
	  driver.get("http://www.baidu.com");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
