import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class MainBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
        app.init();
        open(PropertiesLoader.getProp("URL"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //app.stop();
    }

    protected static final class Selector {
    }
    public static final String NEWS_1 = "//*[@id='intl_homepage1-zone-1']//*[@class='cd__headline-text']";

    public void openNewsWithExactNumber(int i) {
        app.driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-" + i + "']//*[@class='cd__headline-text']")).click();
    }
}
