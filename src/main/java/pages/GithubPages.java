package pages;
import base.baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static objectpath.GithubPath.*;
public class GithubPages {

    WebDriver driver = null;

    public GithubPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn() {
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }
    public void clickOnDocs() throws InterruptedException {
        WebElement Docs = driver.findElement(docsLink);
        Docs.sendKeys(Keys.END);
        //Using selenium Keys to scroll down page
        Docs.click();
        Thread.sleep(2000);
        boolean gitHubAssert = driver.findElement(githubDocsText).isDisplayed();
        Assert.assertTrue(true);


    }

}
