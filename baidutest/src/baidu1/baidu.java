package baidu1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baidu {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com");
	}

}
