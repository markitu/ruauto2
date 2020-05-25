import org.testng.Assert;
import org.testng.annotations.Test;

public class WorldPage extends WorldPageBase {

    @Test
    public void worldPageTitleTest() {
      Assert.assertEquals(app.getCurrentPageTitle(), Selector.WORLD_TITLE);
    }
  }

