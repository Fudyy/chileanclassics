package fudy.chileanclassics;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChileanClassics implements ModInitializer {
    public static String MOD_ID = "chileanclassics";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Mod initializing");
    }
}
