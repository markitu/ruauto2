import org.testng.Assert;
import org.testng.annotations.Test;

public class HealthPage extends HealthPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.HEALTH_TITLE);
    }
}
