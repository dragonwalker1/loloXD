
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.colaboration.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ColaborationModTabs {
	public static CreativeModeTab TAB_ITEMS;

	public static void load() {
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.CREEPER_HEAD);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
