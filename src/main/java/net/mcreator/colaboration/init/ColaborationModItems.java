
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.colaboration.ColaborationMod;

public class ColaborationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ColaborationMod.MODID);
	public static final RegistryObject<Item> GREMLIN_SPAWN_EGG = REGISTRY.register("gremlin_spawn_egg", () -> new ForgeSpawnEggItem(ColaborationModEntities.GREMLIN, -16738048, -10066330, new Item.Properties().tab(ColaborationModTabs.TAB_ITEMS)));
}
