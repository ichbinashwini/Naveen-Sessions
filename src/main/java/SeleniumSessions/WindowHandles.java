package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions co = new ChromeOptions();
        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);

//co.addArguments("--headless")
        driver.get("https://www.orangehrm.com/en/contact-sales");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        System.out.println("Parent window title = "+driver.getTitle());
        actions.scrollToElement(driver.findElement(By.linkText("OrangeHRM")))
                .click(driver.findElement(By.linkText("OrangeHRM"))).perform();
        Thread.sleep(2000);

//1. Get window handles
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();

        String w1 = it.next();
        System.out.println(w1);

        String w2 = it.next();
        System.out.println(w2);

//2.Switch window

        driver.switchTo().window(w2);
        System.out.println("Child window title = "+driver.getTitle());
        driver.close();
        Thread.sleep(2000);

        driver.switchTo().window(w1);
        System.out.println("Child window title = "+driver.getTitle());

        driver.quit();
    }


}
