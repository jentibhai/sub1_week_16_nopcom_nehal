package demo.com.nopcommerce.cucumber.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.com.nopcommerce.pages.*;
import org.junit.Assert;

public class MyAccountsPageSteps {
    @When("^I click on \"([^\"]*)\" tab$")
    public void iClickOnTab(String arg0){
        new HomePage().clickOnMyAccount();
    }

    @Then("^Verify \"([^\"]*)\" text is displayed$")
    public void verifyTextIsDisplayed(String arg0) {
        Assert.assertEquals(new RegisterPage().verifyRegisterAccount(), "Register Account", "Register page not displayed");
    }

    @And("^I select \"([^\"]*)\" menu$")
    public void iSelectMenu(String menu) {
        new HomePage().selectMyAccountOptions(menu);
    }

    @Then("^Verify \"([^\"]*)\" text is displayed on login page$")
    public void verifyTextIsDisplayedOnLoginPage(String arg0){
        Assert.assertEquals(new LoginPage().verifyReturningCustomer(), "Returning Customer", "Login page not displayed");
    }

    @And("^I enter firstname$")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Joe");
    }

    @And("^I enter lasttname$")
    public void iEnterLasttname() {
        new RegisterPage().enterLastName("Jhones");
    }

    @And("^I enter emaidId$")
    public void iEnterEmaidId() {
        new RegisterPage().enterEmail("joejhones23@example.com");
    }

    @And("^I enter telephone$")
    public void iEnterTelephone() {
        new RegisterPage().enterTelephone("9876543215");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("joe123456");
    }

    @And("^I enter confirm password$")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConformPassword("joe123456");
    }

    @And("^I click on Subscribe radio button$")
    public void iClickOnSubscribeRadioButton() {
        new RegisterPage().clickOnSubcribe();
    }

    @And("^I click on privacy policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnAgree();
    }

    @And("^I click on register continue button$")
    public void iClickOnRegisterContinueButton() {
        new RegisterPage().clickOnContinue();
    }

    @And("^Verify the message ???Your Account Has Been Created!???$")
    public void verifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new SuccessPage().verifyYourAccountMessage(), "Your Account Has Been Created!", "Text not displayed");
    }

    @And("^I click on Continue button$")
    public void iClickOnContinueButton() {
        new SuccessPage().clickOnSucessContinueButton();
    }

    @And("^I verify \"([^\"]*)\" is displayed$")
    public void iVerifyIsDisplayed(String account)  {
        Assert.assertEquals(new LogOutPage().verifyAccountLogoutText(), account, "Not logged out");
    }

    @And("^I click on Continue button on logout page$")
    public void iClickOnContinueButtonOnLogoutPage() {
        new LogOutPage().clickOnContinue();
    }

    @And("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

}
