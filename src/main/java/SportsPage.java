import org.testng.Assert;
import org.testng.annotations.Test;

public class SportsPage extends SportsPageBase {

    @Test
    public void sportsPageTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.SPORTS_TITLE);
    }
}