package org.exapmle.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
