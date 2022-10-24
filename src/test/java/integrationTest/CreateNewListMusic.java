package integrationTest;

import activity.*;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class CreateNewListMusic {

    PlayList playList = new PlayList();

    StarApp starApp = new StarApp();

    @Test
    public void verifyCreateNewList(){
        String title="Rock\\n";
        String musicOne="Nangs";
        String musicTwo="Reality";

        starApp.grantPermissionButton.click();
        starApp.allowButton.click();
        playList.selectOptionPlaylist.clickWait();
        playList.createEmptyPlayList.click();
        playList.writeNameList.setText(title);
        playList.buttonCreate.click();
        playList.nameListMusic.click();
        playList.addTracks.click();
        playList.searchMusicOne.setText(musicOne);
        playList.selectMusicOne.click();
        playList.searchMusicTwo.setText(musicTwo);
        playList.selectMusicTwo.click();
        playList.finishSelectMusic.click();

        Assertions.assertTrue(playList.musicFromPlayList.isControlDisplayed(),
                "ERROR, the title was not searcher");

        playList.musicFromPlayList.click();

        Assertions.assertTrue(playList.playerControl.isControlDisplayed(),
                "ERROR, the title was not searcher");
    }

}
