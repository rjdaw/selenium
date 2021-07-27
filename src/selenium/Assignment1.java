package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public void run() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\32485\\Documents\\ContractPal\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Create Driver object
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        for (int i = 0; i < 2; i++) {
            WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
            checkbox.click();
            Thread.sleep(1500);
            System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
        }

        //Checks for number of checkboxes selected
        System.out.println("There are " + driver.findElements(By.cssSelector("input[value='checkbox']")).size() + " checked boxes.");
    }
}