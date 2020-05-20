import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class StylePageBase {

    protected static final class Selector {
        public static final String STYLE_TITLE = "CNN Style - Fashion, beauty, design, art, architecture and luxury";
        public static final String URL = "https://edition.cnn.com/style";
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