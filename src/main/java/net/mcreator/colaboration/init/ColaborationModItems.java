
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.colaboration.item.WoodenArmorItem;
import net.mcreator.colaboration.ColaborationMod;

public class ColaborationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ColaborationMod.MODID);
	public static final RegistryObject<Item> WOODEN_ARMOR_HELMET = REGISTRY.register("wooden_armor_helmet", () -> new WoodenArmorItem.Helmet());
	public static final RegistryObject<Item> WOODEN_ARMOR_CHESTPLATE = REGISTRY.register("wooden_armor_chestplate", () -> new WoodenArmorItem.Chestplate());
	public static final RegistryObject<Item> WOODEN_ARMOR_LEGGINGS = REGISTRY.register("wooden_armor_leggings", () -> new WoodenArmorItem.Leggings());
	public static final RegistryObject<Item> WOODEN_ARMOR_BOOTS = REGISTRY.register("wooden_armor_boots", () -> new WoodenArmorItem.Boots());
}
