package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.signIn.sftSignIn;
import pages.signOut.sftSignOut;
import testdata.getExcelData;

import static testcases.configuration.driver;

/**
 * Created by sarja on 7/23/2017.
 */
public class testSftSignIn {

    //Declaration of SFT sign in page and getExcelData objects.
    sftSignIn objLogin;
    sftSignOut objSignout;
    getExcelData getExlObj;

    //Test will be initiated from here by TestNG framework. This method will open facebook signIn page and sign in to facebook using
    //the specified email address and password in credential.xls
    @Test(dataProvider="sftLogin")
    public void testSftSignIn(String userName, String password) throws InterruptedException {

        //Navogate to sft signIn page
        driver.get("http://rupshav13/bds");

        //Create SFT SignIn Page object
        objLogin = new sftSignIn(driver);

        //signIn to SFT
        objLogin.signinSFT(userName, password);

        objSignout = new sftSignOut(driver);
        objSignout.clickSignOut();


    }

    //Test will be initiated from here by TestNG framework. This method will read the credential.xls file and extrace email, password
    // and pass it to "test_Login" through @Dataprovider
    @DataProvider(name="sftLogin")
    public Object[][] loginData() {
        getExlObj= new getExcelData();
        Object[][] arrayObject = getExlObj.getExcelData("credential.xls","Sheet1");
        return arrayObject;
    }


}
