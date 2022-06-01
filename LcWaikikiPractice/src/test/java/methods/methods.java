package methods;

import driver.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class methods {

    WebDriver driver;

    FluentWait<WebDriver> wait;

    public methods(){

        driver = Main.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(38)).pollingEvery(Duration.ofMillis(300));
    }

    public WebElement findElement(By by) {

        return  wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //tıklatma methodu
    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getText(By by) {
        findElement(by).getText();
    }
    public void select(By by){
        findElement(by).isSelected();
    }


}
