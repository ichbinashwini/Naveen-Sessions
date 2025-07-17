package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookSignUp {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        ElementUtil eUtil = new ElementUtil(driver);

        brUtil.goToWebsite("https://www.facebook.com/r.php?entry_point=login");
        By firstName = By.cssSelector("input[name='firstname']");
        By lastName = By.cssSelector("input[name='lastname']");
        By bDate = By.cssSelector("select#day");
        By bMonth = By.cssSelector("select#month");
        By bYear = By.cssSelector("select#year");

        eUtil.doSendKeys(firstName, "User1");
        eUtil.doSendKeys(lastName, "LastUser");
        eUtil.selectDropDownByValue(bDate, "29");
        eUtil.selectDropDownByValue(bMonth, "12");
        eUtil.selectDropDownByVisibilty(bYear, "2000");
        Thread.sleep(2000);
        driver.close();

    }

}
