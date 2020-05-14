import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.ArrayList;

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

        public static final String MAINPAGE_TITLE = "Авто.ру: купить, продать и обменять машину в Москве и Московской области";

    }

    }
