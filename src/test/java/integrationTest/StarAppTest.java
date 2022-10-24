package integrationTest;

import activity.StarApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StarAppTest {

    StarApp starApp = new StarApp();

    @Test
    public void verifyStarApp(){
        starApp.grantPermissionButton.click();
        starApp.allowButton.click();

        Assertions.assertTrue(starApp.isTextDisplayed("Library"));

        Assertions.assertTrue(starApp.isTextDisplayed("Playlists"));


    }


}
