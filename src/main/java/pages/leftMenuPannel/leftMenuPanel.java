package pages.leftMenuPannel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarja on 7/30/2017.
 */
public class leftMenuPanel {


    //----------------Declare web elements starts here------

    //Declaration of WebDriver
    WebDriver driver;

    //Find Administration tab by xpath
    @FindBy(xpath = "//li[@id='adminSidemenu']/a/span[2]")
    WebElement administration;

    //Find Server configuration tab by xpath
    @FindBy(xpath = "//li[@id='serverConfigLink']/a/span[2]")
    WebElement serverConfiguration;


    //----------------Declare web elements ends here------


    //Constructor of this class to get the webdriver and initialize webelements
    public leftMenuPanel(WebDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }


    //----------- Declare methods for web elements start ------------

    //Click administration tab
    public void clickAdministration(){administration.click();}

    //Click server Configuration tab
    public void clickServerConfiguration(){serverConfiguration.click();}


    //----------- Declare methods for web elements ends ------------




}
