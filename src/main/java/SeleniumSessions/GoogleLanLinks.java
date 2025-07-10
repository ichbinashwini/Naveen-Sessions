package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleLanLinks {

    static WebDriver driver;

    public static void main(String[] args) {
        BrowserUtility brUtil = new BrowserUtility();
        WebDriver driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://www.google.com/");

        ElementUtil eUtil = new ElementUtil(driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        By lanElement = By.id("//div[@id= 'SIvCob']/a");

      List<WebElement> eList = driver.findElements(lanElement);
      if (eList.size() ==0){
          System.out.println("List is empty");
      }else   System.out.println("List is NOT empty");

      for (WebElement each : eList){
          System.out.println(each.getText());
        }

    }
}