package me.yoarchh.quirkful.events.impl;

import me.yoarchh.quirkful.events.custom.QuirkfulKeyboardEvents;
import me.yoarchh.quirkful.input.QuirkfulKeyInputHandler;
import me.yoarchh.quirkful.networking.QuirkfulPackets;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;

public class QuirkfulKeyReleasedEventHandler implements QuirkfulKeyboardEvents.KeyRelease
{
    @Override
    public void onKeyReleased(int keyCode)
    {
        final KeyBinding activateQuirkKey = QuirkfulKeyInputHandler.ACTIVATE_QUIRK;

        /* -- YoArchh -- */
        // Quirk Deactivation.
        // It's done like this because I couldn't be bothered to figure out how to detect it via either custom logic or with the is/wasPressed methods.
        // We also make the network handler isn't null to prevent a crash where we send a packet while we're not in game.
        if (keyCode == KeyBindingHelper.getBoundKeyOf(activateQuirkKey).getCode() && MinecraftClient.getInstance().getNetworkHandler() != null)
            ClientPlayNetworking.send(QuirkfulPackets.QUIRK_DEACTIVATION, PacketByteBufs.empty());
    }
}
