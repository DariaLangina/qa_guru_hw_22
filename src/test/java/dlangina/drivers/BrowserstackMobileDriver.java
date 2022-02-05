package dlangina.drivers;

import com.codeborne.selenide.WebDriverProvider;
import dlangina.config.BrowserStackConfig;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Nonnull;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserstackMobileDriver implements WebDriverProvider {

  public static BrowserStackConfig browserStackConfig = ConfigFactory.create(
      BrowserStackConfig.class, System.getProperties());

  @Nonnull
  @Override
  public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
    // Set your access credentials
    desiredCapabilities.setCapability("browserstack.user", browserStackConfig.user());
    desiredCapabilities.setCapability("browserstack.key", browserStackConfig.key());

    // Set URL of the application under test
    desiredCapabilities.setCapability("app", browserStackConfig.app());

    // Specify device and os_version for testing
    desiredCapabilities.setCapability("device", browserStackConfig.device());
    desiredCapabilities.setCapability("os_version", browserStackConfig.osVersion());

    // Set other BrowserStack capabilities
    desiredCapabilities.setCapability("project", browserStackConfig.projectName());
    desiredCapabilities.setCapability("build", "browserstack-build-1");
    desiredCapabilities.setCapability("name", browserStackConfig.buildName());

    // Initialise the remote Webdriver using BrowserStack remote URL
    // and desired capabilities defined above
    return new AndroidDriver(getBrowserStackUrl(), desiredCapabilities);

  }

  public static URL getBrowserStackUrl() {
    try {
      return new URL(browserStackConfig.browserStackUrl());
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}
