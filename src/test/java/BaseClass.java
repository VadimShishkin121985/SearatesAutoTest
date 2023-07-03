import driver.WebDriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class BaseClass {

    @BeforeSuite
    public void setUpBrowser(){
        WebDriverFactory.initDriver();
    }

    @AfterSuite
    public void afterSuite() {
        closeWebDriver();
    }

    public void openUrl(String url){
        open(url);
    }

    public void pause(long msec){
        try {
            sleep(msec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
