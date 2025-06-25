package org.exapmle.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://Google.com");
        String value = driver.findElement(By.name("btnK")).getAttribute("data-ved");
        System.out.println(value);
    }
}

