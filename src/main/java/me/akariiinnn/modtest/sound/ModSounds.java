package me.akariiinnn.modtest.sound;

import me.akariiinnn.modtest.ModTest;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ModTest.MOD_ID);

    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");

    public static final RegistryObject<SoundEvent> PISTINE_LAMP_BREAK = registerSoundEvent("pistine_lamp_break");
    public static final RegistryObject<SoundEvent> PISTINE_LAMP_STEP = registerSoundEvent("pistine_lamp_step");
    public static final RegistryObject<SoundEvent> PISTINE_LAMP_PLACE = registerSoundEvent("pistine_lamp_place");
    public static final RegistryObject<SoundEvent> PISTINE_LAMP_HIT = registerSoundEvent("pistine_lamp_hit");
    public static final RegistryObject<SoundEvent> PISTINE_LAMP_FALL = registerSoundEvent("pistine_lamp_fall");

    public static final ForgeSoundType PISTINE_LAMP_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.PISTINE_LAMP_BREAK, ModSounds.PISTINE_LAMP_STEP, ModSounds.PISTINE_LAMP_PLACE,
            ModSounds.PISTINE_LAMP_HIT, ModSounds.PISTINE_LAMP_FALL);


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(ModTest.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
