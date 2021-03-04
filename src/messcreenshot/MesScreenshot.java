package messcreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import screenshot_library.Utility;

public class MesScreenshot {

	@Test
	public void MesScreenshot() throws Exception {
		System.setProperty("webdriver.gecko.driver", "E://geckodriver-v0.24.0-win64//geckodriver.exe");
		Thread.sleep(20000);

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.10.242");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");

		Utility.Capturescreenshot(driver, "User");

		driver.quit();

	}

}
