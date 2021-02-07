package AppiumFlipkart.AppiumFlipkart;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.loginPage;
import pageObjects.welComePage;

public class testCaseFlipkart extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		welComePage WelcomPage = new welComePage(driver);
		WelcomPage.selectLanguage.click();
		WelcomPage.Continue.click();
		
		
		loginPage LoginPage = new loginPage(driver);
		LoginPage.nonOfTheAbove.click();
		LoginPage.backButton.click();
	}

}
