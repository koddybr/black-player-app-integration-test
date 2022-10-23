package integrationTest;

import activity.ListScreen;
import activity.MainScreen;
import activity.NoteForm;
import activity.PlayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateNewListMusic {

    MainScreen mainScreen = new MainScreen();
    NoteForm createNoteForm = new NoteForm();
    ListScreen listScreen = new ListScreen();
    StarAppTest starApp = new StarAppTest();
    PlayList playList = new PlayList();

    @Test
    public void verifyCreateNewList(){

        String title="Rock";
        String musicOne="eventually";
        String musicTwo="gossip";

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

        Assertions.assertFalse(playList.isNoteDisplayed(musicOne),
                "ERROR, the title was not searcher");

        Assertions.assertFalse(playList.isNoteDisplayed(musicTwo),
                "ERROR, the title was not searcher");





    }

}
