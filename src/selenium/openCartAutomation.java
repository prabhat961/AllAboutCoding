package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class openCartAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

        //Count Footelink
        List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//div[@class='container']//a"));
        System.out.println("Number of auto Suggestion present is:"+footerLinks.size());
                for (WebElement fl: footerLinks) {
            if (fl.getText().contains("My Account")) {
                fl.click();
                break;
            }
        }
        //Registration page

        List<WebElement> sideMenu = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
        System.out.println("Number of auto Suggestion present is:"+sideMenu.size());
        for (WebElement sm: sideMenu) {
            if (sm.getText().contains("Register")) {
                sm.click();
                break;
            }
        }
        //FIlling Registration Form and submit

        WebElement FName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement LName = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement phone = driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement pwd = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement pwdcnf = driver.findElement(By.xpath("//input[@id='input-confirm']"));
        WebElement subsbtn = driver.findElement(By.xpath("//label[@class ='radio-inline']//input[@value ='1']"));
        WebElement Agreebtn = driver.findElement(By.xpath("//input[@name='agree']"));
        WebElement COntinuesbtn = driver.findElement(By.xpath("//input[@type='submit']"));

        FName.sendKeys("Prabhat");
        Thread.sleep(2000);
        LName.sendKeys("Ranjan");
        Thread.sleep(2000);
        email.sendKeys("prabhat961@gmail.com");
        Thread.sleep(2000);
        phone.sendKeys(String.valueOf(1234567890));
        Thread.sleep(2000);
        pwd.sendKeys("prabhat@1");
        Thread.sleep(2000);
        pwdcnf.sendKeys("prabhat@1");
        Thread.sleep(2000);
        subsbtn.click();
        Thread.sleep(2000);
        Agreebtn.click();
        Thread.sleep(2000);
        COntinuesbtn.click();
    }
}
