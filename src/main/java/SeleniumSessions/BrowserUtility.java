package SeleniumSessions;
import SeleniumSessions.ExceptionsClass.BrowserException;
import SeleniumSessions.ExceptionsClass.URLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {
WebDriver driver;

    public WebDriver initBrowser(String browserName){

        switch (browserName.trim().toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            default:
                System.out.println("Enter valid browser name "+ browserName );
                throw new BrowserException("===== Invalid Browser selection =====");

        }
        return driver;
    }

    public void goToWebsite(String url){

        if (url.indexOf("http")!=0){
            throw new URLException("====Invalid URL [http(s) is missing in the url]====");
        }

        driver.get(url);
    }

    public String getPageURL(){
        return driver.getCurrentUrl();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void closeBrowser(){

        driver.quit(); //Session ID object is NULL
        System.out.println("Browser is closed");
    }

    public void quitBrowser(){
        driver.close(); //Session ID expires
        System.out.println("Browser is closed");
    }
}
