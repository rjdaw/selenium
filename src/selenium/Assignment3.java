package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

    public void run() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\32485\\Documents\\ContractPal\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Create Driver object
        driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");

        driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();

        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='results']")));

        System.out.println(driver.findElement(By.xpath("//*[@id='results']")).getText());
    }
}