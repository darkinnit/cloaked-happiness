package com.darkinnit.cloakedhappiness.block;

import net.minecraft.block.material.Material;

/**
 * Created by darkinnit on 10/08/14.
 */
public class BlockCrate extends BlockCloakedHappiness {
    public BlockCrate()
    {
        super(Material.wood);
        this.setBlockName("crate");
        this.setBlockTextureName("crate");
        this.setStepSound(soundTypeWood);
        this.setHardness(2.0F);
    }
}
