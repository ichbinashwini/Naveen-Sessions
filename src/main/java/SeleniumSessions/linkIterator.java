package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class linkIterator {

    static WebDriver driver;

    public static void main(String[] args) {
        BrowserUtility brUtil = new BrowserUtility();
        WebDriver driver = brUtil.initBrowser("Chrome");
        brUtil.goToWebsite("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


       List<WebElement> allLinks =  driver.findElements(By.xpath("//div[@class='list-group']/a"));

       for (WebElement each : allLinks){
           if (each.getText().equals("Order History")){
               break;
           }
           System.out.println(each.getText());
       }

       driver.close();
    }
}