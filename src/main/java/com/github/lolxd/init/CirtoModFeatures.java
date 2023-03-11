
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.lolxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import com.github.lolxd.world.features.ores.RubyBlockFeature;
import com.github.lolxd.CirtoMod;

@Mod.EventBusSubscriber
public class CirtoModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CirtoMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_BLOCK = REGISTRY.register("ruby_block", RubyBlockFeature::feature);
}
