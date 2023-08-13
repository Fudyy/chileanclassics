package fudy.chileanclassics.item;

import fudy.chileanclassics.ChileanClassics;
import fudy.chileanclassics.sound.SoundEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    public static Item BAILANDO_SOLO_MUSIC_DISC = registerItem("bailando_solo_music_disc",
            new MusicDiscItem(9, SoundEvents.BAILANDO_SOLO, new FabricItemSettings().maxCount(1), 267));
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ChileanClassics.MOD_ID, name), item);
    }
    public static void registerItems(){
        ChileanClassics.LOGGER.info("Registering items");
    }
}
