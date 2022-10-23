package integrationTest;

import activity.ListScreen;
import activity.MainScreen;
import activity.NoteForm;
import activity.StarApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StarAppTest {

    MainScreen mainScreen = new MainScreen();
    NoteForm createNoteForm = new NoteForm();
    ListScreen listScreen = new ListScreen();
    StarApp starApp = new StarApp();

    @Test
    public void verifyStarApp(){
        starApp.grantPermissionButton.click();
        starApp.allowButton.click();

        Assertions.assertFalse(starApp.isNoteDisplayed("GRANT PERMISSION"));

        Assertions.assertFalse(starApp.isNoteDisplayed("ALLOW"));


    }


}
