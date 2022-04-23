package me.akariiinnn.modtest.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PISTINE_TAB = new CreativeModeTab("pistinetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PISTINE.get());
        }
    };
}
