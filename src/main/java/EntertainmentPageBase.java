import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.open;

public class EntertainmentPageBase {

    protected static final class Selector {
        public static final String ENTERTAINMENT_TITLE = "Entertainment News - Celebrities, Movies, TV, Music - CNN";
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