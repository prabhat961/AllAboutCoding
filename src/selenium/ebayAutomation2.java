package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import java.util.List;

public class ebayAutomation2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        //Scenario 2:
        WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
        searchBar.sendKeys("MacBook");
        Thread.sleep(3000);
        WebElement searchDrpDwn = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select drpCategory = new Select(searchDrpDwn);
        drpCategory.deselectByValue("0");
        drpCategory.deselectByValue("58058");
        Thread.sleep(3000);
        List<WebElement> catList = driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
        System.out.println("No. of Category Ebay has:"+catList.size());
        for (WebElement so : catList) {
            if (so.getText().contains("Computers/Tablets & Networking")) {
                so.click();
                break;
            }
                WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
                searchBtn.click();

            List<WebElement> prodList = driver.findElements(By.xpath("//span[@role='heading']"));
            System.out.println(prodList.get(1).getText());
            System.out.println("No. of Category Ebay has:"+catList.size());
            for (WebElement product: prodList) {
            	System.out.println(product.getText());
				
			}
            
            String firstProduct = prodList.get(1).getText();
            System.out.println("First Product in the search page is:"+firstProduct);
            if (firstProduct.contains("MacBook")){
                System.out.println("Test Passed");
            }

                driver.quit();
        }
    }
}
