package me.yoarchh.quirkful.entity.player;

import com.mojang.authlib.GameProfile;
import me.yoarchh.quirkful.quirks.base.Quirk;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameMode;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class QuirkfulPlayerEntity extends PlayerEntity
{
    private PlayerListEntry playerListEntry;

    private Quirk currentQuirk;

    public QuirkfulPlayerEntity(World world, BlockPos pos, float yaw, GameProfile gameProfile)
    {
        super(world, pos, yaw, gameProfile);
    }

    public boolean isQuirkless()
    {
        return this.currentQuirk == null;
    }

    public Quirk getQuirk()
    {
        return this.currentQuirk;
    }

    public void setQuirk(Quirk newQuirk)
    {
        this.currentQuirk = newQuirk;
    }

    @Override
    public boolean isSpectator()
    {
        PlayerListEntry playerListEntry = this.getPlayerListEntry();
        return playerListEntry != null && playerListEntry.getGameMode() == GameMode.SPECTATOR;
    }

    @Override
    public boolean isCreative()
    {
        PlayerListEntry playerListEntry = this.getPlayerListEntry();
        return playerListEntry != null && playerListEntry.getGameMode().isCreative();
    }

    @Nullable
    private PlayerListEntry getPlayerListEntry()
    {
        if (this.playerListEntry == null)
            this.playerListEntry = MinecraftClient.getInstance().getNetworkHandler().getPlayerListEntry(this.getUuid());

        return this.playerListEntry;
    }
}
