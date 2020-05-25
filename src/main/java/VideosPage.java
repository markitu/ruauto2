import org.testng.Assert;
import org.testng.annotations.Test;

public class VideosPage extends VideosPageBase {

    @Test
    public void videosPageTitleTest() {
        Assert.assertEquals(app.getCurrentPageTitle(), Selector.VIDEOS_TITLE);
    }
}