package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterLinks {

static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


       // By eleLinks = By.xpath("//footer//a");
        By rightPanelLinks = By.className("list-group-item");

        ElementUtil elUti = new ElementUtil(driver);
       // elUti.clickElement(eleLinks ,"Privacy");

       elUti.clickElement(rightPanelLinks,"Downloads");

        driver.close();
    }



}
