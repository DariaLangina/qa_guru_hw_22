package dlangina.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:mobile.properties"
})
public interface LocalConfig extends Config {

    @Key("emulatorName")
    String emulatorName();

    @Key("emulatorVersion")
    String emulatorVersion();

    @Key("appPath")
    String appPath();


}
