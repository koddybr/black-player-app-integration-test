package runner;

import activity.PlayList;
import activity.SearchMusic;
import activity.StarApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SearchFileRunner {
    private String title="nang";
    SearchMusic searchMusic = new SearchMusic();
    StarApp starApp = new StarApp();
    PlayList playList = new PlayList();
    @Given("I select option search")
    public void iSelectOptionSearch() {
        starApp.grantPermissionButton.click();
        starApp.allowButton.click();

        searchMusic.buttonSearch.clickWait();
        searchMusic.buttonSearch.clickWait();
    }

    @When("I write the name the file")
    public void iWriteTheNameTheFile() {
        searchMusic.searchMusic.setText(title);
    }

    @And("I accept the name")
    public void iAcceptTheName() {
    }

    @Then("The application should find the file")
    public void theApplicationShouldFindTheFile() {
        Assertions.assertTrue(playList.musicFromPlayList.isControlDisplayed(),
                "ERROR, the title was not searcher");
        searchMusic.searchMusic.back();
        playList.musicFromPlayList.click();
        Assertions.assertTrue(playList.playerControl.isControlDisplayed(),
                "ERROR, the music is plaing");
        searchMusic.backSearch.click();
        Assertions.assertTrue(playList.playerControl.isControlDisplayed(),
                "ERROR, the music is not longer playing");
    }
}
