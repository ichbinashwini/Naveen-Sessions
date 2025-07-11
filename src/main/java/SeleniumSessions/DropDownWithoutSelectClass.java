package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropDownWithoutSelectClass {

    // Achieved by using findElements

    static WebDriver driver;

    public static void main(String[] args) {

        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        ElementUtil eUtil = new ElementUtil(driver);

        brUtil.goToWebsite("https://orangehrm.com/en/contact-sales");

        By countryDropDown = By.cssSelector("select#Form_getForm_Country");
        By noOfEmployeesDropdown = By.cssSelector("select#Form_getForm_NoOfEmployees");

        eUtil.getDropDownOptionsWithoutSelectClass("Country",countryDropDown);
        eUtil.getDropDownOptionsWithoutSelectClass("Employee",noOfEmployeesDropdown);

        driver.close();
    }



}
