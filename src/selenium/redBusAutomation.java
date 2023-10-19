package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class redBusAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redbus.in/");
        //Alert alerts1 = driver.switchTo().alert();
        //alerts1.accept();
        //Book Ticket
        WebElement srcStation = driver.findElement(By.xpath("//input[@id='src']"));
        WebElement destStation = driver.findElement(By.xpath("//div[@class='sc-htpNat kWSbju']"));
        WebElement dtdPicker = driver.findElement(By.xpath("//div[@id='onwardCal']"));
        //Select Dates
        String Month = " Dec 2023";
        String Day = "15";

        srcStation.sendKeys("Patna");
        Thread.sleep(2000);
        destStation.sendKeys("Ranchi");
        Thread.sleep(2000);
        dtdPicker.click();





    }
}
