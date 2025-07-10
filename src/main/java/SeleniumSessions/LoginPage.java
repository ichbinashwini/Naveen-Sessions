package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    static WebDriver driver;

    public static void main(String[] args) {
        BrowserUtility brUtil = new BrowserUtility();
        WebDriver driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        ElementUtil eUtil = new ElementUtil(driver);

        By email = By.id("input-email");
        By password = By.id("input-password");
        By loginButton = By.xpath("//input[@value='Login']");
        By loginHeader = By.tagName("h21");

        eUtil.doSendKeys(email , "ashwini.nanaware2911@gmail.com");
        eUtil.doSendKeys(password , "12345678");
        eUtil.doClick(loginButton);


        boolean flag = eUtil.isElementDisplayed(loginHeader);
        String header = "";
        if (flag){
             header = eUtil.getElementText(loginHeader);
            System.out.println("This is login page header "+ header);
        }
       else System.out.println("Element is not found");



    }





}
