package webtests;

import methods.HomePage;
import methods.SignIn;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class LogoutTest extends DriverSetup {
    HomePage homePage;
    SignUpTest signuptest;
    @Test(description = "Logout from homepage")
    public void logoutTest() {
//        getDriver().get("https://hotel.testplanisphere.dev/en-US/mypage.html");
        homePage = new HomePage();
        signuptest = new SignUpTest();
        signuptest.signUp();
        homePage.clickLogout();
    }
}
