package GitHubWeb;
import base.baseclass;
import org.openqa.selenium.WebDriver;
import pages.GithubPages;
import pages.LoginPages;
import org.testng.annotations.Test;

import java.sql.Driver;
public class GithubHomeTest extends baseclass{
   @Test (testName = "TS-001")
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);
        login.openUrl();
        login.usernamefilde();
        login.passeordfilde();
        login.buttuonsubmit();

    }
    @Test (testName = "TS-002")
    public void HomePageMethod() throws InterruptedException {
        GithubPages home = new GithubPages(driver);
       // loginPageMethod();
        // use previous method
        home.openGitUrl();
        home.clickOnSignInBtn();
        home.clickOnDocs();


}}
