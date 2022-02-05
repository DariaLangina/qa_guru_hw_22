package dlangina.drivers;

import static dlangina.utils.FileUtils.getAbsolutePath;

import com.codeborne.selenide.WebDriverProvider;
import dlangina.config.LocalConfig;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nonnull;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalMobileDriver implements WebDriverProvider {

  public static LocalConfig localConfig = ConfigFactory.create(LocalConfig.class);

  String emulatorName = localConfig.emulatorName();
  String emulatorVersion = localConfig.emulatorVersion();
  String appPath = localConfig.appPath();

  @Nonnull
  @Override
  public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

    desiredCapabilities.setCapability("platformName", "android");
    desiredCapabilities.setCapability("deviceName", emulatorName);
    desiredCapabilities.setCapability("version", emulatorVersion);
    desiredCapabilities.setCapability("locale", "en");
    desiredCapabilities.setCapability("language", "en");
    desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
    desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
    desiredCapabilities.setCapability("app", getAbsolutePath(appPath));
    try {
      return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  public static URL getBrowserStackUrl() {
    try {
      return new URL("http://127.0.0.1:4723/wd/hub");
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}
