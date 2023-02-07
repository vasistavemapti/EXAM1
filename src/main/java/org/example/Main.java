package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    @Test
    public void test()
    {
         WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.github.com/login");
        highlight(driver,driver.findElement(By.id("login_field")));
        highlight(driver,driver.findElement(By.name("password")));
        highlight(driver,driver.findElement(By.className("header-logo")));
        highlight(driver,driver.findElement(By.linkText("Forgot password?")));

        highlight(driver,driver.findElement(By.partialLinkText("Create an account")));


    }

    public static void highlight(WebDriver driver, WebElement element)
    {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].setAttribute('style', 'background: orange;')", element);
    }
}