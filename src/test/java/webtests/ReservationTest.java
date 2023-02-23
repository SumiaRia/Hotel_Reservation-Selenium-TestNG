package webtests;

import methods.HomePage;
import methods.Reservation;
import methods.SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.By.xpath;

public class ReservationTest extends DriverSetup {
    HomePage homePage;
    Reservation reservation;
    SignInTest signintest;
    @Test(description = "Login with credential after that reservation successfully")
    public void reservationTest() throws InterruptedException {
        signintest = new SignInTest();
        homePage = new HomePage();
        reservation = new Reservation();
        //creating object for another test class
        signintest.signIn();
        homePage.clickReservation();
        reservation.clickReserveRoom();
        Set<String> window =getDriver().getWindowHandles();
        Iterator<String> it = window.iterator();
        String parent = it.next();
        String child =it.next();
        getDriver().switchTo().window(child);
        reservation.fillReservation();
        Thread.sleep(3000);
        reservation.submitReservation();
        Thread.sleep(3000);
        WebElement ALERT_TEXT = getDriver().findElement(By.xpath("//p[normalize-space()='We look forward to visiting you.']"));
        String Text = ALERT_TEXT.getText();
        Assert.assertEquals("We look forward to visiting you.",Text,"Title is matched");
        reservation.clickCloseButton();

    }


}
