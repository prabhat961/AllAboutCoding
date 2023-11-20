package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class diffXPathstwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/access.php?uid=mngr539578%20&%20pass=yjAvAgA%20&%20email=prabhat961@gmail.com");
        Thread.sleep(3000);
        //Using Following Method: Xpath=//*[@type='text']//following::input:

        //Using Ancestor Method: Xpath=//*[text()='Enterprise Testing']//ancestor::div
        //Using Child method: Xpath=//*[@id='java_technologies']//child::li
        //Using preceeding : Xpath=//*[@type='submit']//preceding::input
        //Using Following-sibling:xpath=//*[@type='submit']//following-sibling::input
        //Using parent method: Xpath=//*[@id='rt-feature']//parent::div
        //Using self: Xpath =//*[@type='password']//self::input
        //Using Descendent: Xpath=//*[@id='rt-feature']//descendant::

    }
}
