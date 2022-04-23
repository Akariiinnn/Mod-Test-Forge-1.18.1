package me.akariiinnn.modtest.item;

import com.google.common.util.concurrent.ClosingFuture;
import me.akariiinnn.modtest.ModTest;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModTest.MOD_ID);

    public static final RegistryObject<Item> PISTINE = ITEMS.register("pistine",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_PISTINE = ITEMS.register("raw_pistine",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
