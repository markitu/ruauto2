import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class BusinessPage extends BusinessPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/business");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.BUSINESS_TITLE);
    }
}
