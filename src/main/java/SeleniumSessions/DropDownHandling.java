package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDownHandling {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //Select --> option
        //Using selectByValue, Visibility, Index

        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        ElementUtil eUtil = new ElementUtil(driver);

        brUtil.goToWebsite("https://orangehrm.com/en/contact-sales");

        By countryDropDown = By.cssSelector("select#Form_getForm_Country");
        By noOfEmployeesDropdown = By.cssSelector("select#Form_getForm_NoOfEmployees");

        eUtil.selectDropDownByIndex(countryDropDown,3);
        eUtil.selectDropDownByValue(countryDropDown, "France");
        eUtil.selectDropDownByVisibilty(countryDropDown,"Zaire");

        eUtil.selectDropDownByIndex(noOfEmployeesDropdown,2);
        eUtil.selectDropDownByValue(noOfEmployeesDropdown,"51 - 200");
        eUtil.selectDropDownByVisibilty(noOfEmployeesDropdown, "> 1,000");

        driver.close();
    }




}
