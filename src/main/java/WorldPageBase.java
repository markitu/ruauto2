import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class WorldPageBase {

    protected static final class Selector {
        public static final String WORLD_TITLE = "World news – breaking news, videos and headlines - CNN";
        public static final String URL = "https://edition.cnn.com/world";
    }

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
        app.init();
        open(Selector.URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //app.stop();
    }


}
