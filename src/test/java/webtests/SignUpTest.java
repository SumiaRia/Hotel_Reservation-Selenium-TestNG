package webtests;

import methods.HomePage;
import methods.SignUp;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class SignUpTest extends DriverSetup {
    HomePage homePage;
    SignUp signup;
    @Test(description = "SignUP successfully")
    public void signUp(){
        getDriver().get("https://hotel.testplanisphere.dev/en-US/index.html");
        homePage = new HomePage();
        signup = new SignUp();
        homePage.clickSignUp();
        signup.fillSignUp("dian@example.com", "pass1234", "pass1234", "dian", "12rdn", "09876541211");

    }

}
