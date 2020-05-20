import org.testng.Assert;
import org.testng.annotations.Test;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import static com.codeborne.selenide.Selenide.open;

public class UiTests extends UiTestBase {


  @Test
  public void worldTitleTest() {
      open("https://edition.cnn.com/world");
    String world = app.driver.getTitle();
      Assert.assertEquals(world,  Selector.WORLD_TITLE);
  }

  @Test
  public void usPoliticsTitleTest() {
    String usPolitics = app.driver.getTitle();
    Assert.assertEquals(usPolitics,  Selector.MAINPAGE_TITLE);

  }
  @Test
  public void businessTitleTest() {
    String business = app.driver.getTitle();
    Assert.assertEquals(business, Selector.MAINPAGE_TITLE);
  }
    @Test
    public void healthTitleTest() {
      String health = app.driver.getTitle();
      Assert.assertEquals(health,  Selector.MAINPAGE_TITLE);
    }

    @Test
    public void entertaimentTitleTest() {
      String entertaiment = app.driver.getTitle();
      Assert.assertEquals(entertaiment,  Selector.MAINPAGE_TITLE);

    }


  }


