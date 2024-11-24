package org.example;

import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robots {
    public static void main(String[] args) throws AWTException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.edureka.co/");
        WebElement ele =driver.findElement(By.xpath("//ul[@class='nav navbar-nav pull-right before_login_head w-auto']/li[2]/a"));
        ele.click();
        Robot robot= new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.mouseMove(30,300);
        robot.mouseWheel(1000);
    }
}
