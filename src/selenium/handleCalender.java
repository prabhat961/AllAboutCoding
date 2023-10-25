package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class handleCalender {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","E:\\Selenium New\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("E:\\Selenium New\\chrome CFT\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.spicejet.com/");

        //ooking flight
        WebElement tripTypeoneWay = driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[1]/div[1]//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='circle']"));
        WebElement tripTypebothWay = driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[2]/div[1]//*[name()='svg']//*[name()='circle' and contains(@cx,'9')]"));
      tripTypebothWay.click();
        WebElement srcCity = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']"));
        srcCity.click();
        Thread.sleep(3000);
        List<WebElement> srcCitydrpdwn = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-1srvcxg']"));
        System.out.println("No of elements present in the drop down is :"+srcCitydrpdwn.size());

        //cityName.deselectByVisibleText("Bagdogra");
        for (WebElement sugg : srcCitydrpdwn ) {
            if (sugg.getText().contains("Bagdogra")) {

                sugg.click();
                break;
            }
        }
        WebElement destCity = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@type='text']"));
               destCity.click();
               Thread.sleep(3000);
        List<WebElement> destCitydrpdwn = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']"));
        System.out.println("No of elements present in the drop down is :"+destCitydrpdwn.size());
        for (WebElement sugg : destCitydrpdwn ) {
            if (sugg.getText().contains("Chennai")) {

                sugg.click();
                break;
            }
        }

    }
}
