package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertConfirmPrompt {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions co = new ChromeOptions();

        WebDriver driver = new ChromeDriver(co.addArguments("--incognito"));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //********************** JS ALERT *****************************

        // Has only accept option
        driver.findElement(By.xpath("//button[text() ='Click for JS Alert']")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        System.out.println("Title after accepting JS Alert "+driver.getTitle());

        //********************** JS CONFIRM **************************

        //Has accept and cancel options
        driver.findElement(By.xpath("//button[text() ='Click for JS Confirm']")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        System.out.println("Title after accepting JS Alert "+driver.getTitle());

        //************************ JS CONFIRM **************************

        //Has an input field to enter in the prompt
        driver.findElement(By.xpath("//button[text() ='Click for JS Prompt']")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().sendKeys("This is prompt");
        driver.switchTo().alert().accept();
        System.out.println("Title after accepting JS Alert "+driver.getTitle());



    }


}
