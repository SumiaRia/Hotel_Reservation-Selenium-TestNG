package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverSetup {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private static String browserName = System.getProperty("browser", "Chrome");

    @BeforeMethod(description = "Configure Browser before test")
    public static synchronized void setBrowser() {
        WebDriver webDriver = getBrowser(browserName);
        webDriver.manage().window().maximize();
        setDriver(webDriver);
    }

    @AfterMethod(description = "close Browser after test")
    public static synchronized void quitDriver() {
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverSetup.driver.set(driver);
    }

    public static WebDriver getBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                throw new RuntimeException("Browser not found!!!");
        }

    }
}
