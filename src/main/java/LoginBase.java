import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;


import static com.codeborne.selenide.Selenide.*;

public class LoginBase {

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
        public static final String MAINPAGE_TITLE = "CNN International - Breaking News, US News, World News and Video";
        public static final String WORLDPAGE_TITLE = "CNN International - Breaking News, US News, World News and Video";
    }
}
