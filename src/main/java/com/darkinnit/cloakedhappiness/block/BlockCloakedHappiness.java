package com.darkinnit.cloakedhappiness.block;

import com.darkinnit.cloakedhappiness.creativetab.CreativeTabCH;
import com.darkinnit.cloakedhappiness.reference.Reference;
import com.darkinnit.cloakedhappiness.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by darkinnit on 10/08/14.
 */
public class BlockCloakedHappiness extends Block {

    public BlockCloakedHappiness(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabCH.CH_TAB);
    }

    public BlockCloakedHappiness()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s",
                             Textures.RESOURCE_PREFIX,
                             getUnwrappedUnlocalizedName(
                                     super.getUnlocalizedName())
                             );
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(
                String.format(
                        "%s",
                        getUnwrappedUnlocalizedName(
                                this.getUnlocalizedName()
                        )
                )
        );
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(
                unlocalizedName.indexOf(".") + 1
        );
    }
}
