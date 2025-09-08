package org.llf;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

    // private static String url = "https://the-internet.herokuapp.com/";
    private static String url = "https://chroma.mexil.it/site/login";

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        
        options.setBinary("C:\\Users\\shahid\\bin\\chrome-win\\chrome-win\\chrome.exe");
//        options.setBinary("C:\\Users\\shahid\\bin\\chrome-win\\brave-win\\brave.exe"); // U can also use brave the same way.
        driver.navigate().to(url);
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        try {
			Thread.sleep(500);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
