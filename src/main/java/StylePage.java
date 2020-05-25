import org.testng.Assert;
import org.testng.annotations.Test;

public class StylePage extends StylePageBase {

    @Test
    public void stylePageTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.STYLE_TITLE);
    }
}