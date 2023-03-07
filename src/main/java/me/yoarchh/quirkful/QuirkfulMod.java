package me.yoarchh.quirkful;

import me.yoarchh.quirkful.entity.player.QuirkfulPlayerEntity;
import me.yoarchh.quirkful.events.server.ServerPlayConnectionJoinEventHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class QuirkfulMod implements ModInitializer
{
    private static QuirkfulMod INSTANCE;

    private static final Logger LOGGER = (Logger) LogManager.getLogger("Quirkful");

    private static final String MOD_ID = "quirkful";

    public QuirkfulPlayerEntity quirkfulPlayer;

    @Override
    public void onInitialize()
    {
        INSTANCE = this;

        ServerPlayConnectionEvents.JOIN.register(new ServerPlayConnectionJoinEventHandler());

        LOGGER.info("Initialized Quirkful!");
    }

    public static QuirkfulMod getInstance() { return INSTANCE; }

    public static Logger getLogger() { return LOGGER; }

    public static String getModID() { return MOD_ID; }
}
