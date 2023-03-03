package me.yoarchh.quirkful.mixins;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin
{
    // (YoArchh) - Defer DFU initialization if we are in a dev environment. Makes the game boot faster for those working on the mod.
    @Inject(at = @At("HEAD"), method = "enableDataFixerOptimization", cancellable = true)
    private static void onDataFixerOptimizationsEnable(CallbackInfo callbackInfo)
    {
        if (FabricLoader.getInstance().isDevelopmentEnvironment())
            callbackInfo.cancel();
    }
}
