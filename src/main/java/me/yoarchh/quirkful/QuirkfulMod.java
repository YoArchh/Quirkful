package me.yoarchh.quirkful;

import me.yoarchh.quirkful.quirks.QuirkAttributes;
import me.yoarchh.quirkful.quirks.QuirkCategory;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class QuirkfulMod implements ModInitializer
{
    private static QuirkfulMod INSTANCE;

    private static final Logger LOGGER = (Logger) LogManager.getLogger("Quirkful");

    private static final String MOD_ID = "quirkful";

    @Override
    public void onInitialize()
    {
        INSTANCE = this;

        // (YoArchh) QuirkAttributes Test
        QuirkAttributes quirkProps = QuirkAttributes.builder()
                .name("Float")
                .description("The quirk of the 7th user of One For All, Nana Shimura")
                .category(QuirkCategory.EMITTER)
                .build();

        LOGGER.info("{}", quirkProps);

        LOGGER.info("Initialized Quirkful!");
    }

    public static QuirkfulMod getInstance() { return INSTANCE; }

    public static Logger getLogger() { return LOGGER; }

    public static String getModID() { return MOD_ID; }
}
