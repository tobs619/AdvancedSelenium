package orgtk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import orgtk.Utils.PropertiesUtil;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public static void initializeDriver(){
        Properties properties = PropertiesUtil.loadappProperties();
        String url = properties.getProperty("application.url");
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*").addArguments("headless browser");
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(cp);
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();


    }

    public static void closeDriver(){
        //driver.quit();
    }

}
