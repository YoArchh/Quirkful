package me.yoarchh.quirkful.events.server;

import com.mojang.authlib.GameProfile;
import me.yoarchh.quirkful.QuirkfulMod;
import me.yoarchh.quirkful.entity.player.QuirkfulPlayerEntity;
import me.yoarchh.quirkful.quirks.emitter.TestQuirk;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ServerPlayConnectionJoinEventHandler implements ServerPlayConnectionEvents.Join
{
    @Override
    public void onPlayReady(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server)
    {
        World playerWorld = handler.player.world;
        BlockPos playerBlockPos = handler.player.getBlockPos();
        float playerYaw = handler.player.getYaw();
        GameProfile playerGameProfile = handler.player.getGameProfile();

        QuirkfulMod.getInstance().quirkfulPlayer = new QuirkfulPlayerEntity(playerWorld, playerBlockPos, playerYaw, playerGameProfile);

        // TEST
        QuirkfulMod.getInstance().quirkfulPlayer.setQuirk(new TestQuirk());
    }
}
