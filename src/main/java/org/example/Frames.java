package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Actions actions = new Actions(driver);
        WebElement ele= driver.findElement(By.xpath("//div[@class='ui-widget ui-helper-clearfix']//li[2]"));
        WebElement box= driver.findElement(By.xpath("//div[@class='ui-widget ui-helper-clearfix']//div"));
        actions.dragAndDrop(ele,box).build().perform();
    }
}
