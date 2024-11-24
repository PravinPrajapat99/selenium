package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
//        WebDriver driver= new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("APjFqb")).sendKeys("how to learn selenium");
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]")).click();
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABwAAAAcCAMAAABF0y+mAAAALVBMVEVHcEwujUUvjUYwi0QujUUvjUYvjUYujUUvjUUujUUvjUUvjUYujEUujUUvjUZimRHUAAAADnRSTlMADNYeufPka400e6VKXaau79UAAACrSURBVCiR3ZBZDgMhDEOHLITV9z9uQ6DqIs0BWn8gPQxxkuv6N6WU7mA0EbG6oS5o9fjcEaK5oGzItl0WlWaFoO76Q4dGWs7XOnidHZoGtAXMt9h4QzBC/7p9qkCg9jGE4EYWZqYtheINltnROeSZ3vKBQViTGfKI+kXBDjPSGnR1zQQqo5ooSoQ4zO4QbY/sSdnjFnrtDZ3P/prbkF0v+ayv7Z2Jrjv4GT0AJwcIG55/Qx4AAAAASUVORK5CYII=']")).click();
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,300)");


//        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click();
//        Thread.sleep(2000);
//
//        Alert alert= driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//
//        Robot robot = new Robot();
//        robot.mouseMove(1040,15);
//        Thread.sleep(2000);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        Thread.sleep(1000);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//

//        try {
//            driver.switchTo().alert().accept();
//        }catch (NoAlertPresentException e){
//            System.out.println("no such alert ");
//        }


//        driver.navigate().to("https://persistentpro.e-box.co.in/login");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("pravinprajapat99700@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[2]/div/input")).sendKeys("Pravin@123");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/div[4]/button")).click();
//        Thread.sleep(2000);
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");


//        driver.manage().window().fullscreen();
//
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edureka.co/");
        Actions actions = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("//div[@class='d-flex justify-content-between mt-4'][1]/button[@class='btn btn-primary']"));
//        actions.moveToElement(element).build().perform();

        WebElement ele = driver.findElement(By.xpath("//ul[@class='nav navbar-nav pull-right before_login_head w-auto']/li[5]/span"));
        actions.click(ele).build().perform();
        actions.click(driver.findElement(By.id("si_popup_email"))).sendKeys("pravinprajapat99700@gmail.com").build().perform();
        String user=driver.findElement(By.id("si_popup_email")).getText();
        System.out.println(user);
        actions.click(driver.findElement(By.id("si_popup_passwd"))).sendKeys("Pravin@123").build().perform();
        actions.click(driver.findElement(By.xpath("//form[@class='sup_frm tr_signin_form signin-new-form']/button[text()='Login']"))).build().perform();
        Thread.sleep(2000);
        String err=driver.findElement(By.id("passwdErrorr")).getText();
        System.out.println(err);
        if(err.equals("Sign In Failed. Invalid login credentials.")){

           WebElement signup = driver.findElement(By.xpath("//div[@class='login_video_frm login-vd-box sigin-new-division']/p/span"));
            signup.click();
            driver.findElement(By.id("sg_popup_email")).sendKeys("pravinprajapat99700@gmail.com");
            driver.findElement(By.id("sg_popup_phone_no")).sendKeys("9970075703");
            Actions a= new Actions(driver);
            a.click(driver.findElement(By.xpath("//form[@class='sup_frm signup-new-form']/button"))).build().perform();


        }









    }
}