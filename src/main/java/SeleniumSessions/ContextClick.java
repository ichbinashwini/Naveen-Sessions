package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ContextClick {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        BrowserUtility brUtil = new BrowserUtility();
        driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://swisnl.github.io/jQuery-contextMenu/demo.html");


        By rightClickBtn = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
        By rightClickBtnEle = By.cssSelector("ul[class='context-menu-list context-menu-root']>li[class*= 'context-menu-icon']");

        Actions action = new Actions(driver);

        action.contextClick(driver.findElement(rightClickBtn)).perform();
        List<WebElement> rightClickBtnOptions = driver.findElements(rightClickBtnEle);

        for (WebElement option : rightClickBtnOptions){
            String text = option.getText();
            System.out.println(text);
            if(text.equals("Delete")){
                action.click(option).perform();
                Thread.sleep(2000);
                break;
            }
        }

        driver.close();


    }


}
