package com.lance5057.extradelight.addons;

import com.lance5057.extradelight.ExtraDelightBlocks;
import com.lance5057.extradelight.ExtraDelightItems;
import com.lance5057.extradelight.blocks.RecipeFeastBlock;
import com.lance5057.extradelight.food.EDFoods;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.RegistryObject;

public class ButchercraftAddon {

	public static final RegistryObject<RecipeFeastBlock> GOAT_STEW_BLOCK = ExtraDelightBlocks.BLOCKS.register(
			"goat_stew_block", () -> new RecipeFeastBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.8F)
					.sound(SoundType.LANTERN).color(MaterialColor.COLOR_BROWN), true, ExtraDelightBlocks.pot));

	public static final RegistryObject<BowlFoodItem> GOAT_STEW = ExtraDelightItems.ITEMS.register("goat_stew",
			() -> new BowlFoodItem(new Item.Properties().food(EDFoods.PORK_STEW).craftRemainder(Items.BOWL).stacksTo(16)
					.tab(ExtraDelightItems.EXTRA_DELIGHT_TAB)));

	public static final RegistryObject<BlockItem> GOAT_STEW_FEAST = ExtraDelightItems.ITEMS.register("goat_stew_feast",
			() -> new BlockItem(GOAT_STEW_BLOCK.get(),
					new Item.Properties().stacksTo(1).tab(ExtraDelightItems.EXTRA_DELIGHT_TAB)));

	public static final RegistryObject<BowlFoodItem> GOAT_STEW_RICE = ExtraDelightItems.ITEMS.register("goat_stew_rice",
			() -> new BowlFoodItem(new Item.Properties().food(EDFoods.BEEF_STEW_RICE).craftRemainder(Items.BOWL)
					.stacksTo(16).tab(ExtraDelightItems.EXTRA_DELIGHT_TAB)));
}
