package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class BaseMethods {
    public static WebElement getElement(By locator){
        WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void clickElement(By locator){
        getElement(locator).click();
    }
    public void writeText(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }
    public String getAlertText(){
        WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        Alert alert= wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
}
