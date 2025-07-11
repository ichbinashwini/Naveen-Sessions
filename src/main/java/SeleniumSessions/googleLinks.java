package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleLinks {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        ElementUtil eUtil = new ElementUtil(driver);

        //----------------Google search----------------------------
//        brUtil.goToWebsite("http://www.google.com/");
//        By searchTextArea = By.xpath("//textarea[@name='q']");
//      // By predList = By.xpath("//ul/li//div[@class='wM6W7d']/span"); //xpath
//        By predictoinList = By.cssSelector(" ul>li div[class='pcTkSc'] div[class='wM6W7d'] span");
//        eUtil.doSearch(searchTextArea,predictoinList,"automation","automation expo 2025");

//----------------Flipcart serach--------------------------


//        brUtil.goToWebsite("https://www.flipkart.com/");
//
//        By searchTextArea = By.cssSelector("input[type='text'][name='q']");
//        By predictionList = By.xpath("//a[@class='oleBil']/div[2]");
//
//        eUtil.doSearch(searchTextArea,predictionList, "washing", "washing machine" );
//

        //-------------------------Amazon search------------------------

        brUtil.goToWebsite("https://www.amazon.com/");

        By searchTextAreaAm = By.cssSelector("input[placeholder='Search Amazon']");
        By predictionListAm = By.cssSelector("div[id*= sac-suggestion-row][role = 'row']");
        eUtil.doSearch(searchTextAreaAm, predictionListAm, "washing", "washing soda");

        driver.close();
    }


}
