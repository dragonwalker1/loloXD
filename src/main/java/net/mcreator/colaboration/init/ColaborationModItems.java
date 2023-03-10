
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.colaboration.item.DsdfsfSwordItem;
import net.mcreator.colaboration.item.DsdfsfShovelItem;
import net.mcreator.colaboration.item.DsdfsfPickaxeItem;
import net.mcreator.colaboration.item.DsdfsfItem;
import net.mcreator.colaboration.item.DsdfsfHoeItem;
import net.mcreator.colaboration.item.DsdfsfAxeItem;
import net.mcreator.colaboration.item.DsdfsfArmorItem;
import net.mcreator.colaboration.ColaborationMod;

public class ColaborationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ColaborationMod.MODID);
	public static final RegistryObject<Item> DSDFSF_BLOCK = block(ColaborationModBlocks.DSDFSF_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DSDFSF_ORE = block(ColaborationModBlocks.DSDFSF_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DSDFSF_AXE = REGISTRY.register("dsdfsf_axe", () -> new DsdfsfAxeItem());
	public static final RegistryObject<Item> DSDFSF_PICKAXE = REGISTRY.register("dsdfsf_pickaxe", () -> new DsdfsfPickaxeItem());
	public static final RegistryObject<Item> DSDFSF_SWORD = REGISTRY.register("dsdfsf_sword", () -> new DsdfsfSwordItem());
	public static final RegistryObject<Item> DSDFSF_SHOVEL = REGISTRY.register("dsdfsf_shovel", () -> new DsdfsfShovelItem());
	public static final RegistryObject<Item> DSDFSF_HOE = REGISTRY.register("dsdfsf_hoe", () -> new DsdfsfHoeItem());
	public static final RegistryObject<Item> DSDFSF = REGISTRY.register("dsdfsf", () -> new DsdfsfItem());
	public static final RegistryObject<Item> DSDFSF_ARMOR_HELMET = REGISTRY.register("dsdfsf_armor_helmet", () -> new DsdfsfArmorItem.Helmet());
	public static final RegistryObject<Item> DSDFSF_ARMOR_CHESTPLATE = REGISTRY.register("dsdfsf_armor_chestplate", () -> new DsdfsfArmorItem.Chestplate());
	public static final RegistryObject<Item> DSDFSF_ARMOR_LEGGINGS = REGISTRY.register("dsdfsf_armor_leggings", () -> new DsdfsfArmorItem.Leggings());
	public static final RegistryObject<Item> DSDFSF_ARMOR_BOOTS = REGISTRY.register("dsdfsf_armor_boots", () -> new DsdfsfArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
