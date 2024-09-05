package objectpath;

import org.openqa.selenium.By;

public class RepoPath {



    public static final By newRepoButton = By.xpath("//button[@id='global-create-menu-anchor']");

    public static final By newRepoLink = By.xpath("//*[contains(text(),'New repository')]");

    public static final By repoNameInput = By.xpath("//input[@data-testid='repository-name-input']");

    public static final By createRepoButton = By.xpath("//span[text()='Create repository']");

    public static final By clickOnRepo = By.xpath("//a[contains(@href, '/jood0998@gmail.com/" + repoNameInput + "')]");
}
