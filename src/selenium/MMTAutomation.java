package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class MMTAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com/flights/");
        WebElement frameExit = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        frameExit.click();
        Thread.sleep(2000);
        List<WebElement> greyTxt = driver.findElements(By.xpath("//p[@class='font12 appendBottom3']"));
        System.out.println("No. of options available:" + greyTxt.size());

        for (WebElement sugg : greyTxt) {
            System.out.println( sugg.getText());
        }
    }
}
