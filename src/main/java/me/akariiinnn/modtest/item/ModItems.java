package me.akariiinnn.modtest.item;

import com.google.common.util.concurrent.ClosingFuture;
import me.akariiinnn.modtest.ModTest;
import me.akariiinnn.modtest.item.custom.DowsingRodItem;
import me.akariiinnn.modtest.item.custom.FireSwordItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModTest.MOD_ID);

    public static final RegistryObject<Item> PISTINE = ITEMS.register("pistine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> RAW_PISTINE = ITEMS.register("raw_pistine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB).durability(16)));

    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB).food(ModFoods.CUCUMBER)));

    public static final RegistryObject<Item> CUCUMBER_SALAD = ITEMS.register("cucumber_salad",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB).food(ModFoods.CUCUMBER_SALAD)));

    public static final RegistryObject<Item> PISTINE_SWORD = ITEMS.register("pistine_sword",
            () -> new SwordItem(ModTiers.PISTINE, 2, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> PISTINE_PICKAXE = ITEMS.register("pistine_pickaxe",
            () -> new PickaxeItem(ModTiers.PISTINE, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> PISTINE_AXE = ITEMS.register("pistine_axe",
            () -> new AxeItem(ModTiers.PISTINE, 4, 0.4f,
                    new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> PISTINE_SHOVEl = ITEMS.register("pistine_shovel",
            () -> new ShovelItem(ModTiers.PISTINE, 1, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> PISTINE_HOE = ITEMS.register("pistine_hoe",
            () -> new HoeItem(ModTiers.PISTINE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));

    public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new FireSwordItem(Tiers.IRON,1,1f,
                    new Item.Properties().tab(ModCreativeModeTab.PISTINE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
