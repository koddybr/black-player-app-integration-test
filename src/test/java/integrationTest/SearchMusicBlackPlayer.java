package integrationTest;

import activity.PlayList;
import activity.SearchMusic;
import activity.StarApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.GetProperties;

public class SearchMusicBlackPlayer {

    SearchMusic searchMusic = new SearchMusic();
    StarApp starApp = new StarApp();
    PlayList playList = new PlayList();

    @Test
    public void verifySearchMusic(){

        String title= GetProperties.getInstance().getMusicShort1();

        starApp.grantPermissionButton.click();
        starApp.allowButton.click();

        searchMusic.buttonSearch.clickWait();
        searchMusic.buttonSearch.clickWait();
        searchMusic.searchMusic.setText(title);
        //searchMusic.backSearch.click();

        Assertions.assertTrue(playList.musicFromPlayList.isControlDisplayed(),
                "ERROR, the title was not searcher");
        searchMusic.searchMusic.back();
        playList.musicFromPlayList.click();
        Assertions.assertTrue(playList.playerControl.isControlDisplayed(),
                "ERROR, the title was not searcher");
        searchMusic.backSearch.click();
        Assertions.assertTrue(playList.playerControl.isControlDisplayed(),
                "ERROR, the title was not searcher");
    }
}
