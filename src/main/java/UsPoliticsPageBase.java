import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.open;

public class UsPoliticsPageBase {

    protected static final class Selector {
        public static final String USPOLITICS_TITLE = "CNNPolitics - Political News, Analysis and Opinion";
    }

    protected static final class Pages {
        public static final String TEST = "TEST";
    }

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


}