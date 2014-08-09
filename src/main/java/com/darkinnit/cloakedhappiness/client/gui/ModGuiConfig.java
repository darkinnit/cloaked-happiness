package com.darkinnit.cloakedhappiness.client.gui;

import com.darkinnit.cloakedhappiness.handler.ConfigurationHandler;
import com.darkinnit.cloakedhappiness.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by darkinnit on 09/08/14.
 */
public class ModGuiConfig extends GuiConfig{
    public ModGuiConfig(GuiScreen guiScreen)
    {
    super(guiScreen,
            new ConfigElement(
                    ConfigurationHandler.configuration.getCategory(
                            Configuration.CATEGORY_GENERAL
                    )
            ).getChildElements(),
            Reference.MOD_ID,
            false,
            false,
            GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
