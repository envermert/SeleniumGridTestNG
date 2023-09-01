import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;


public class SeleniumGridFirefox {

    WebDriver driver;

    @Test
    public void test1() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.126:4444"), new FirefoxOptions());
        driver.get("https://techproeducation.com/");
        String title = driver.getTitle();
        assertTrue(title.contains("TechPro Education"));
        driver.quit();

    }


}