package me.yoarchh.quirkful.events.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(EnvType.CLIENT)
public final class QuirkfulKeyboardEvents
{
    public static final Event<KeyRelease> KEY_RELEASE = EventFactory.createArrayBacked(KeyRelease.class, (listeners) -> (keyCode) ->
    {
        for (KeyRelease eventListener : listeners)
            eventListener.onKeyReleased(keyCode);
    });

    @Environment(EnvType.CLIENT)
    @FunctionalInterface
    public interface KeyRelease
    {
        void onKeyReleased(int keyCode);
    }
}
