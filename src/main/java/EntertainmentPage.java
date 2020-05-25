import org.testng.Assert;
import org.testng.annotations.Test;

public class EntertainmentPage extends EntertainmentPageBase {

    @Test
    public void entertainmentPageTitleTest() {
        System.out.println(app.getCurrentPageTitle());
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.ENTERTAINMENT_TITLE);
    }
}