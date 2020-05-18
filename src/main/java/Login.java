import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.codeborne.selenide.Selenide.*;


public class Login extends LoginBase {

  @Test
  public void mainPageTitle() {
    String s = app.driver.getTitle();
    Assert.assertEquals(s, Selector.MAINPAGE_TITLE);
  }

  @Test
  public void worldPageTitle() {
    String s = app.driver.getTitle();
    Assert.assertEquals(s, Selector.WORLDPAGE_TITLE);
  }

}
