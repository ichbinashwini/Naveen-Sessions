package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionsMoveToElementBigBasketAllElements {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        BrowserUtility brUtil = new BrowserUtility();

        driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://www.bigbasket.com/");


        By shopByCategoryBtn = By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']");
        By categoryL1 = By.xpath("(//div[@id='headlessui-menu-items-:Rimkj6:']//ul)[position()=1]//a");
        By categoryL2 = By.xpath("(//div[@id='headlessui-menu-items-:Rimkj6:']//ul)[position()=2]//a");
        By categoryL3 = By.xpath("(//div[@id='headlessui-menu-items-:Rimkj6:']//ul)[position()=3]//a");

        driver.manage().window().maximize();
        driver.findElement(shopByCategoryBtn).click();
        Thread.sleep(3000);


        List<WebElement> elemetsInL1 = driver.findElements(categoryL1);
        System.out.println("Size of l1 = "+ elemetsInL1.size());

        List<WebElement> elemetsInL2 = driver.findElements(categoryL2);
        System.out.println("Size of l2 = "+ elemetsInL2.size());

        List<WebElement> elemetsInL3 = driver.findElements(categoryL3);
        System.out.println("Size of l3 = "+ elemetsInL3.size());

        Actions action = new Actions(driver);

        for(WebElement eachl1 : elemetsInL1){
            System.out.println(eachl1.getText());
            action.moveToElement(eachl1).perform();
            Thread.sleep(1000);

            for (WebElement eachl2 : elemetsInL2){
                Thread.sleep(1000);
                System.out.println(eachl2.getText());
                action.moveToElement(eachl2).perform();

                for (WebElement eachl3 : elemetsInL3){
                    Thread.sleep(1000);
                    System.out.println(eachl3.getText());
                }

                System.out.println("L2 **************************");
            }
            System.out.println("**************************");

        }





        driver.close();

    }


}
