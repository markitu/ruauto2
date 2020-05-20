import org.testng.Assert;
import org.testng.annotations.Test;

public class BusinessPage extends BusinessPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getUrl(),  BusinessPageBase.Selector.BUSINESS_TITLE);
    }
}
