
package com.github.lolxd.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.github.lolxd.init.CirtoModTabs;
import com.github.lolxd.init.CirtoModItems;

public abstract class RubyyArmorItem extends ArmorItem {
	public RubyyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 23;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 9, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 14;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CirtoModItems.RUBY.get()));
			}

			@Override
			public String getName() {
				return "rubyy_armor";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RubyyArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CirtoModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cirto:textures/models/armor/rubyy_layer_1.png";
		}
	}

	public static class Chestplate extends RubyyArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CirtoModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cirto:textures/models/armor/rubyy_layer_1.png";
		}
	}

	public static class Leggings extends RubyyArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CirtoModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cirto:textures/models/armor/rubyy_layer_2.png";
		}
	}

	public static class Boots extends RubyyArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CirtoModTabs.TAB_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cirto:textures/models/armor/rubyy_layer_1.png";
		}
	}
}
