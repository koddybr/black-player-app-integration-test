package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class StarApp {

    public Button grantPermissionButton = new Button(By.id("com.musicplayer.blackplayerfree:id/tv_visualizer_permission_grant"));

   public Button allowButton = new Button(By.id("com.android.packageinstaller:id/permission_allow_button"));

    public boolean isTextDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
}}


