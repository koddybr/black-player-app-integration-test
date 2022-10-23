package integrationTest;

import activity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualizerConfiguration {

    Equalizer equalizer = new Equalizer();

    @Test
    public void verifyEqualizerConfiguration(){

        equalizer.optionEqualizer.click();
        equalizer.equalizerOn.click();
        equalizer.soundEffects.click();
        equalizer.bassBoost.click();
        equalizer.virtualizer.click();

        Assertions.assertFalse(equalizer.isNoteDisplayed("EQUALIZER"));
        Assertions.assertFalse(equalizer.isNoteDisplayed("REVERB"));
    }
}
