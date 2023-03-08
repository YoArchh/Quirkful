package me.yoarchh.quirkful.networking;

import me.yoarchh.quirkful.QuirkfulMod;
import me.yoarchh.quirkful.networking.packets.QuirkActivationC2SPacket;
import me.yoarchh.quirkful.networking.packets.QuirkDeactivationC2SPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class QuirkfulPackets
{
    public static final Identifier QUIRK_ACTIVATION = new Identifier(QuirkfulMod.getModID(), "quirk_activation");
    public static final Identifier QUIRK_DEACTIVATION = new Identifier(QuirkfulMod.getModID(), "quirk_deactivation");

    public static void registerClientToServerPackets()
    {
        ServerPlayNetworking.registerGlobalReceiver(QUIRK_ACTIVATION, new QuirkActivationC2SPacket());
        ServerPlayNetworking.registerGlobalReceiver(QUIRK_DEACTIVATION, new QuirkDeactivationC2SPacket());
    }

    public static void registerServerToClientPackets()
    {
    }
}
