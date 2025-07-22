package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;

public class MultiWindowHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://orangehrm.com/en/contact-sales");

        By facebookEle = By.xpath("//img[@alt='facebook logo']");
        By linkedinEle = By.xpath("//img[@alt='linkedin logo']");
        By youtubeEle = By.xpath("//img[@alt='youtube logo']");

        driver.manage().window().maximize();

        actions.scrollToElement(driver.findElement(facebookEle))
                        .click(driver.findElement(facebookEle)).build().perform();
        driver.findElement(linkedinEle).click();
        driver.findElement(youtubeEle).click();

        String parentWindow = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        Iterator<String> it = allHandles.iterator();

        while (it.hasNext()) {

            String windowId = it.next();
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());


            if(!windowId.equals(parentWindow)){
                driver.close();
            }
            Thread.sleep(2000);


        }

        driver.switchTo().window(parentWindow);     

    }


}
