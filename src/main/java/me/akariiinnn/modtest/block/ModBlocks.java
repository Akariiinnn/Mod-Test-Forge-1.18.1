package me.akariiinnn.modtest.block;

import me.akariiinnn.modtest.ModTest;
import me.akariiinnn.modtest.block.custom.CucumberPlantBlock;
import me.akariiinnn.modtest.block.custom.PistineLampBlock;
import me.akariiinnn.modtest.block.custom.SpeedyBlock;
import me.akariiinnn.modtest.item.ModCreativeModeTab;
import me.akariiinnn.modtest.item.ModItems;
import me.akariiinnn.modtest.sound.ModSounds;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ModTest.MOD_ID);

    public static final RegistryObject<Block> PISTINE_BLOCK = registerBlock("pistine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> RAW_PISTINE_BLOCK = registerBlock("raw_pistine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> PISTINE_ORE = registerBlock("pistine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> ENDSTONE_PISTINE_ORE = registerBlock("endstone_pistine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_PISTINE_ORE = registerBlock("deepslate_pistine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> NETHERRACK_PISTINE_ORE = registerBlock("netherrack_pistine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> PISTINE_STAIRS = registerBlock("pistine_stairs",
            () -> new StairBlock(() -> ModBlocks.PISTINE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> PISTINE_SLAB = registerBlock("pistine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> PISTINE_FENCE = registerBlock("pistine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> PISTINE_FENCE_GATE = registerBlock("pistine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> PISTINE_WALL = registerBlock("pistine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> PISTINE_BUTTON = registerBlock("pistine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> PISTINE_PRESSURE_PLATE = registerBlock("pistine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(4f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(4f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> PINK_ROSE = registerBlock("pink_rose",
            () -> new FlowerBlock(MobEffects.LUCK, 1800,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)
                    .noOcclusion()), ModCreativeModeTab.PISTINE_TAB);
    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            () -> new FlowerPotBlock(null, ModBlocks.PINK_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.FLOWER_POT).noOcclusion()));

    public static final RegistryObject<Block> WINTER_WINDOW = registerBlock("winter_window",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).noOcclusion()), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> PISTINE_LAMP = registerBlock("pistine_lamp",
            () -> new PistineLampBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2).requiresCorrectToolForDrops()
                    .lightLevel((state) -> state.getValue(PistineLampBlock.CLICKED) ? 15 : 0).sound(ModSounds.PISTINE_LAMP_SOUNDS)), ModCreativeModeTab.PISTINE_TAB);

    public static final RegistryObject<Block> CUCUMBER_PLANT = registerBlockWithoutBlockItem("cucumber_plant",
            () -> new CucumberPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
