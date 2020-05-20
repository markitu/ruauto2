import org.testng.Assert;
import org.testng.annotations.Test;

public class StylePage extends StylePageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getUrl(), Selector.STYLE_TITLE);
    }
}