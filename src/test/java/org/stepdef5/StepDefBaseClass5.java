package org.stepdef5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StepDefBaseClass5 {

	static WebDriver driver;

	public void launch(String s) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\div\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(s);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void fill(WebElement w, String s) {
		w.sendKeys(s);
	}

	public void dd(WebElement w, String s) {
		Select se = new Select(w);
		se.selectByVisibleText(s);
	}

	public void kill() {
		driver.quit();
	}

	public String getOId(WebElement w) {
		String orderId = null;
		orderId = w.getAttribute("value");
		return orderId;

		/*
		 * System.out.println(" "); System.out.println(orderId);
		 * System.out.println(" ");
		 */

	}

	public void c(WebElement w) {
		w.click();
	}

	public void js(String s, WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(s, w);
	}
}
