package com.darkinnit.cloakedhappiness;

import com.darkinnit.cloakedhappiness.handler.ConfigurationHandler;
import com.darkinnit.cloakedhappiness.init.ModItems;
import com.darkinnit.cloakedhappiness.proxy.iProxy;
import com.darkinnit.cloakedhappiness.reference.Reference;
import com.darkinnit.cloakedhappiness.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by darkinnit on 09/08/14.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION,
     guiFactory = Reference.GUI_FACTORY_CLASS)
public class cloakedhappiness {

    @Mod.Instance(Reference.MOD_ID)
    public static cloakedhappiness instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,
                serverSide = Reference.SERVER_PROXY_CLASS)
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Passing suggested Configuration file:");
        LogHelper.info(event.getSuggestedConfigurationFile());
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialisation Complete!");

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation Complete!");
    }
}
