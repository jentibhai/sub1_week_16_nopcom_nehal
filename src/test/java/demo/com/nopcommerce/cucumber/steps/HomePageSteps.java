package demo.com.nopcommerce.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.com.nopcommerce.pages.ComponentsPage;
import demo.com.nopcommerce.pages.DesktopPage;
import demo.com.nopcommerce.pages.HomePage;
import demo.com.nopcommerce.pages.LaptopsAndNotebooksPage;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mousehover to desktop and click$")
    public void iMousehoverToDesktopAndClick() {
        new HomePage().mouseHoverToDesktopAndClick();
    }

    @And("^I select menu \"([^\"]*)\"$")
    public void iSelectMenu(String menu) {
        new HomePage().selectMenu(menu);
    }
    @Then("^Verify \"([^\"]*)\" text$")
    public void verifyText(String expectedMessage) {
        Assert.assertEquals("Invalid data",expectedMessage, new DesktopPage().navigateToDesktopErrorMessage());
    }

    @When("^I mouse hover to laptops and notesbook page and click$")
    public void iMouseHoverToLaptopsAndNotesbookPageAndClick() {
        new HomePage().mouseHoverToLaptopsNotebooksAndClick();
    }

    @Then("^I verify \"([^\"]*)\" text$")
    public void iVerifyText(String expectedMessage){
        Assert.assertEquals("Invalid data",expectedMessage, new LaptopsAndNotebooksPage().navigateToLaptopsNotebooksErrorMessage());
    }

    @When("^I mouse hover to Components page and click$")
    public void iMouseHoverToComponentsPageAndClick() {
        new HomePage().mouseHoverToComponentsAndClick();
    }

    @Then("^I verify \"([^\"]*)\" page$")
    public void iVerifyPage(String expectedMessage){
        Assert.assertEquals("Invalid data",expectedMessage, new ComponentsPage().navigateToComponentsErrorMessage());
    }


}
