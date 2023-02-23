package methods;

import org.openqa.selenium.By;

public class SignIn extends BaseMethods{
    private By EMAIL = By.id("email");
    private By LOGIN_BUTTON = By.xpath("//button[@id='login-button']");
    private By PASSWORD = By.id("password");
    public void logIn(String email, String password){
        writeText(EMAIL, email);
        writeText(PASSWORD, password);
        clickElement(LOGIN_BUTTON);
    }
}
