package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownUsingGetOptions {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://orangehrm.com/en/contact-sales");

        ElementUtil eUtil = new ElementUtil(driver);

        By countryDropDown = By.cssSelector("select#Form_getForm_Country");
        By noOfEmployeesDropdown = By.cssSelector("select#Form_getForm_NoOfEmployees");

        eUtil.getDropDownOptionAndClick(countryDropDown, "Aruba");
        eUtil.getDropDownOptionAndClick(noOfEmployeesDropdown, "51 - 200");

        driver.close();

    }


}
