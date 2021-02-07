package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class welComePage {
	
	public welComePage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidBy(uiAutomator = "text(\"English\")")
	public WebElement selectLanguage;
	
	@AndroidBy(uiAutomator = "text(\"English\")")
	public WebElement electLanguage;
	
	@AndroidBy(uiAutomator = "text(\"CONTINUE\")")
	public WebElement Continue;
	
}
