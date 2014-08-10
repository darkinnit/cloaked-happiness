package com.darkinnit.cloakedhappiness.init;

import com.darkinnit.cloakedhappiness.item.ItemCloakedHappiness;
import com.darkinnit.cloakedhappiness.item.ItemCupOfTea;
import com.darkinnit.cloakedhappiness.item.ItemDoily;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by darkinnit on 10/08/14.
 */
public class ModItems {
    public static final ItemCloakedHappiness cupOfTea = new ItemCupOfTea();
    public static final ItemCloakedHappiness doily = new ItemDoily();

    public static void init()
    {
        GameRegistry.registerItem(cupOfTea, "CupOfTea");
        GameRegistry.registerItem(doily, "Doily");
    }
}
