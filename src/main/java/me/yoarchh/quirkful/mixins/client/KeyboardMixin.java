package me.yoarchh.quirkful.mixins.client;

import me.yoarchh.quirkful.events.custom.QuirkfulKeyboardEvents;
import net.minecraft.client.Keyboard;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Keyboard.class)
public class KeyboardMixin
{
    @Inject(at = @At("TAIL"), method = "onKey")
    public void invokeQuirkfulKeyboardEvents(long window, int key, int scancode, int action, int modifiers, CallbackInfo callbackInfo)
    {
        if (action == GLFW.GLFW_RELEASE)
            QuirkfulKeyboardEvents.KEY_RELEASE.invoker().onKeyReleased(key);
    }
}
