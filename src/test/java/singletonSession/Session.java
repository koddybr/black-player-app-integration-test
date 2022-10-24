package singletonSession;

import factoryDevices.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session {

    private static Session session=null;
    private AppiumDriver driver;

    private WebDriverWait wait;
    private Session(){
        driver = FactoryDevice.make("android").create();
        wait = new WebDriverWait(driver,10);
    }

    public static Session getInstance(){
        if (session == null)
            session= new Session();

        return session;
    }

    public void closeApp(){
        driver.quit();
        session=null;
    }

    public AppiumDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWait(){
        return wait;
    }
}
