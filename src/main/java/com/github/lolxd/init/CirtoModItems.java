
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.lolxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.github.lolxd.item.RubyyySwordItem;
import com.github.lolxd.item.RubyyyShovelItem;
import com.github.lolxd.item.RubyyyPickaxeItem;
import com.github.lolxd.item.RubyyyHoeItem;
import com.github.lolxd.item.RubyyyAxeItem;
import com.github.lolxd.item.RubyItem;
import com.github.lolxd.CirtoMod;

public class CirtoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CirtoMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> GOBLIN_BLOCK = block(CirtoModBlocks.GOBLIN_BLOCK, null);
	public static final RegistryObject<Item> RUBYYY_AXE = REGISTRY.register("rubyyy_axe", () -> new RubyyyAxeItem());
	public static final RegistryObject<Item> RUBYYY_PICKAXE = REGISTRY.register("rubyyy_pickaxe", () -> new RubyyyPickaxeItem());
	public static final RegistryObject<Item> RUBYYY_SWORD = REGISTRY.register("rubyyy_sword", () -> new RubyyySwordItem());
	public static final RegistryObject<Item> RUBYYY_SHOVEL = REGISTRY.register("rubyyy_shovel", () -> new RubyyyShovelItem());
	public static final RegistryObject<Item> RUBYYY_HOE = REGISTRY.register("rubyyy_hoe", () -> new RubyyyHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
