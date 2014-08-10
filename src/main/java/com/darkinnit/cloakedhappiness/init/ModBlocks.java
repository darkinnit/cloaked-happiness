package com.darkinnit.cloakedhappiness.init;

import com.darkinnit.cloakedhappiness.block.BlockCloakedHappiness;
import com.darkinnit.cloakedhappiness.block.BlockCrate;
import com.darkinnit.cloakedhappiness.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by darkinnit on 10/08/14.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockCloakedHappiness crate = new BlockCrate();

    public static void init()
    {
        GameRegistry.registerBlock(crate, "crate");
    }
}
