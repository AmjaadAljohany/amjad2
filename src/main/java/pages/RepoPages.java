package pages;
import base.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static objectpath.LoginPath.lbutton;
import static objectpath.RepoPath.*;

public class RepoPages extends baseclass {

    WebDriver driver = null;


    public RepoPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://github.com/tab=repositories");
    }
    public void NewRepo() {
        WebElement NEW = driver.findElement(newRepoButton);
        NEW.click();

    }
    public void NewRepoLink () {
        WebElement NEWLINK = driver.findElement(newRepoLink);
        NEWLINK.click();

    }
    public void RepoName() {
        WebElement Reponame = driver.findElement(repoNameInput);
        Reponame.sendKeys("AMJAD");

    }
    public void CreatRepoBtn() {
        WebElement CreatRepo = driver.findElement(createRepoButton);
        CreatRepo.click();

    }
    public void ClickRepo() {
        WebElement ClickRepo= driver.findElement(clickOnRepo);
        ClickRepo.click();

    }

}
