package pages.signOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarja on 7/23/2017.
 */
public class sftSignOut {

    //Declaration of WebDriver
    WebDriver driver;

    @FindBy(linkText="Sign out")
    WebElement signOut;

    public sftSignOut(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void clickSignOut(){
        signOut.click();
    }
}
