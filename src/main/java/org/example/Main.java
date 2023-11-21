package org.example;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Iterator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/kirilltimofeev/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.saucedemo.com/");
        WebElement userName= driver.findElement(By.id("user-name"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement button= driver.findElement(By.id("login-button"));

        userName.sendKeys("standart_user");
        password.sendKeys("secret_sauce");
        button.click();
        WebElement label = driver.findElement(By.className("title"));
        assertThat("products").isEqualTo(label.getText());
        driver.quit();







    }

}