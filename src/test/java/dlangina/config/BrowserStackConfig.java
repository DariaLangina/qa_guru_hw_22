package dlangina.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:mobile/browserstack.properties"})
public interface BrowserStackConfig extends Config {

  @Key("app")
  String app();

  @Key("user")
  String user();

  @Key("key")
  String key();
}
