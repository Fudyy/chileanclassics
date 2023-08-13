package fudy.chileanclassics;

import fudy.chileanclassics.item.Items;
import fudy.chileanclassics.sound.SoundEvents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChileanClassics implements ModInitializer {
    public static String MOD_ID = "chileanclassics";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Mod initializing");
        SoundEvents.registerSoundEvents();
        Items.registerItems();
    }
}
