
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.colaboration.block.DsdfsfOreBlock;
import net.mcreator.colaboration.block.DsdfsfBlockBlock;
import net.mcreator.colaboration.ColaborationMod;

public class ColaborationModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ColaborationMod.MODID);
	public static final RegistryObject<Block> DSDFSF_BLOCK = REGISTRY.register("dsdfsf_block", () -> new DsdfsfBlockBlock());
	public static final RegistryObject<Block> DSDFSF_ORE = REGISTRY.register("dsdfsf_ore", () -> new DsdfsfOreBlock());
}
