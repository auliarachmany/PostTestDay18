package com.test18.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "D:\\Juara Coding\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
