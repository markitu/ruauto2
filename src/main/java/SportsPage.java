import org.testng.Assert;
import org.testng.annotations.Test;

public class SportsPage extends SportsPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getUrl(), Selector.SPORTS_TITLE);
    }
}