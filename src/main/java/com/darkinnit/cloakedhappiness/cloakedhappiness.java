package com.darkinnit.cloakedhappiness;

import com.darkinnit.cloakedhappiness.proxy.iProxy;
import com.darkinnit.cloakedhappiness.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by darkinnit on 09/08/14.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class cloakedhappiness {

    @Mod.Instance(Reference.MOD_ID)
    public static cloakedhappiness instance;

    @SidedProxy(clientSide = "com.darkinnit.cloakedhappiness.proxy.ClientProxy",
                serverSide = "com.darkinnit.cloakedhappiness.proxy.ServerProxy")
    public static iProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
