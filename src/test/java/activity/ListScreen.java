package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ListScreen {

    //public

    //List<WebElement> weekObjetList = driver.findElements(By.xpath("//android.widget.ListView[1]//android.widget.RelativeLayout"))

    //public Button elementViewGroup = new Button(By.xpath("//android.widget.TextView[@text='Shopping']"));

    public Button playListOption = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.TextView"));

    public Button elementViewGroup(String text){
        return new Button(By.xpath("//android.widget.TextView[@text='"+text+"']"));
    }


}
