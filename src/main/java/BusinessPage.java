import org.testng.Assert;
import org.testng.annotations.Test;

public class BusinessPage extends BusinessPageBase {

    @Test
    public void businessPageTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), BusinessPageBase.Selector.BUSINESS_TITLE);
    }
}
