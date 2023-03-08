package me.yoarchh.quirkful.networking.packets;

import me.yoarchh.quirkful.QuirkfulMod;
import me.yoarchh.quirkful.entity.player.QuirkfulPlayerEntity;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class QuirkDeactivationC2SPacket implements ServerPlayNetworking.PlayChannelHandler
{
    @Override
    public void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender)
    {
        // Deactivate the player's Quirk.
        final QuirkfulPlayerEntity quirkfulPlayer = QuirkfulMod.getInstance().getQuirkfulPlayer();
        if (!quirkfulPlayer.isQuirkless())
            quirkfulPlayer.getQuirk().onQuirkDeactivate(quirkfulPlayer);
    }
}
