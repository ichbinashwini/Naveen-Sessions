package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

    static WebDriver driver;
    static Actions actions;

    public static void main(String[] args) throws InterruptedException {

        //Partial scrolling-- PAGE_DOWN, PAGE_UP
        //Full scrolling-- COMMAND+ arrow up/ Down
        //ScrollToElement-- scrollToElement

        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");

        ElementUtil eleUtil = new ElementUtil(driver);

        brUtil.goToWebsite("https://www.amazon.in/");
        actions = new Actions(driver);


        //************************* Partial scrolling ***************************

//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(2000);

//        actions.sendKeys(Keys.PAGE_UP).perform();
//        Thread.sleep(2000);

        eleUtil.partialScrollDown();
        eleUtil.partialScrollUp();


        //************************* Full scrolling ***************************


        actions.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

        actions.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
        Thread.sleep(2000);


        // ************************* Scroll to element**************************

        By footerEle = By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//li/a[@class='nav_a'])[last()]");
        Thread.sleep(3000);
        actions.scrollToElement(driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//li/a[@class='nav_a'])[last()]")))
                .click(driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//li/a[@class='nav_a'])[last()]"))).perform();
        Thread.sleep(3000);


        driver.close();


    }

}
