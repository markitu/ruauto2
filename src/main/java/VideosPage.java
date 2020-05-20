import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class VideosPage extends VideosPageBase {


    @Test
    public void worldTitleTest() {
        open("https://edition.cnn.com/videos");
        String world = app.driver.getTitle();
        Assert.assertEquals(world,  Selector.VIDEOS_TITLE);
    }
}