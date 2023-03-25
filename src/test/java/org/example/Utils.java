package org.example;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Utils {

    // Waits for an element to load for a specified period of time in seconds.
    public static void waitForElementToLoadSeconds(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Waits for an element to load for a specified period of time in milliseconds.
    public static void waitForElementToLoadMillis(int timeUnit) {
        try {
            TimeUnit.MILLISECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Scrolls into view and waits for element to load.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoadSeconds(3);
    }
}
