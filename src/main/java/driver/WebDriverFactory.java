package driver;

import com.codeborne.selenide.Configuration;
import driver.Browsers;

public class WebDriverFactory {
    public static void initDriver (Browsers browser) {
        Configuration.startMaximized = true;

        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 60000;
        switch (browser){
            case EDGE: {
                Configuration.browser = "edge";
                return;
            }
            case CHROME: {
                Configuration.browser = "chrome";
                return;
            }
            case FIREFOX: {
                Configuration.browser = "firefox";
                return;
            }
            case SAFARI: {
                Configuration.browser = "safari";
                return;
            }
        }
    }
    public static void initDriver(){
        String browserName = System.getProperty("browserName","chrome");
         try{
             initDriver(Browsers.valueOf(browserName.toUpperCase()));
         } catch (IllegalArgumentException e) {
             System.err.println("This Browser not supported");
             System.exit(-1);
         }
    }


}
