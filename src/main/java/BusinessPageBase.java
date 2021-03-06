import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class BusinessPageBase {

    protected static final class Selector {
        public static final String BUSINESS_TITLE = "Breaking News, Latest News and Videos - CNN";
        public static final String URL = "https://edition.cnn.com/business";
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