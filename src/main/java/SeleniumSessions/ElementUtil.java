package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getWebElement(By fNameid) {
        return driver.findElement(fNameid);
    }


    public void doSendKeys(By fNameid, String value) {
        getWebElement(fNameid).sendKeys(value);
    }


    public void doClick(By locator){
        getWebElement(locator).click();

    }

    public String getElementText (By locator){
       return getWebElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator){


        try{
            getWebElement(locator).isDisplayed();
            return true;
        }
        catch (NoSuchElementException e) {
            System.out.println("Element is not displayed");
            return false;
        }

    }

    public void clickElement(By locator, String eleText){

        List<WebElement> eleLinks = driver.findElements(locator);
        System.out.println("Total number of links = "+eleLinks.size());

        for (WebElement each : eleLinks){
            String text = each.getText();
            System.out.println(text);
            if (text.contains(eleText)){
                each.click();
                System.out.println("Clicked on " + eleText);
                break;
            }
        }


    }

    public void doSearch(By searchTextArea,By predictoinList, String searchKey, String clickSearch ) throws InterruptedException {

        doSendKeys(searchTextArea, searchKey);

        Thread.sleep(3000);

        List<WebElement> eleLinks = driver.findElements(predictoinList);
        System.out.println("Total number of links = "+eleLinks.size());

        for (WebElement each : eleLinks){
            String text = each.getText();
            System.out.println(text);
            if (text.equals(clickSearch)){
                each.click();
                System.out.println("Clicked on " + clickSearch);
                break;
            }
        }

    }

}
