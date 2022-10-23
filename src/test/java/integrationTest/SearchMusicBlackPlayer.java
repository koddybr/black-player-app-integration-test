package integrationTest;

import activity.SearchMusic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchMusicBlackPlayer {

    SearchMusic searchMusic = new SearchMusic();

    @Test
    public void verifySearchMusic(){

        String title="nang";

        searchMusic.buttonSearch.click();
        searchMusic.searchMusic.setText(title);
        searchMusic.backSearch.click();

        Assertions.assertFalse(searchMusic.isNoteDisplayed(title),
                "ERROR, the title was not searcher");
    }
}
