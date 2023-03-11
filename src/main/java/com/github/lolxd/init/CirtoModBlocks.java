
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.lolxd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.github.lolxd.block.RubyBlockBlock;
import com.github.lolxd.block.GoblinBlockBlock;
import com.github.lolxd.CirtoMod;

public class CirtoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CirtoMod.MODID);
	public static final RegistryObject<Block> GOBLIN_BLOCK = REGISTRY.register("goblin_block", () -> new GoblinBlockBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
}
