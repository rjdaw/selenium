package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public void run() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\32485\\Documents\\ContractPal\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Create Driver object
        driver.get("https://www.cleartrip.com/");

        Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
        dropdown1.selectByVisibleText("2");

        Thread.sleep(1000);

        Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select")));
        dropdown2.selectByVisibleText("2");

        Thread.sleep(1000);

        Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[4]/div/div[5]/select")));
        dropdown3.selectByVisibleText("1");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div/div[2]/div/div[7]/div[2]/button")).click();

        Thread.sleep(1000);

        System.out.println("The error you're getting is \"" + driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div[2]/div/div/div/span")).getText() + "\"");
    }
}