package orgtk.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import orgtk.BaseClass;

import java.util.Properties;

public class BrowserUtils extends BaseClass {
    static Properties properties = PropertiesUtil.loadframeworkProperties();

    public static void clickElement(String element){
        find(element).click();
    }

    public static void enterText(String element, String text){
        find(element).clear();
        find(element).sendKeys(text);
    }

    public static WebElement find(String xpath){
        String timeout = properties.getProperty("timeout.maximum");
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeout));
            element = wait.until(ExpectedConditions.
                    elementToBeClickable(driver.findElement(By.xpath(xpath))));
        }
        catch (Exception e){
            System.out.println("Element not found");
        }
        return element;
    }
}
