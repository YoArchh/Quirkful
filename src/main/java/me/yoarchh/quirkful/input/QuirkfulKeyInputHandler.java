package me.yoarchh.quirkful.input;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class QuirkfulKeyInputHandler
{
    private static final String KEY_CATEGORY_QUIRKFUL = "key.category.quirkful.quirkful";

    private static final String KEY_ACTIVATE_QUIRK = "key.category.quirkful.activate_quirk";

    public static KeyBinding ACTIVATE_QUIRK;

    public static void initializeKeyBindings()
    {
        ACTIVATE_QUIRK = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_ACTIVATE_QUIRK,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_R,
                KEY_CATEGORY_QUIRKFUL
        ));

        registerKeyInputs();
    }

    private static void registerKeyInputs()
    {
        ClientTickEvents.END_CLIENT_TICK.register(mcClient ->
        {
            // (YoArchh) - TODO: Handle quirk activation.
            if (ACTIVATE_QUIRK.wasPressed())
            {
                // Test
                mcClient.player.sendMessage(Text.literal("Quirk Activated!"));
            }
        });
    }
}
