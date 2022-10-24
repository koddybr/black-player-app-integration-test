package appiumControl;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import singletonSession.Session;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl(By locator){
        this.locator=locator;
    }


    public void findControl(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    public void findWaitControl(){
        this.control =
                Session
                        .getInstance()
                        .getWait()
                        .until(
                                ExpectedConditions.presenceOfElementLocated(this.locator)
                        );
        findControl();
    }

    public void click(){
        this.findControl();
        this.control.click();
    }

    public void clickWait(){
        this.findWaitControl();
        this.control.click();
    }

    public void moveProgress(){
        this.findControl();
        Integer x = this.control.getLocation().getX();
        Integer y = this.control.getLocation().getY();
        Integer size = this.control.getSize().getHeight();
        Integer moveTo = size;
        TouchAction touch = new TouchAction(Session.getInstance().getDriver());
        touch
                .longPress(PointOption.point(x,y))
                .moveTo(PointOption.point(x,moveTo))
                .release()
                .perform();
    }
    public void pressReturn(){
        this.findControl();
        this.control.sendKeys("\n");
    }

    public String getText(){
        this.findControl();
        return this.control.getText();
    }

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }
    public void back(){
        Session.getInstance().getDriver().navigate().back();
    }

}
