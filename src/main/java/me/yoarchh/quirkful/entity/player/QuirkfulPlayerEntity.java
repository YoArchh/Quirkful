package me.yoarchh.quirkful.entity.player;

import net.minecraft.entity.player.PlayerEntity;

public class QuirkfulPlayerEntity
{
    private final PlayerEntity playerEntityHandle;

    public QuirkfulPlayerEntity(PlayerEntity playerEntity)
    {
        this.playerEntityHandle = playerEntity;
    }

    public PlayerEntity getHandle() { return this.playerEntityHandle; }
}
