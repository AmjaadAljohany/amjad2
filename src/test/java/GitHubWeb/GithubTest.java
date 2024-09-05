package GitHubWeb;
import base.baseclass;
import io.qameta.allure.*;
import pages.GithubPages;
import pages.LoginPages;
import org.openqa.selenium.WebDriver;
import pages.RepoPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.print.Doc;

import static objectpath.GithubPath.docsLink;
public class GithubTest extends baseclass{
    @Test
    @Epic("Doc flow")
    @Feature("Doc Feature")
    @Story("User view document")
    @Owner("Amjad")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify the method")
    public void mainPageMethod() throws InterruptedException {
        GithubPages github = new GithubPages(driver);
        github.openGitUrl();
        Thread.sleep(2000);
        github.clickOnDocs();
        Thread.sleep(2000);

    }
    @Test
    public void signInMethod() throws InterruptedException {
        GithubPages signIn = new GithubPages(driver);
        signIn.openGitUrl();
        Thread.sleep(3000);
        signIn.clickOnSignInBtn();
        Thread.sleep(3000);

        //Create an instance of LoginPages and use it directly
        LoginPages login = new LoginPages(driver);
        login.usernamefilde();
        Thread.sleep(3000);
        login.passeordfilde();
        Thread.sleep(3000);
        login.buttuonsubmit();
        Thread.sleep(3000);

    }
}

