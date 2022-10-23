package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import io.cucumber.java.zh_tw.並且;
import org.openqa.selenium.By;

public class PlayList {

    public Button createEmptyPlayList = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView"));
    //div[contains(text(),"Playlist")]
    public TextBox writeNameList = new TextBox(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.EditText"));
    //div[contains(text(),"My Playlist")]
    public Button buttonCreate = new Button(By.id("android:id/button1"));

    public Button nameListMusic = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_singlesong_title"));

    public Button addTracks = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_playlistactivity_addTracks"));

    public TextBox searchMusicOne = new TextBox(By.id("com.musicplayer.blackplayerfree:id/tv_addplaylisttracks_search"));

    public Button selectMusicOne = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_singlesong_title"));

    public TextBox searchMusicTwo = new TextBox(By.id("com.musicplayer.blackplayerfree:id/tv_addplaylisttracks_search"));

    public Button selectMusicTwo = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_singlesong_title"));

    public Button finishSelectMusic = new Button(By.id("com.musicplayer.blackplayerfree:id/btn_playlistactivity_close"));

    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();

}}
