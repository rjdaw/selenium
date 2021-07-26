import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public static void main(String[] args) {
        //Selenium code

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\32485\\Documents\\ContractPal\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Create Driver object
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
        checkbox.click();
        System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());

        //System.out.println(driver.getTitle());
    }
}
