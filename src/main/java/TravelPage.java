import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TravelPage extends TravelPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/travel");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.TRAVEL_TITLE);
    }
}