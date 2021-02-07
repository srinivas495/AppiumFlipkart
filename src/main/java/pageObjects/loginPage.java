package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginPage {
	
	public loginPage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidBy(uiAutomator = "text(\"NONE OF THE ABOVE\")")
	public WebElement nonOfTheAbove;
	
	@AndroidBy(id = "com.flipkart.android:id/custom_back_icon")
	public WebElement backButton;
	
	
	
}
