import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Testng {
    public WebDriver driver;
    @BeforeTest
    public void createdriver(){
         driver= new ChromeDriver();
    }


    @Test
    public void login() throws InterruptedException {
        driver.get("https://persistentpro.e-box.co.in/login");
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("pravinprajapat99700@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("Pravin@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[4]/button")).click();
        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
//        System.out.println(driver.getTitle());
        Assert.assertEquals("Persistent Systems",driver.getTitle());
    }



    @AfterTest
    public void closing(){
        driver.close();
    }


}
