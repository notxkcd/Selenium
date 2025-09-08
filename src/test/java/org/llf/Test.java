package org.llf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

    // private static String url = "https://the-internet.herokuapp.com/";
    private static String url = "https://chroma.mexil.it/site/login";

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
    }
}
