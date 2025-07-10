package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    static WebDriver driver;

    public static void main(String[] args) {

        BrowserUtility brUtil = new BrowserUtility();

        WebDriver driver = brUtil.initBrowser("chrome");
        brUtil.goToWebsite("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        ElementUtil eUtil = new ElementUtil(driver);


        By fNameid = By.id("input-firstname");


        eUtil.doSendKeys(fNameid, "As");

    }

}
