package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import io.cucumber.java.zh_tw.並且;
import org.openqa.selenium.By;

public class Equalizer {

    public Button optionEqualizer = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.TextView"));
    //div[contains(text(),"Equalizer")]
    public Button equalizerOn = new Button(By.id("com.musicplayer.blackplayerfree:id/chbx_equalizer_enable"));

    public Button soundEffects = new Button(By.xpath("//android.widget.LinearLayout[@content-desc=\"SOUND EFFECTS\"]/android.widget.TextView"));

    public Button bassBoost = new Button(By.id("com.musicplayer.blackplayerfree:id/chbx_equalizer_enablebassboost"));

    public Button virtualizer = new Button(By.id("com.musicplayer.blackplayerfree:id/chbx_soundeffects_virtualizer_enable"));

    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();

}}



