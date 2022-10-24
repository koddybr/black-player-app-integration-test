package integrationTest;

import activity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualizerConfiguration {

    Equalizer equalizer = new Equalizer();
    StarApp starApp = new StarApp();
    @Test
    public void verifyEqualizerConfiguration(){

        starApp.grantPermissionButton.click();
        starApp.allowButton.click();

        equalizer.optionEqualizer.clickWait();
        equalizer.equalizerOn.click();
        equalizer.equalizer60Hz.moveProgress();
        Assertions.assertTrue(equalizer.isTextViewDisplayed("EQUALIZER"));


        equalizer.soundEffects.click();
        equalizer.bassBoost.click();
        equalizer.virtualizer.click();
        Assertions.assertTrue(equalizer.isTextViewDisplayed("REVERB"));

    }
}
