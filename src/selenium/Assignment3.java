package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

    public void run() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\32485\\Documents\\ContractPal\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Create Driver object
        driver.get("https://www.cleartrip.com/");


    }
}