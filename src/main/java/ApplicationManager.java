import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;


public class ApplicationManager {

  public WebDriver driver;

  public void init() {
    File file = new File(new File("./src/main/resources/chromedriver.exe").getAbsolutePath());
    System.setProperty("webdriver.chrome.driver", String.valueOf(file));
    Configuration.timeout = 3000;
    Configuration.browser = "chrome";
    Configuration.browserPosition = "1921x0";
    Configuration.browserSize = "1920x1080";
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setExperimentalOption("useAutomationExtension", false);
    chromeOptions.addArguments(
            "disable-infobars",
            "disable-extensions",
            "--disable-extensions",
            "--disable-dev-shm-usage",
            "--no-sandbox",
            "--disable-gpu",
            "--window-size=1920,1080",
            "--disable-gpu",
            "--ignore-certificate-errors");
    driver = new ChromeDriver(chromeOptions);
    WebDriverRunner.setWebDriver(driver);
  }

  public void stop() {
    driver.quit();
  }

  public String getUrl() {
    return driver.getTitle();
  }

}
