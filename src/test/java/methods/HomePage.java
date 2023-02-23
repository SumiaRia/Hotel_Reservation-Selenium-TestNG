package methods;

import org.openqa.selenium.By;

public class HomePage extends BaseMethods{
    private By SIGN_UP_PAGE = By.xpath("//a[normalize-space()='Sign up']");
    private By LOGIN = By.xpath("//a[normalize-space()='Login']");
    private By RESERVATION = By.xpath("//a[normalize-space()='Reserve']");
    private By LOGOUT = By.xpath("//button[normalize-space()='Logout']");

    //sign_up
    public void clickSignUp(){
        clickElement(SIGN_UP_PAGE);
    }
    public void clickLogIn(){
        clickElement(LOGIN);
    }
    public void clickReservation(){
        clickElement(RESERVATION);
    }
    public void clickLogout(){
        clickElement(LOGOUT);
    }

}
