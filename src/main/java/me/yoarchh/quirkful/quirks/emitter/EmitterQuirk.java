package me.yoarchh.quirkful.quirks.emitter;

import me.yoarchh.quirkful.quirks.QuirkAttributes;
import me.yoarchh.quirkful.quirks.base.Quirk;

public abstract class EmitterQuirk extends Quirk
{
    private final QuirkAttributes attributes;

    public EmitterQuirk(QuirkAttributes attributes)
    {
        this.attributes = attributes;
    }

    @Override
    public QuirkAttributes getAttributes()
    {
        return this.attributes;
    }
}
