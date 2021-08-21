package dev.jpcode.spellwright.submod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public class AnotherExample implements ModInitializer
{
    public static final Logger LOGGER = LogManager.getLogger("spellwright-sub");

    @Override
    public void onInitialize()
    {
        LOGGER.info("Another Example is getting ready...");
    }
}
