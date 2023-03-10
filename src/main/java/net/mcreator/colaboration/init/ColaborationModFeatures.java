
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.colaboration.world.features.ores.DsdfsfOreFeature;
import net.mcreator.colaboration.ColaborationMod;

@Mod.EventBusSubscriber
public class ColaborationModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ColaborationMod.MODID);
	public static final RegistryObject<Feature<?>> DSDFSF_ORE = REGISTRY.register("dsdfsf_ore", DsdfsfOreFeature::feature);
}
