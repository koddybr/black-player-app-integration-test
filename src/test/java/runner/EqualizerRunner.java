package runner;

import activity.Equalizer;
import activity.StarApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class EqualizerRunner {

    Equalizer equalizer = new Equalizer();
    StarApp starApp = new StarApp();
    @Given("I open the app and go to equalizer")
    public void iOpenTheAppAndGoToEqualizer() {
        starApp.grantPermissionButton.click();
        starApp.allowButton.click();

        equalizer.optionEqualizer.clickWait();

    }

    @When("I activate equalizer")
    public void iActivateEqualizer() {
        equalizer.equalizerOn.click();
    }

    @And("I modify equalizer progressBar")
    public void iModifyEqualizerProgressBar() {
        equalizer.equalizer60Hz.moveProgress();
    }

    @Then("Equalizer text should appear")
    public void equalizerTextShouldAppear() {
        Assertions.assertTrue(equalizer.isTextViewDisplayed("EQUALIZER"));
    }

    @And("after click on sound effects")
    public void afterClickOnSoundEffects() {
        equalizer.soundEffects.click();
        equalizer.bassBoost.click();
        equalizer.virtualizer.click();
    }

    @And("should appear REVERB option")
    public void shouldAppearREVERBOption() {
        Assertions.assertTrue(equalizer.isTextViewDisplayed("REVERB"));
    }
}
