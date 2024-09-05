package GitHubWeb;

import base.baseclass;
import pages.LoginPages;

import org.testng.annotations.Test;

public class LoginTest extends baseclass {

    @Test
    public void loginPageMethod() throws  InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.usernamefilde();
        login.passeordfilde();
        login.buttuonsubmit();


    }}


