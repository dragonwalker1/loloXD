
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
import com.github.lolxd.item.RubyyArmorItem;
import com.github.lolxd.item.RubyItem;
import com.github.lolxd.item.CrystalSwordItem;
import com.github.lolxd.item.CrystalShovelItem;
import com.github.lolxd.item.CrystalPickaxeItem;
import com.github.lolxd.item.CrystalHoeItem;
import com.github.lolxd.item.CrystalAxeItem;
import com.github.lolxd.item.CrystalArmorItem;
import com.github.lolxd.CirtoMod;

public class CirtoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CirtoMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> GOBLIN_BLOCK = block(CirtoModBlocks.GOBLIN_BLOCK, null);
	public static final RegistryObject<Item> RUBYY_ARMOR_HELMET = REGISTRY.register("rubyy_armor_helmet", () -> new RubyyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBYY_ARMOR_CHESTPLATE = REGISTRY.register("rubyy_armor_chestplate", () -> new RubyyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBYY_ARMOR_LEGGINGS = REGISTRY.register("rubyy_armor_leggings", () -> new RubyyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBYY_ARMOR_BOOTS = REGISTRY.register("rubyy_armor_boots", () -> new RubyyArmorItem.Boots());
	public static final RegistryObject<Item> RUBYYY_AXE = REGISTRY.register("rubyyy_axe", () -> new RubyyyAxeItem());
	public static final RegistryObject<Item> RUBYYY_PICKAXE = REGISTRY.register("rubyyy_pickaxe", () -> new RubyyyPickaxeItem());
	public static final RegistryObject<Item> RUBYYY_SWORD = REGISTRY.register("rubyyy_sword", () -> new RubyyySwordItem());
	public static final RegistryObject<Item> RUBYYY_SHOVEL = REGISTRY.register("rubyyy_shovel", () -> new RubyyyShovelItem());
	public static final RegistryObject<Item> RUBYYY_HOE = REGISTRY.register("rubyyy_hoe", () -> new RubyyyHoeItem());
	public static final RegistryObject<Item> RUBY_ORE = block(CirtoModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_BLOCK = block(CirtoModBlocks.RUBY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRYSTAL_ARMOR_HELMET = REGISTRY.register("crystal_armor_helmet", () -> new CrystalArmorItem.Helmet());
	public static final RegistryObject<Item> CRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("crystal_armor_chestplate", () -> new CrystalArmorItem.Chestplate());
	public static final RegistryObject<Item> CRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("crystal_armor_leggings", () -> new CrystalArmorItem.Leggings());
	public static final RegistryObject<Item> CRYSTAL_ARMOR_BOOTS = REGISTRY.register("crystal_armor_boots", () -> new CrystalArmorItem.Boots());
	public static final RegistryObject<Item> CRYSTAL_PICKAXE = REGISTRY.register("crystal_pickaxe", () -> new CrystalPickaxeItem());
	public static final RegistryObject<Item> CRYSTAL_AXE = REGISTRY.register("crystal_axe", () -> new CrystalAxeItem());
	public static final RegistryObject<Item> CRYSTAL_SWORD = REGISTRY.register("crystal_sword", () -> new CrystalSwordItem());
	public static final RegistryObject<Item> CRYSTAL_SHOVEL = REGISTRY.register("crystal_shovel", () -> new CrystalShovelItem());
	public static final RegistryObject<Item> CRYSTAL_HOE = REGISTRY.register("crystal_hoe", () -> new CrystalHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
