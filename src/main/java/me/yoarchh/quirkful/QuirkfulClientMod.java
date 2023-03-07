package me.yoarchh.quirkful;

import me.yoarchh.quirkful.input.QuirkfulKeyInputHandler;
import me.yoarchh.quirkful.networking.QuirkfulPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

@Environment(EnvType.CLIENT)
public class QuirkfulClientMod implements ClientModInitializer
{
    private static QuirkfulClientMod INSTANCE;

    private static final Logger LOGGER = (Logger) LogManager.getLogger("Quirkful Client");

    @Override
    public void onInitializeClient()
    {
        INSTANCE = this;

        QuirkfulKeyInputHandler.initializeKeyBindings();

        QuirkfulPackets.registerServerToClientPackets();

        LOGGER.info("Initialized Quirkful Client!");
    }

    public static QuirkfulClientMod getInstance() { return INSTANCE; }

    public static Logger getLogger() { return LOGGER; }
}
