package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class diffXpaths {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/travel/flights?param=DTNavIcon&fm=neo%2Fmerchandising&iid=M_79202d84-5fc9-45f7-81b1-7621a49896e6_1_372UD5BXDFYS_MC.V4ZPKTOAO321&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Travel_V4ZPKTOAO321&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=V4ZPKTOAO321");
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ESCAPE);
        //click on travel option:

        // Use Contains: Xpath=//*[contains(@id,'message')]
        WebElement travelIcon = driver.findElement(By.xpath("//img[contains(@alt,'Travel')]"));
        travelIcon.click();

        //Using OR & AND: Xpath=//*[@type='submit' or @name='btnReset']  Xpath=//input[@type='submit' and @name='btnLogin']
        WebElement departureCity = driver.findElement(By.xpath("//input[ @name = '0-departcity'and@type = 'text']"));
        WebElement arrivalCity = driver.findElement(By.xpath("//input[@name = '0-arrivalcity'and@type = 'text']"));

        //Using Strts With: Xpath=//label[starts-with(@id,'message')]
        WebElement departureCity2 = driver.findElement(By.xpath("//input[starts-with(@name,'0-depart')]"));

        //Using XPath Tesxt() Method: Xpath=//td[text()='UserID']
        WebElement contactNo = driver.findElement(By.xpath("//a[text()='044-45614700']"));

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
