import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class EntertainmentPage extends EntertainmentPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/entertainment");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.ENTERTAINMENT_TITLE);
    }
}