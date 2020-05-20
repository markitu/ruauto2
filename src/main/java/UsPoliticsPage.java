import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class UsPoliticsPage extends UsPoliticsPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/politics");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.USPOLITICS_TITLE);
    }
}
