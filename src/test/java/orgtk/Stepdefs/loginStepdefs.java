package orgtk.Stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orgtk.BaseClass;
import orgtk.PageObjects.LoginPage;
import orgtk.Utils.PropertiesUtil;

import java.util.Properties;

public class loginStepdefs extends BaseClass {

    Properties properties = PropertiesUtil.loaduserProperties();


    @Given("user enters valid username in he username  field")
    public void userEntersValidUsernameInHeUsernameField() {

        String username = properties.getProperty("username");
        LoginPage.enterUsername(username);

    }

    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);


    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLogin();

    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("user enters invalid username in he username  field")
    public void userEntersInvalidUsernameInHeUsernameField() {
    }

    @And("user enters invalid password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {
    }
}
