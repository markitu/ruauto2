import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class StylePage extends StylePageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/style");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.STYLE_TITLE);
    }
}