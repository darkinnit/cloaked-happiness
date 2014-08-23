package com.darkinnit.cloakedhappiness.proxy;

import com.darkinnit.cloakedhappiness.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by darkinnit on 09/08/14.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}
