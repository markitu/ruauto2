import org.testng.Assert;
import org.testng.annotations.Test;

public class VideosPage extends VideosPageBase {

    @Test
    public void worldTitleTest() {
        Assert.assertEquals(app.getUrl(), Selector.VIDEOS_TITLE);
    }
}