import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SportsPage extends SportsPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/sport");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.SPORTS_TITLE);
    }
}