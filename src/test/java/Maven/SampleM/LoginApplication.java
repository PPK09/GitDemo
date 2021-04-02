package Maven.SampleM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {
	
	@Test
	public void LogInApp()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Pratyush//Downloads//chromedriver_win32.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		fbloginpage fb = new fbloginpage(driver);
		fb.UserId().sendKeys("Hello");
		fb.UserPassword().sendKeys("Hello");
		fb.LoginId().click();
	}

}
