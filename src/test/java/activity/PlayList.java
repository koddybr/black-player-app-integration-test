package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import io.cucumber.java.en.But;
import io.cucumber.java.zh_tw.並且;
import org.openqa.selenium.By;

public class PlayList {

    public Button selectOptionPlaylist = new Button(By.xpath("//android.widget.TextView[@text='Playlists']"));
    public Button createEmptyPlayList = new Button(By.xpath("//android.widget.TextView[@text='CREATE EMPTY PLAYLIST']"));
    //div[contains(text(),"Playlist")]
    public TextBox writeNameList = new TextBox(By.xpath("//android.widget.EditText[@text='My Playlist']"));
    //div[contains(text(),"My Playlist")]
    public Button buttonCreate = new Button(By.id("android:id/button1"));

    public Button nameListMusic = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_singlesong_title"));
    //public Button nameListMusic = new Button(By.xpath("//android.view.View[@text='Rock1']"));

    public Button addTracks = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_playlistactivity_addTracks"));

    public TextBox searchMusicOne = new TextBox(By.id("com.musicplayer.blackplayerfree:id/tv_addplaylisttracks_search"));

    public Button selectMusicOne = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_singlesong_title"));

    public Button musicFromPlayList = new Button(By.xpath("//android.view.View[@resource-id='com.musicplayer.blackplayerfree:id/tv_singlesong_title']"));

    public TextBox searchMusicTwo = new TextBox(By.id("com.musicplayer.blackplayerfree:id/tv_addplaylisttracks_search"));

    public Button selectMusicTwo = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_singlesong_title"));

    public Button finishSelectMusic = new Button(By.id("com.musicplayer.blackplayerfree:id/btn_playlistactivity_close"));

    public Button playerControl = new Button(By.id("com.musicplayer.blackplayerfree:id/btn_miniplayer_play"));

    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }
//    public boolean isButtonDisplayed(){
//
//    }

}
