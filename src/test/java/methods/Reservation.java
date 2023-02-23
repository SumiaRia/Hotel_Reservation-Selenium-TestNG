package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static utilities.DriverSetup.getDriver;

public class Reservation extends BaseMethods{
    private By RESERVE_ROOM = xpath("//div[@class='card text-center shadow-sm']//a[@class='btn btn-primary'][normalize-space()='Reserve room']");
    private By DATE = By.id("date");
    private By SELECT_MONTH = xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    private By SEELECT_DATE = xpath("//a[normalize-space()='31']");
    private By DATE_DONE = xpath("//button[normalize-space()='Done']");
    List<WebElement> ADDITIONAL_PLAN=getDriver().findElements(By.xpath("//div[@class='form-check']//input[@class='form-check-input needs-calc']"));
    private By SELECT_CONFIRAMATION =By.id("contact");
    private By CONFIRM_RESERVATION = xpath("//button[@id='submit-button']");
    private By SUBMIT_RESERVATION = xpath("//button[normalize-space()='Submit Reservation']");
    private By CLOSE_BUTTON = xpath("//button[normalize-space()='Close']");


    public void clickReserveRoom(){
        clickElement(RESERVE_ROOM);
    }
    public void fillReservation(){
        clickElement(DATE);
        clickElement(SELECT_MONTH);
        clickElement(SEELECT_DATE);
        for(WebElement ck: ADDITIONAL_PLAN) {
            String check= ck.getText();
            if(check.equalsIgnoreCase("Breakfast")||check.equals("Sightseeing")){
                ck.click();
        }

    }
        Select confirmation_sel = new Select(getElement(SELECT_CONFIRAMATION));
        confirmation_sel.selectByValue("no");
        clickElement(CONFIRM_RESERVATION);

    }
    public void submitReservation(){
        clickElement(SUBMIT_RESERVATION);
    }
    public void clickCloseButton(){
        clickElement(CLOSE_BUTTON);
    }
}
