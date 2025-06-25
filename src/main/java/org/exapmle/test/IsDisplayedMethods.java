package org.exapmle.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class IsDisplayedMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        //page load for duration 2 seconds
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        if(driver.findElement(By.name("newsletter")).isDisplayed()){
            if(!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){
                driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
            }
        }
        if (driver.findElement(By.name("agree")).isEnabled()) {
            driver.findElement(By.name("agree")).click();
        }
        driver.quit();
    }
}
