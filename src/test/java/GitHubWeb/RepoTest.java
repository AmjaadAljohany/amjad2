package GitHubWeb;

import base.baseclass;
import pages.LoginPages;
import pages.RepoPages;
import org.testng.annotations.Test;

public class RepoTest extends baseclass {


    @Test
    public void RepoPageMethod() throws  InterruptedException{
        RepoPages Repo = new RepoPages(driver);

        Repo.openUrl();
        Thread.sleep(3000);
        Repo.NewRepo();
        Repo.NewRepoLink();
        Repo.RepoName();
        Repo.CreatRepoBtn();
        Repo.ClickRepo();
       // Repo.scrollToPosition(0,600);

    }
}

