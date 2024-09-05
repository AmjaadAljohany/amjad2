package pages;

import base.baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static objectpath.LoginPath.*;

public class LoginPages extends baseclass {

    WebDriver driver = null;


    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://github.com/login");
    }


    public void usernamefilde() {
        WebElement Username = driver.findElement(username);
        Username.sendKeys("joood998@gmail.com");
    }

    public void passeordfilde() {
        WebElement Password = driver.findElement(password);
        Password.sendKeys("****");
    }

    public void buttuonsubmit() {
        WebElement Lbutton = driver.findElement(lbutton);
        Lbutton.click();

    }

}
