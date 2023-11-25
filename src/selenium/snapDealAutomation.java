package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;
import java.util.List;

public class snapDealAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.snapdeal.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='text' and @id='inputValEnter']"));
        searchBox.sendKeys("iphone");
        //Actions act = new Actions(driver);
        Thread.sleep(3000);
        List<WebElement>sugList = driver.findElements(By.xpath("//ul[@class='suggestionList_menu']//following::li"));
        System.out.println("Number of options present in the suggestion box is:"+sugList.size());
        for (WebElement sugg : sugList ){
            if (sugg.getText().contains("Iphone 13 Back Cover")){
                sugg.click();
                //act.sendKeys(Keys.ENTER);
                break;
            }
        }
        //driver.quit();
    }
}
