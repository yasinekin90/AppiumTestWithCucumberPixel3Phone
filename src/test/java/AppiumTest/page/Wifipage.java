package AppiumTest.page;

import AppiumTest.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Wifipage {
    public Wifipage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;
    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement prefen3;

    @AndroidFindBy(id ="android:id/checkbox" )
    public WebElement checkBox;

    @AndroidFindBy(xpath = "//*[@text=\"WiFi settings\"]")
    public WebElement wifiSettings;

    @AndroidFindBy(id ="android:id/edit")
    public WebElement editText;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;
}
