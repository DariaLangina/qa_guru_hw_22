package dlangina.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:real.properties"})

public interface RealConfig extends Config {

  String deviceName();
}