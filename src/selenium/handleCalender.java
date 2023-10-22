package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class handleCalender {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.spicejet.com/");

        driver.quit();

    }
}
