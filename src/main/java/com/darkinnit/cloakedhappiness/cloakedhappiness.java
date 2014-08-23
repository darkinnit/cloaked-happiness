package com.darkinnit.cloakedhappiness;

import com.darkinnit.cloakedhappiness.client.handler.KeyInputEventHandler;
import com.darkinnit.cloakedhappiness.handler.ConfigurationHandler;
import com.darkinnit.cloakedhappiness.init.ModBlocks;
import com.darkinnit.cloakedhappiness.init.ModItems;
import com.darkinnit.cloakedhappiness.init.Recipes;
import com.darkinnit.cloakedhappiness.proxy.iProxy;
import com.darkinnit.cloakedhappiness.reference.Reference;
import com.darkinnit.cloakedhappiness.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

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
        LogHelper.debug("Passing suggested Configuration file:");
        LogHelper.debug(event.getSuggestedConfigurationFile());
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();

        LogHelper.debug("Pre Initialisation Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        LogHelper.debug("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            // OreDictionary.getOres(oreName);
        }
        LogHelper.debug("Post Initialisation Complete!");
    }
}
