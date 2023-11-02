package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class mercuryToursAutomation {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement fstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement lstName = driver.findElement(By.xpath("//input[@name='lastName']"));
        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement address =  driver.findElement(By.xpath("//input[@name='address1']"));
        WebElement city =  driver.findElement(By.xpath("//input[@name='city']"));
        WebElement state =  driver.findElement(By.xpath("//input[@name='state']"));
        WebElement postalCode =  driver.findElement(By.xpath("//input[@name='postalCode']"));
        WebElement countryDrpDwn = driver.findElement(By.xpath("//select[@name='country']"));
        WebElement uname =  driver.findElement(By.xpath("//input[@name='email']"));
        WebElement pwd =  driver.findElement(By.xpath("//input[@name='password']"));
        WebElement cnfpwd =  driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));

        //Filling Form:
        fstName.sendKeys("Prabhat");
        Thread.sleep(2000);
        lstName.sendKeys("Ranjan");
        Thread.sleep(2000);
         phone.sendKeys("1234567890");
        Thread.sleep(2000);
         email.sendKeys("xyz@gmail.com");
        Thread.sleep(2000);
         address.sendKeys("BTM");
        Thread.sleep(2000);
         city.sendKeys("Bangalore");
        Thread.sleep(2000);
         state.sendKeys("Karnatka");
        Thread.sleep(2000);
         postalCode.sendKeys("560076");
        Thread.sleep(2000);
         uname.sendKeys("rnjp19");
        Thread.sleep(2000);
        Select drpCountryele = new Select(countryDrpDwn);
        drpCountryele.selectByValue("BAHAMAS");
        Thread.sleep(2000);
         pwd.sendKeys("Prabhat21");
        Thread.sleep(2000);
         cnfpwd.sendKeys("Prabhat@1");
        Thread.sleep(2000);
         SubmitBtn.click();




    }
}
