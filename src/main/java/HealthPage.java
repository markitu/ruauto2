import org.testng.Assert;
import org.testng.annotations.Test;

public class HealthPage extends HealthPageBase {

    @Test
    public void healthPageTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.HEALTH_TITLE);
    }
}
