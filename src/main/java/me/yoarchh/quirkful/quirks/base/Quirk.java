package me.yoarchh.quirkful.quirks.base;

import me.yoarchh.quirkful.entity.player.QuirkfulPlayerEntity;
import me.yoarchh.quirkful.quirks.QuirkAttributes;

/**
 * <p>Represents a base Quirk.</p>
 *
 * <br/>
 *
 * On its own, it represents a Quirk with a singular ability/move. However, when
 */
public abstract class Quirk
{
    public abstract void onQuirkActivate(QuirkfulPlayerEntity player);

    public abstract QuirkAttributes getAttributes();
}
