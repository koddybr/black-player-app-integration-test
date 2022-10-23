package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import io.cucumber.java.zh_tw.並且;
import org.openqa.selenium.By;

public class SearchMusic {

    public Button buttonSearch = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]"));

    public TextBox searchMusic = new TextBox(By.id("com.musicplayer.blackplayerfree:id/tv_searchmusic_textsearch"));

    public Button backSearch = new Button(By.id("com.musicplayer.blackplayerfree:id/btn_searchmusic_close"));

    public boolean isNoteDisplayed(String title) {
        Label note = new Label(By.xpath("//android.widget.TextView[@text='" + title + "']"));
        return note.isControlDisplayed();
    }}
