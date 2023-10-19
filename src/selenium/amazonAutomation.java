package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class amazonAutomation {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        // key in to searchbox
        WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        searchBox.sendKeys("iphone");
        List<WebElement> SuggestionBox = driver.findElements(By.xpath("//div[@class='two-pane-results-container']//div[@class ='s-suggestion-container']//div"));
        System.out.println("Number of auto Suggestion present is:"+SuggestionBox.size());
        for (WebElement so: SuggestionBox){
            if (so.getText().contains("iphone 14")) {
                so.click();
                break;

            }
        }
    }
}
