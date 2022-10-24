package runner;

import activity.PlayList;
import activity.StarApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import util.GetProperties;

public class CreatePlayListRunner {
    private String title="Rock\\n";
    private String musicOne;
    private String musicTwo;
    private PlayList playList = new PlayList();
    private StarApp starApp = new StarApp();
    {
        musicOne= GetProperties.getInstance().getMusicShort1();
        musicTwo= GetProperties.getInstance().getMusicShort2();
    }
    @Given("I select create empty playlist")
    public void iSelectCreateEmptyPlaylist() {
        starApp.grantPermissionButton.click();
        starApp.allowButton.click();
        playList.selectOptionPlaylist.clickWait();
        playList.createEmptyPlayList.click();
    }

    @Given("I write the new name the playlist")
    public void iWriteTheNewNameThePlaylist() {
        playList.writeNameList.setText(title);
    }

    @And("Accept the new name")
    public void acceptTheNewName() {
        playList.buttonCreate.click();
    }

    @And("I select the flies")
    public void iSelectTheFlies() {
        playList.nameListMusic.click();
        playList.addTracks.click();
        playList.searchMusicOne.setText(musicOne);
        playList.selectMusicOne.click();
        playList.searchMusicTwo.setText(musicTwo);
        playList.selectMusicTwo.click();
        playList.finishSelectMusic.click();
    }

    @Then("The application create new list")
    public void theApplicationCreateNewList() {
        Assertions.assertTrue(playList.musicFromPlayList.isControlDisplayed(),
                "ERROR, the music does not exist");

        playList.musicFromPlayList.click();

        Assertions.assertTrue(playList.playerControl.isControlDisplayed(),
                "ERROR, the music is not playing");
    }
}
