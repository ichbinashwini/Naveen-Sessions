package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthPopUp {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions co = new ChromeOptions();
        WebDriver driver = new ChromeDriver(co.addArguments("--incognito"));
        Thread.sleep(3000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000);
        driver.close();
    }

}
