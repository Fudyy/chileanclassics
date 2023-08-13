package fudy.chileanclassics.sound;

import fudy.chileanclassics.ChileanClassics;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SoundEvents {

    public static SoundEvent BAILANDO_SOLO = registerSoundEvent("bailando_solo");

    public static SoundEvent registerSoundEvent(String name){
        Identifier identifier = new Identifier(ChileanClassics.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier , SoundEvent.of(identifier));
    }
    public static void registerSoundEvents(){
        ChileanClassics.LOGGER.info("Registering sounds.");
    }
}
