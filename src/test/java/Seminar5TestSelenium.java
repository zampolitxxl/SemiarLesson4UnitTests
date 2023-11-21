import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seminar5TestSelenium {


    @Test
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






}
