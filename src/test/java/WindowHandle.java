import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle {
    WebDriver driver;

    @BeforeTest
    public void initialize(){
         driver = new ChromeDriver();
         driver.get("https://www.edureka.co/");
    }

    @Test
    public  void window(){
        driver.findElement(By.xpath("//header//div[3]/input")).sendKeys("selenium course");

    }
}
