import org.testng.Assert;
import org.testng.annotations.Test;

public class UsPoliticsPage extends UsPoliticsPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.USPOLITICS_TITLE);
    }
}
