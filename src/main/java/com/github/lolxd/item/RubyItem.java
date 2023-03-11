
package com.github.lolxd.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.github.lolxd.init.CirtoModTabs;

public class RubyItem extends Item {
	public RubyItem() {
		super(new Item.Properties().tab(CirtoModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Rare drop found in the deep parts of the world"));
	}
}
