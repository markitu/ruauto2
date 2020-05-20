import org.testng.Assert;
import org.testng.annotations.Test;

public class TravelPage extends TravelPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.TRAVEL_TITLE);
    }
}