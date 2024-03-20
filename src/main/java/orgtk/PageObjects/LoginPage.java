package orgtk.PageObjects;

import org.openqa.selenium.By;
import orgtk.BaseClass;
import orgtk.Utils.BrowserUtils;

public class LoginPage extends BaseClass {
    public static String Email = "//input[@id='input-email']";
    public static String pass = "//input[@id='input-password']";
    public static String login = "//input[@value='Login']";
    public static String forgotPassword = "(//a[text()='Forgotten Password'])[1]";

    public static void enterUsername(String username){

        BrowserUtils.enterText(Email, username);
    }

    public static void enterPassword(String password){
        BrowserUtils.enterText(pass, password);
    }

    public static void clickLogin(){
        BrowserUtils.clickElement(login);
    }
    public static void clickForgottenPassword(){
        driver.findElement(By.xpath(forgotPassword)).click();
    }
}


