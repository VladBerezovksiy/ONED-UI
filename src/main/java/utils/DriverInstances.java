package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.HashMap;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DriverInstances {

    private static final Map<String, WebDriver> webDriverInstances = new HashMap();

    static {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe");
        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "\\src\\main\\resourses\\drivers\\msedgedriver.exe");
    }

    private DriverInstances() {
    }

    /**
     * @param driverType - a type of driver to be initialized:
     *                   GC - Google Chrome
     *                   FF - Firefox
     *                   IE - Internet Explorer
     *                   EG - Edge
     */

    public static synchronized WebDriver getInstance(String driverType) {
        WebDriver webDriver = webDriverInstances.get(driverType);

        switch (driverType.toUpperCase()) {
            case Variables.GOOGLE_CHROME:
                String downloadFilepath = Variables.PROJECT_DOWNLOAD_PATH;
                HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("profile.default_content_settings.popups", 0);
                chromePrefs.put("download.prompt_for_download", false);
                chromePrefs.put("download.default_directory", downloadFilepath);
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", chromePrefs);
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                cap.setCapability(ChromeOptions.CAPABILITY, options);
                options.merge(cap);
                webDriver = new ChromeDriver(options);
                break;
            case Variables.FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addPreference("browser.download.dir", Variables.PROJECT_DOWNLOAD_PATH);
                firefoxOptions.addPreference("browser.download.folderList", 2);
                firefoxOptions.addPreference("browser.download.manager.showWhenStarting", false);
                firefoxOptions.addPreference("browser.helperApps.neverAsk.openFile",
                        Variables.MIME_TYPES);
                firefoxOptions.addPreference("browser.helperApps.neverAsk.saveToDisk",
                        Variables.MIME_TYPES);
                firefoxOptions.addPreference("browser.helperApps.alwaysAsk.force", false);
                firefoxOptions.addPreference("browser.download.manager.alertOnEXEOpen", false);
                firefoxOptions.addPreference("browser.download.manager.focusWhenStarting", false);
                firefoxOptions.addPreference("browser.download.manager.useWindow", false);
                firefoxOptions.addPreference("browser.download.manager.showAlertOnComplete", false);
                firefoxOptions.addPreference("browser.download.manager.closeWhenDone", false);
                webDriver = new FirefoxDriver(firefoxOptions);
                break;
            case Variables.INTERNET_EXPLORER:
                webDriver = new InternetExplorerDriver();
                break;
            case Variables.EDGE:
                webDriver = new EdgeDriver();
                break;
            default: {
                System.out.println(DriverInstances.class + " Empty or invalid browser type: " + driverType);
                System.exit(1);
            }
        }
        webDriverInstances.put(driverType, webDriver);
        System.out.println("New WebDriver instance has been initialized: " + driverType);
        webDriver.manage().timeouts().setScriptTimeout(60, SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(60, SECONDS);
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(webDriver);
        WebEventListener webEventListener = new WebEventListener();
        eventFiringWebDriver.register(webEventListener);
        return eventFiringWebDriver;
    }
}
