package com.collab.todoAppDemo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.out.println("brower is open");
        System.setProperty("webdriver.chrome.driver", "/Users/sayeedjoseph/selenium/chromedriver");
        driver = new ChromeDriver();
//       Allows time for web elements to load on the page
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

//        Make the browser full screen
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        System.out.println("user is on google search page");
        driver.get("http://localhost:8000/");
    }
}
