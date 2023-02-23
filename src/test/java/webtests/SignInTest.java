package webtests;

import methods.HomePage;
import methods.SignIn;
import methods.SignUp;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class SignInTest extends DriverSetup {
    HomePage homePage;
    SignIn signin;
    @Test(description = "Sign in with valid credential")
    public void signIn(){
        getDriver().get("https://hotel.testplanisphere.dev/en-US/index.html");
        homePage = new HomePage();
        signin = new SignIn();
        homePage.clickLogIn();
        signin.logIn("diana@example.com", "pass1234");

    }
}
