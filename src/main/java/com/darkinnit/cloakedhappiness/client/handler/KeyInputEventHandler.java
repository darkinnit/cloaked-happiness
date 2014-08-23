package com.darkinnit.cloakedhappiness.client.handler;

import com.darkinnit.cloakedhappiness.client.settings.KeyBindings;
import com.darkinnit.cloakedhappiness.reference.Key;
import com.darkinnit.cloakedhappiness.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by darkinnit on 23/08/14.
 */
public class KeyInputEventHandler {

    private static Key getPressedKeybinding()
    {
        if (KeyBindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        if (KeyBindings.release.isPressed())
        {
            return Key.RELEASE;
        }
        return Key.UNKOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}
