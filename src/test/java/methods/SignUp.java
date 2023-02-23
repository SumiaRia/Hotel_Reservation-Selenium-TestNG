package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BaseMethods{
    private By EMAIL = By.id("email");
    private By PASSWORD = By.id("password");
    private By CONFIRM_PASSWORD = By.id("password-confirmation");
    private By NAME = By.id("username");
    private By ADDRESS = By.id("address");
    private By TEL = By.id("tel");
    private By GENDER = By.id("gender");
    private By DATE_OF_BIRTH =By.id("birthday");
    private By NOTIFICATION =By.id("notification");
    private By SUBMIT =By.xpath("//button[normalize-space()='Sign up']");


    public void fillSignUp(String email, String password, String cpassword, String name, String address, String tel){
        writeText(EMAIL, email);
        writeText(PASSWORD, password);
        writeText(CONFIRM_PASSWORD, cpassword);
        writeText(NAME, name);
        writeText(ADDRESS, address);
        writeText(TEL, tel);
        Select sel_gender = new Select(getElement(GENDER));
        sel_gender.selectByVisibleText("female");
        clickElement(DATE_OF_BIRTH);
        writeText(DATE_OF_BIRTH, "1251999");
        clickElement(NOTIFICATION);
        clickElement(SUBMIT);
    }


}
