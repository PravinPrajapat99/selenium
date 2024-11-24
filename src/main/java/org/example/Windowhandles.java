package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowhandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
       WebElement ele= driver.findElement(By.xpath("//div[@id='browserWindows']/div[2]/button"));
        System.out.println(driver.getWindowHandle());
        System.out.println("..........................");

        for (int i = 0; i < 4; i++) {
            ele.click();
            Thread.sleep(1000);
        }
        Set<String> set = driver.getWindowHandles();

        for(String handle:set){
            System.out.println(handle);
            driver.switchTo().window(handle);
            driver.get("https://workspace.google.com/intl/en-US/gmail/");
        }

    }
}
