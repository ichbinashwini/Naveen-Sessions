package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebElement(By elementLocator) {
        return driver.findElement(elementLocator);
    }


    public void doSendKeys(By elementLocator, String value) {
        getWebElement(elementLocator).sendKeys(value);
    }


    public void doClick(By locator) {
        getWebElement(locator).click();

    }

    public String getElementText(By locator) {
        return getWebElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator) {


        try {
            getWebElement(locator).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Element is not displayed");
            return false;
        }

    }

    public void clickElement(By locator, String eleText) {

        List<WebElement> eleLinks = driver.findElements(locator);
        System.out.println("Total number of links = " + eleLinks.size());

        for (WebElement each : eleLinks) {
            String text = each.getText();
            System.out.println(text);
            if (text.contains(eleText)) {
                each.click();
                System.out.println("Clicked on " + eleText);
                break;
            }
        }


    }

    public void doSearch(By searchTextArea, By predictoinList, String searchKey, String clickSearch)
            throws InterruptedException {

        doSendKeys(searchTextArea, searchKey);

        Thread.sleep(4000);

        List<WebElement> eleLinks = driver.findElements(predictoinList);
        System.out.println("Total number of links = " + eleLinks.size());

        for (WebElement each : eleLinks) {
            String text = each.getText();
            System.out.println(text);
            if (text.equals(clickSearch)) {
                each.click();
                System.out.println("Clicked on " + clickSearch);
                break;
            }
        }

    }
//********************** DropDown methods **************************************

    public void selectDropByIndex(By dropDownLocator, int optionIndex) throws InterruptedException {
        Select dropDownWebEle = new Select(getWebElement(dropDownLocator));
        dropDownWebEle.selectByIndex(optionIndex);
        Thread.sleep(2000);
    }

    public void selectDropDownByValue(By dropDownLocator, String value) throws InterruptedException {
        Select dropDownWebEle = new Select(getWebElement(dropDownLocator));
        dropDownWebEle.selectByValue(value);
        Thread.sleep(2000);
    }

    public void selectDropDownByVisibilty(By dropDownLocator, String visibleString) throws InterruptedException {
        Select dropDownWebEle = new Select(getWebElement(dropDownLocator));
        dropDownWebEle.selectByVisibleText(visibleString);
        Thread.sleep(2000);
    }

    public void getDropDownOptionAndClick(By locator, String clickOn) throws InterruptedException {

        Select selectCountry = new Select(getWebElement(locator));

        List<WebElement> optionsList = selectCountry.getOptions();

        for (WebElement e : optionsList) {
            System.out.println(e.getText());
            if (e.getText().equals(clickOn)) {
                e.click();
                Thread.sleep(2000);
                System.out.println("Clicked on = "+clickOn);
                break;
            }
        }

    }

    public void getDropDownOptionsWithoutSelectClass (String dropDown ,By dropDownLocator){
        List<WebElement> countryWebElements = driver.findElements(dropDownLocator);

        System.out.println(" ");
        System.out.println("This is the list of " +dropDown);

        for (WebElement e : countryWebElements) {
            System.out.println(e.getText());
        }
    }

}
