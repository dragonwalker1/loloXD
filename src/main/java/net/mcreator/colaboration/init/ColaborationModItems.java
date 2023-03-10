
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.colaboration.item.RedArmorItem;
import net.mcreator.colaboration.ColaborationMod;

public class ColaborationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ColaborationMod.MODID);
	public static final RegistryObject<Item> RED_ARMOR_HELMET = REGISTRY.register("red_armor_helmet", () -> new RedArmorItem.Helmet());
	public static final RegistryObject<Item> RED_ARMOR_CHESTPLATE = REGISTRY.register("red_armor_chestplate", () -> new RedArmorItem.Chestplate());
	public static final RegistryObject<Item> RED_ARMOR_LEGGINGS = REGISTRY.register("red_armor_leggings", () -> new RedArmorItem.Leggings());
	public static final RegistryObject<Item> RED_ARMOR_BOOTS = REGISTRY.register("red_armor_boots", () -> new RedArmorItem.Boots());
}
