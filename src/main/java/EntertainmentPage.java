import org.testng.Assert;
import org.testng.annotations.Test;

public class EntertainmentPage extends EntertainmentPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getUrl(), Selector.ENTERTAINMENT_TITLE);
    }
}