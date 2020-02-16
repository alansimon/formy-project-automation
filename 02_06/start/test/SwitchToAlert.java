import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asimon\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button"));

        Thread.sleep(2000);

        alertButton.click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);

        alert.accept();

        Thread.sleep(2000);

        driver.quit();
    }
}
