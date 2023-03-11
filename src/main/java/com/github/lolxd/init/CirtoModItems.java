
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

import com.github.lolxd.item.RubyyArmorItem;
import com.github.lolxd.item.RubyItem;
import com.github.lolxd.CirtoMod;

public class CirtoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CirtoMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> GOBLIN_BLOCK = block(CirtoModBlocks.GOBLIN_BLOCK, null);
	public static final RegistryObject<Item> RUBYY_ARMOR_HELMET = REGISTRY.register("rubyy_armor_helmet", () -> new RubyyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBYY_ARMOR_CHESTPLATE = REGISTRY.register("rubyy_armor_chestplate", () -> new RubyyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBYY_ARMOR_LEGGINGS = REGISTRY.register("rubyy_armor_leggings", () -> new RubyyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBYY_ARMOR_BOOTS = REGISTRY.register("rubyy_armor_boots", () -> new RubyyArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
