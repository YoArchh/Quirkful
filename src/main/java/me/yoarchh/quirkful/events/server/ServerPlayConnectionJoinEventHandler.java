package me.yoarchh.quirkful.events.server;

import me.yoarchh.quirkful.QuirkfulMod;
import me.yoarchh.quirkful.entity.player.QuirkfulPlayerEntity;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;

public class ServerPlayConnectionJoinEventHandler implements ServerPlayConnectionEvents.Join
{
    @Override
    public void onPlayReady(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server)
    {
        // Create a new QuirkfulPlayerEntity when the client joins a server. Could be either singleplayer or multiplayer.
        QuirkfulMod.getInstance().quirkfulPlayer = new QuirkfulPlayerEntity(handler.player);
    }
}
