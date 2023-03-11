
package com.github.lolxd.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import com.github.lolxd.init.CirtoModItems;

public class RubyyyHoeItem extends HoeItem {
	public RubyyyHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1756;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CirtoModItems.RUBY.get()));
			}
		}, 0, 0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
