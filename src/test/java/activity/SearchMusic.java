package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class SearchMusic {

    public Button buttonSearch = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]"));

    public TextBox searchMusic = new TextBox(By.id("com.musicplayer.blackplayerfree:id/tv_searchmusic_textsearch"));

    public Button backSearch = new Button(By.id("com.musicplayer.blackplayerfree:id/btn_searchmusic_close"));
}
