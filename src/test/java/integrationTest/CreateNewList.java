package integrationTest;

import activity.ListScreen;
import activity.MainScreen;
import activity.NoteForm;
import activity.PlayList;
import org.junit.jupiter.api.Test;

public class CreateNewList {


    MainScreen mainScreen = new MainScreen();
    NoteForm createNoteForm = new NoteForm();
    ListScreen listScreen = new ListScreen();
    PlayList playList = new PlayList();

    @Test
    public void verifyCreatePlayList(){
        listScreen.playListOption.click();
        playList.createEmptyPlayList.click();

    }
}
