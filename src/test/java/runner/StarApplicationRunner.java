package runner;

import activity.StarApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StarApplicationRunner {
    private StarApp starApp = new StarApp();
    @Given("I open the application")
    public void iOpenTheApplication() {
    }

    @When("I select permission for the application")
    public void iSelectPermissionForTheApplication() {
        starApp.grantPermissionButton.click();
    }

    @And("Selected allow")
    public void selectedAllow() {
        starApp.allowButton.click();
    }

    @Then("BlackPlayer start the application")
    public void blackplayerStartTheApplication() {
        Assertions.assertTrue(starApp.isTextDisplayed("Library"));

        Assertions.assertTrue(starApp.isTextDisplayed("Playlists"));
    }

}
