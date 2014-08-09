package com.darkinnit.cloakedhappiness.handler;

import com.darkinnit.cloakedhappiness.reference.Reference;
import com.darkinnit.cloakedhappiness.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by darkinnit on 09/08/14.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){
        if (configuration == null) {
            configuration = new Configuration(configFile);
            LogHelper.info("Config was null, loading...");
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            LogHelper.info("ConfigChangeEvent detected, loading config...");
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue",
                                             Configuration.CATEGORY_GENERAL,
                                             true,
                                             "This is an example config value");
        if (configuration.hasChanged()) {
            LogHelper.info("Configuration has changed, saving config...");
            configuration.save();
        }
        else
        {
            LogHelper.info("Configuration has not changed, skipping save.");
        }
    }
}
