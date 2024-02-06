package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class motorollaAssingment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://uat-loginvsa.motorolasolutions.com/s/login/");

        WebElement OnexPath =;
        WebElement OneCSS =;
        WebElement TwoxPath =;
        WebElement TwoCSS =;
        WebElement ThreexPath =;
        WebElement ThreeCSS =;
        WebElement FourxPath =;
        WebElement FourCSS =;
        WebElement FivexPath =;
        WebElement FiveCSS =;
        WebElement SixxPath =;
        WebElement SixCSS =;
        WebElement SevenxPath =;
        WebElement SevenCSS =;
        WebElement EightxPath =;
        WebElement EightCSS =;
        WebElement NinexPath =;
        WebElement NineCSS =;
        WebElement TenxPath =;
        WebElement TenCSS =;


    }

}
