package com.darkinnit.cloakedhappiness.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by darkinnit on 10/08/14.
 */
public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(
                new ItemStack(ModItems.doily),
                " s ",
                "sss",
                " s ",
                's',
                new ItemStack(Items.string)
        ));
        GameRegistry.addRecipe(new ShapelessOreRecipe(
                new ItemStack(ModItems.cupOfTea),
                new ItemStack(Items.flower_pot),
                "treeLeaves",
                new ItemStack(Items.water_bucket)
        ));
        GameRegistry.addRecipe(new ShapedOreRecipe(
                new ItemStack(ModBlocks.crate),
                "ppp",
                "psp",
                "ppp",
                'p',
                "plankWood",
                's',
                "stickWood"
        ));
    }
}
