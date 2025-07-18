package org.exapmle.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Options {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element=  driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        List<WebElement> options = select.getOptions();
        System.out.println("All options:");
        for (WebElement e : options) {
            System.out.println(e.getText());
        }
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("First Selected Option:");
        System.out.println(firstSelectedOption.getText());
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("Selected Option:");
        for (WebElement e : selectedOptions) {
            System.out.println(e.getText());
        }
    }
}
