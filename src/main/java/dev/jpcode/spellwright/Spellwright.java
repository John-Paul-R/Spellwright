package dev.jpcode.spellwright;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public class Spellwright implements ModInitializer
{
    public static final Logger LOGGER = LogManager.getLogger("spellwright");

    @Override
    public void onInitialize()
    {
        LOGGER.info("Spellwright is getting ready...");
    }
}
