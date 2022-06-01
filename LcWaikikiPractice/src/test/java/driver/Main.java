package driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static WebDriver driver;

@Before
    public void setUp() {

    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();

    driver = new ChromeDriver(chromeOptions);
    driver.manage().window().maximize();
    driver.get("https://www.lcwaikiki.com/tr-TR/TR"); //LC Waikiki sayfası açılır.

}

@After
    public void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
    }
}
