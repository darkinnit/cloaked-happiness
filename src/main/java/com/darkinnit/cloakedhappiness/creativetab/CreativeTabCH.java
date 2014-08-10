package com.darkinnit.cloakedhappiness.creativetab;

import com.darkinnit.cloakedhappiness.init.ModItems;
import com.darkinnit.cloakedhappiness.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by darkinnit on 10/08/14.
 */
public class CreativeTabCH {
    public static final CreativeTabs CH_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.cupOfTea;
        }

    };
}
