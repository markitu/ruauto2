import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HealthPage extends HealthPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/health");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.HEALTH_TITLE);
    }
}
