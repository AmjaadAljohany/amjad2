package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class baseclass {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
        //    System.setProperty("user + dir" + "//drivers//chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://github.com");


    }
    @AfterClass
    public void tearDown() {
        driver.quit();


    }
}


