package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ebayAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        //Scenario1:
        WebElement shopByCat = driver.findElement(By.id("gh-shop-ei"));
        shopByCat.click();
        Thread.sleep(3000);
        WebElement CellPhoneCat = driver.findElement(By.xpath("//a[normalize-space()='Cell phones & accessories']"));
        CellPhoneCat.click();
        Thread.sleep(3000);
        //Cell phone and smart Phones link click
        WebElement cellAndSmart = driver.findElement(By.xpath("//a[contains(text(),'Cell Phones & Smartphones')]"));
        cellAndSmart.click();
        Thread.sleep(3000);
        //Clicking on All Fillters
        WebElement allFillters = driver.findElement(By.xpath("//button[@type='button' and@aria-label='All Filters']"));
        allFillters.click();

        driver.quit();



    }
}
