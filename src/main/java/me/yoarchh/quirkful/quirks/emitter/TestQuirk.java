package me.yoarchh.quirkful.quirks.emitter;

import me.yoarchh.quirkful.QuirkfulMod;
import me.yoarchh.quirkful.entity.player.QuirkfulPlayerEntity;
import me.yoarchh.quirkful.quirks.QuirkAttributes;
import me.yoarchh.quirkful.quirks.QuirkCategory;

// Temporary Quirk for testing
public class TestQuirk extends EmitterQuirk
{
    public TestQuirk()
    {
        super(QuirkAttributes.builder().name("Test").description("A Testing Quirk").category(QuirkCategory.EMITTER).build());
    }

    @Override
    public void onQuirkActivate(QuirkfulPlayerEntity player)
    {
        QuirkfulMod.getLogger().info("{} activated their Quirk: {}", player.getName().getString(), this.getAttributes().getName());
    }

    @Override
    public void onQuirkDeactivate(QuirkfulPlayerEntity player)
    {
        QuirkfulMod.getLogger().info("{} deactivated their Quirk: {}", player.getName().getString(), this.getAttributes().getName());
    }
}
