package me.yoarchh.quirkful.networking;

import me.yoarchh.quirkful.QuirkfulMod;
import me.yoarchh.quirkful.networking.packets.QuirkActivationC2SPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class QuirkfulPackets
{
    public static final Identifier QUIRK_ACTIVATION = new Identifier(QuirkfulMod.getModID(), "quirk_activation");

    public static void registerClientToServerPackets()
    {
        ServerPlayNetworking.registerGlobalReceiver(QUIRK_ACTIVATION, new QuirkActivationC2SPacket());
    }

    public static void registerServerToClientPackets()
    {

    }
}
