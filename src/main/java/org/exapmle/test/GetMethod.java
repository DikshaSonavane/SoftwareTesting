package org.exapmle.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://Google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String code = driver.getPageSource();

        if (code.contains("en-IN")){
            System.out.println("Text is present in the source code");
        }
        else {
            System.out.println("Text is not present in the source code");
        }
        //driver.close(); //close only single browser which is open by this project
        driver.quit(); // closes all the browser open by the project
    }
}
