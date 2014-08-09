package com.darkinnit.cloakedhappiness.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by darkinnit on 09/08/14.
 */
public class ConfigurationHandler {
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL,
                                                    "configValue",
                                                    true,
                                                    "This is an example config value"
                                                   ).getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally {
            configuration.save();
        }

        System.out.println("Configuration test: " + configValue);
    }
}
