package dlangina.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
    "classpath:mobile/browserstack.properties"})
public interface BrowserStackConfig extends Config {

  @Key("app")
  String app();

  @Key("user")
  String user();

  @Key("key")
  String key();

  @Key("browserStackUrl")
  String browserStackUrl();

  @Key("buildName")
  String buildName();

  @Key("projectName")
  String projectName();

  @Key("device")
  String device();

  @Key("osVersion")
  String osVersion();
}
