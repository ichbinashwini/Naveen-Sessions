package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;

public class AlertHandling {


    public static void main(String[] args) throws InterruptedException {

        ChromeOptions co= new ChromeOptions();
       // ChromeDriver driver = new ChromeDriver(co.addArguments("--headless"));
        ChromeDriver driver = new ChromeDriver(co.addArguments("--incognito"));

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        String title = driver.getTitle();
        System.out.println("Title = "+title);

        By mailIdEle = By.id("login1");
        By passwordEle = By.id("password");
        By loginBtnEle = By.xpath("//button[text() ='Log In']");

        driver.findElement(mailIdEle).sendKeys("ashw");
        driver.findElement(loginBtnEle).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.findElement(mailIdEle).clear();
        driver.findElement(passwordEle).sendKeys("123456");
        driver.findElement(loginBtnEle).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.findElement(mailIdEle).sendKeys("ashw");
        driver.findElement(passwordEle).sendKeys("123456");
        driver.findElement(loginBtnEle).click();
        Thread.sleep(2000);
       System.out.println(driver.getTitle());


        driver.close();


    }


}
