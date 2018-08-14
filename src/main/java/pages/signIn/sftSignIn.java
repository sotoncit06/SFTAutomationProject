package pages.signIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarja on 7/23/2017.
 */
public class sftSignIn {

    //Declaration of WebDriver
    WebDriver driver;

    //Find username element on Sign in page by id and create a Webelement object
    @FindBy(id="username")
    WebElement username;

    //Find password element on Sign in page by id and create a Webelement object
    @FindBy(id="password")
    WebElement password;

    //Find signIn button element on Sign in page by name and create a Webelement object
    @FindBy(xpath="//button[@type='submit']")
    WebElement signInButton;



    //Constructor of this class to get the webdriver and initialize webelements
    public sftSignIn(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }


    //Method to set username to username field
    public void setUsername(String strUsername) {
        username.sendKeys(strUsername);
    }

    //Method to clear username field
    public void clearUsername(){
        username.clear();
    }

    //Method to set password to password field
    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    //Method to clear password field
    public void clearPassword(){
        password.clear();
    }


    //Method for clicking on signIn button
    public void clickSignIn(){
        signInButton.click();
    }

    //Method to signIn in SFT account

    public void signinSFT(String strUsername, String strPassword) throws InterruptedException {

        Thread.sleep(3000);
        this.clearUsername();
        this.setUsername(strUsername);
        this.clearPassword();
        this.setPassword(strPassword);
        this.clickSignIn();

    }

}
