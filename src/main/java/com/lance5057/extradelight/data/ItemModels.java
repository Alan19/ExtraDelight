package com.lance5057.extradelight.data;

import com.lance5057.extradelight.ExtraDelight;
import com.lance5057.extradelight.ExtraDelightItems;
import com.lance5057.extradelight.aesthetics.AestheticBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider {

	public ItemModels(DataGenerator generator, ExistingFileHelper fh) {
		super(generator, ExtraDelight.MOD_ID, fh);
	}

	@Override
	protected void registerModels() {
		getBuilder(ExtraDelightItems.OVEN.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/oven")));
		getBuilder(ExtraDelightItems.FOOD_DISPLAY.getId().getPath()).parent(
				new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/food_display")));
		getBuilder(ExtraDelightItems.DOUGH_SHAPING.getId().getPath()).parent(
				new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/doughforming")));
		getBuilder(ExtraDelightItems.MIXING_BOWL.getId().getPath()).parent(
				new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/mixing_bowl")));
		getBuilder(ExtraDelightItems.YEAST_POT.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/yeast_pot")));
		getBuilder(ExtraDelightItems.VINEGAR_POT.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/yeast_pot")))
				.texture("0", modLoc("block/vinegarpot"));
		getBuilder(ExtraDelightItems.GRATER.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/grater")));

		getBuilder(ExtraDelightItems.OFFSET_SPATULA_DIAMOND.getId().getPath())
				.parent(new ModelFile.ExistingModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "item/offset_spatula"), existingFileHelper))
				.texture("0", modLoc("item/offset_spatula_diamond"));
		getBuilder(ExtraDelightItems.OFFSET_SPATULA_GOLD.getId().getPath())
				.parent(new ModelFile.ExistingModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "item/offset_spatula"), existingFileHelper))
				.texture("0", modLoc("item/offset_spatula_gold"));
		getBuilder(ExtraDelightItems.OFFSET_SPATULA_IRON.getId().getPath())
				.parent(new ModelFile.ExistingModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "item/offset_spatula"), existingFileHelper))
				.texture("0", modLoc("item/offset_spatula_iron"));
		getBuilder(ExtraDelightItems.OFFSET_SPATULA_NETHERITE.getId().getPath())
				.parent(new ModelFile.ExistingModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "item/offset_spatula"), existingFileHelper))
				.texture("0", modLoc("item/offset_spatula_netherite"));
		getBuilder(ExtraDelightItems.OFFSET_SPATULA_WOOD.getId().getPath())
				.parent(new ModelFile.ExistingModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "item/offset_spatula"), existingFileHelper))
				.texture("0", modLoc("item/offset_spatula_wood"));

		getBuilder(ExtraDelightItems.DRYING_RACK.getId().getPath()).parent(
				new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "block/drying_rack")));

		getBuilder(ExtraDelightItems.MORTAR_STONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/stone"));
		getBuilder(ExtraDelightItems.MORTAR_ANDESITE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/andesite"));
		getBuilder(ExtraDelightItems.MORTAR_GRANITE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/granite"));
		getBuilder(ExtraDelightItems.MORTAR_DIORITE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/diorite"));
		getBuilder(ExtraDelightItems.MORTAR_DEEPSLATE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/deepslate"));
		getBuilder(ExtraDelightItems.MORTAR_BLACKSTONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/blackstone"));
		getBuilder(ExtraDelightItems.MORTAR_BASALT.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/basalt_top"));
		getBuilder(ExtraDelightItems.MORTAR_ENDSTONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/end_stone"));

		getBuilder(ExtraDelightItems.MORTAR_AMETHYST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/amethyst_block")); // not craftable, dungeon item
		getBuilder(ExtraDelightItems.MORTAR_GILDED_BLACKSTONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/mortar")))
				.texture("0", mcLoc("block/gilded_blackstone")); // not craftable, dungeon item

		getBuilder(ExtraDelightItems.PESTLE_STONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/stone"));
		getBuilder(ExtraDelightItems.PESTLE_ANDESITE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/andesite"));
		getBuilder(ExtraDelightItems.PESTLE_GRANITE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/granite"));
		getBuilder(ExtraDelightItems.PESTLE_DIORITE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/diorite"));
		getBuilder(ExtraDelightItems.PESTLE_DEEPSLATE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/deepslate"));
		getBuilder(ExtraDelightItems.PESTLE_BLACKSTONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/blackstone"));
		getBuilder(ExtraDelightItems.PESTLE_BASALT.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/basalt_top"));
		getBuilder(ExtraDelightItems.PESTLE_ENDSTONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/end_stone"));

		getBuilder(ExtraDelightItems.PESTLE_AMETHYST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/amethyst_block")); // not craftable, dungeon item
		getBuilder(ExtraDelightItems.PESTLE_GILDED_BLACKSTONE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID, "item/pestle")))
				.texture("0", mcLoc("block/gilded_blackstone")); // not craftable, dungeon item

		getBuilder(ExtraDelightItems.CORN_COB_PIPE.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "item/corncob_pipe")))
				.texture("1", modLoc("item/corncob_pipe")); // not craftable, dungeon item

		forItem(ExtraDelightItems.ROUND_PAN, "round_pan");
		forItem(ExtraDelightItems.BAKING_STONE, "baking_stone");
		forItem(ExtraDelightItems.LOAF_PAN, "loaf_pan");
		forItem(ExtraDelightItems.MUFFIN_TIN, "muffin_tin");
		forItem(ExtraDelightItems.PIE_DISH, "pie_dish");
		forItem(ExtraDelightItems.SHEET, "sheet");
		forItem(ExtraDelightItems.SQUARE_PAN, "square_pan");
		forItem(ExtraDelightItems.TRAY, "tray");

		forItem(ExtraDelightItems.WOODEN_SPOON, "wooden_spoon");
		forItem(ExtraDelightItems.DIAMOND_SPOON, "diamond_spoon");
		forItem(ExtraDelightItems.GOLD_SPOON, "gold_spoon");
		forItem(ExtraDelightItems.IRON_SPOON, "iron_spoon");
		forItem(ExtraDelightItems.NETHERITE_SPOON, "netherite_spoon");
		forItem(ExtraDelightItems.STONE_SPOON, "stone_spoon");

		forItem(ExtraDelightItems.YEAST, "yeast");
		forItem(ExtraDelightItems.FLOUR, "flour");
		forItem(ExtraDelightItems.COOKING_OIL, "cooking_oil");
		forItem(ExtraDelightItems.SUNFLOWER_SEEDS, "sunflower_seeds");
		forItem(ExtraDelightItems.GRAVY, "gravy");

		forItem(ExtraDelightItems.SEAWEED_PASTE, "seaweed_paste");
		forItem(ExtraDelightItems.AGAR_SHEETS, "agar_sheets");
		forItem(ExtraDelightItems.AGAR_AGAR, "agaragar");

		// Juice
		forItem(ExtraDelightItems.GLOW_BERRY_JUICE, "glow_berry_juice");
		forItem(ExtraDelightItems.SWEET_BERRY_JUICE, "sweet_berry_juice");
		forItem(ExtraDelightItems.TOMATO_JUICE, "tomato_juice");

		// Custard
		forItem(ExtraDelightItems.SWEET_BERRY_CUSTARD, "sweet_berry_custard");
		forItem(ExtraDelightItems.CHOCOLATE_CUSTARD, "chocolate_custard");
		forItem(ExtraDelightItems.PUMPKIN_CUSTARD, "pumpkin_custard");
		forItem(ExtraDelightItems.HONEY_CUSTARD, "honey_custard");
		forItem(ExtraDelightItems.APPLE_CUSTARD, "apple_custard");

		// Pie
		forItem(ExtraDelightItems.SWEET_BERRY_PIE_SLICE, "sweet_berry_pie_slice");
		forItem(ExtraDelightItems.GLOW_BERRY_PIE_SLICE, "glow_berry_pie_slice");
		forItem(ExtraDelightItems.CHEESECAKE_SLICE, "cheesecake_slice");
		forItem(ExtraDelightItems.HONEY_CHEESECAKE_SLICE, "honey_cheesecake_slice");
		forItem(ExtraDelightItems.CHOCOLATE_CHEESECAKE_SLICE, "chocolate_cheesecake_slice");
		forItem(ExtraDelightItems.PUMPKIN_CHEESECAKE_SLICE, "pumpkin_cheesecake_slice");
		forItem(ExtraDelightItems.GLOW_BERRY_CHEESECAKE_SLICE, "glow_berry_cheesecake_slice");
		forItem(ExtraDelightItems.APPLE_CHEESECAKE_SLICE, "apple_cheesecake_slice");

		forItem(ExtraDelightItems.SWEET_BERRY_PIE_ITEM, "sweet_berry_pie");
		forItem(ExtraDelightItems.GLOW_BERRY_PIE_ITEM, "glow_berry_pie");
		forItem(ExtraDelightItems.CHEESECAKE_ITEM, "cheesecake");
		forItem(ExtraDelightItems.HONEY_CHEESECAKE_ITEM, "honey_cheesecake");
		forItem(ExtraDelightItems.CHOCOLATE_CHEESECAKE_ITEM, "chocolate_cheesecake");
		forItem(ExtraDelightItems.PUMPKIN_CHEESECAKE_ITEM, "pumpkin_cheesecake");
		forItem(ExtraDelightItems.GLOW_BERRY_CHEESECAKE_ITEM, "glow_berry_cheesecake");
		forItem(ExtraDelightItems.APPLE_CHEESECAKE_ITEM, "apple_cheesecake");

		// Cookies
		forItem(ExtraDelightItems.PUMPKIN_COOKIE, "pumpkin_cookie");
		forItem(ExtraDelightItems.SUGAR_COOKIE, "sugar_cookie");
		forItem(ExtraDelightItems.GLOW_BERRY_COOKIE, "glow_berry_cookie");
		forItem(ExtraDelightItems.APPLE_COOKIE, "apple_cookie");

		// Popsicle
		forItem(ExtraDelightItems.GLOW_BERRY_POPSICLE, "glow_berry_popsicle");
		forItem(ExtraDelightItems.SWEET_BERRY_POPSICLE, "sweet_berry_popsicle");
		forItem(ExtraDelightItems.FUDGE_POPSICLE, "fudge_popsicle");
		forItem(ExtraDelightItems.HONEY_POPSICLE, "honey_popsicle");
		forItem(ExtraDelightItems.APPLE_POPSICLE, "apple_popsicle");

		forItem(ExtraDelightItems.WHIPPED_CREAM, "whipped_cream");
//
//		forItem(ExtraDelightItems.PLAIN_CAKE, "plain_cake");

		// Eggs
		forItem(ExtraDelightItems.EGG_MIX, "egg_mix");
		forItem(ExtraDelightItems.SCRAMBLED_EGGS, "scrambled_eggs");
		forItem(ExtraDelightItems.OMELETTE_MIX, "omelette_mix");
		forItem(ExtraDelightItems.OMELETTE, "omelette");
		forItem(ExtraDelightItems.BOILED_EGG, "hard_boiled_egg");
		forItem(ExtraDelightItems.QUICHE, "quiche");
		forItem(ExtraDelightItems.QUICHE_SLICE, "quiche_slice");
		forItem(ExtraDelightItems.EGG_SALAD, "egg_salad");

		// Condiments
		forItem(ExtraDelightItems.KETCHUP, "ketchup");
		forItem(ExtraDelightItems.BBQ_SAUCE, "bbq");
		forItem(ExtraDelightItems.MAYO, "mayo");
		forItem(ExtraDelightItems.VINEGAR, "vinegar");

		// Bread
		forItem(ExtraDelightItems.BREAD_SLICE, "bread_slice");
		forItem(ExtraDelightItems.TOAST, "toast");
		forItem(ExtraDelightItems.JAM_TOAST, "jam_toast");
		forItem(ExtraDelightItems.GLOW_JAM_TOAST, "glow_jam_toast");
		forItem(ExtraDelightItems.GOLDEN_JAM_TOAST, "golden_jam_toast");
		forItem(ExtraDelightItems.EGG_BASKET, "egg_in_the_basket");

		// Jam
		forItem(ExtraDelightItems.APPLE_JAM, "apple_jam");
		forItem(ExtraDelightItems.CARROT_JAM, "carrot_jam");
		forItem(ExtraDelightItems.GLOW_BERRY_JAM, "glow_berry_jam");
		forItem(ExtraDelightItems.SWEET_BERRY_JAM, "sweet_berry_jam");
		forItem(ExtraDelightItems.GOLDEN_APPLE_JAM, "golden_apple_jam");

		// Potato
		forItem(ExtraDelightItems.POTATO_CHIPS, "potato_chips");
		forItem(ExtraDelightItems.SLICED_POTATO, "sliced_potato");
		forItem(ExtraDelightItems.GRATED_POTATO, "grated_potato");
		forItem(ExtraDelightItems.HASHBROWNS, "hashbrowns");
		forItem(ExtraDelightItems.POTATO_STICKS, "potato_sticks");
		forItem(ExtraDelightItems.FRENCH_FRIES, "frenchfries");

		// Carrot
		forItem(ExtraDelightItems.GLAZED_CARROT, "glazed_carrot");
		forItem(ExtraDelightItems.ROASTED_CARROT, "roasted_carrot");
		forItem(ExtraDelightItems.CARROT_SALAD, "carrot_salad");
		forItem(ExtraDelightItems.GRATED_CARROT, "shredded_carrot");

		// Apple
		forItem(ExtraDelightItems.APPLE_SAUCE, "apple_sauce");
		forItem(ExtraDelightItems.ROASTED_APPLE, "roasted_apple");
		forItem(ExtraDelightItems.SLICED_APPLE, "apple_slices");

		// Soup
		forItem(ExtraDelightItems.CARROT_SOUP, "carrot_soup");
		forItem(ExtraDelightItems.FISH_SOUP, "fish_soup");
		forItem(ExtraDelightItems.POTATO_SOUP, "potato_soup");
		forItem(ExtraDelightItems.TOMATO_SOUP, "tomato_soup");

		// Sandwiches
//		forItem(ExtraDelightItems.DYNAMIC_SANDWICH, "sandwich");
		forItem(ExtraDelightItems.EGG_SALAD_SANDWICH, "egg_salad_sandwich");

		// Feasts
		forBlockItem(ExtraDelightItems.SALISBURY_STEAK_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/salisbury_steak_block_stage0"));
		forItem(ExtraDelightItems.SALISBURY_STEAK, "salisbury_steak");

		forBlockItem(ExtraDelightItems.MASHED_POTATO_GRAVY_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/mashed_potato_gravy_block_stage0"));
		forItem(ExtraDelightItems.MASHED_POTATO_GRAVY, "mashed_potato_gravy");

		forItem(ExtraDelightItems.JERKY, "beef_jerky");

		forItem(ExtraDelightItems.LAMB_STEW, "lamb_stew");
		forItem(ExtraDelightItems.PORK_STEW, "pork_stew");

		forItem(ExtraDelightItems.LAMB_STEW_RICE, "lamb_stew_rice");
		forItem(ExtraDelightItems.PORK_STEW_RICE, "pork_stew_rice");
		forItem(ExtraDelightItems.RABBIT_STEW_RICE, "rabbit_stew_rice");
		forItem(ExtraDelightItems.CHICKEN_STEW_RICE, "chicken_stew_rice");
		forItem(ExtraDelightItems.BEEF_STEW_RICE, "beef_stew_rice");
		forItem(ExtraDelightItems.FISH_STEW_RICE, "fish_stew_rice");
		forItem(ExtraDelightItems.CURRY_RICE, "curry_rice");

		forItem(ExtraDelightItems.SAUSAGE_ROLL, "sausage_roll");
		forItem(ExtraDelightItems.SOS, "sos");
		forItem(ExtraDelightItems.LIVER_ONIONS, "liver_onions");
		forItem(ExtraDelightItems.FRENCH_FRIES, "frenchfries");
		forItem(ExtraDelightItems.FRIED_FISH, "friedfish");
		forItem(ExtraDelightItems.CHICKEN_FRIED_STEAK, "chickenfriedsteak");
		forItem(ExtraDelightItems.PORK_TENDERLOIN, "pork_tenderloin");
		forItem(ExtraDelightItems.PORK_TENDERLOIN_SANDWICH, "pork_tenderloin_sandwich");
		forItem(ExtraDelightItems.FRIED_CHICKEN, "friedchicken");
		forItem(ExtraDelightItems.STUFFED_HEART, "stuffedheart");
		forItem(ExtraDelightItems.FRIED_BRAINS, "friedbrains");
		forItem(ExtraDelightItems.OXTAIL_SOUP, "oxtail_soup");

		forItem(ExtraDelightItems.CHEESE_SANDWICH, "cheese_sandwich");
		forItem(ExtraDelightItems.GRILLED_CHEESE, "grilled_cheese");

		forItem(ExtraDelightItems.CHEESE, "cheese");
		forItem(ExtraDelightItems.BUTTER, "butter");

		forBlockItem(ExtraDelightItems.CHEESE_BLOCK_ITEM, "cheese_block");
		forBlockItem(ExtraDelightItems.BUTTER_BLOCK_ITEM, "butter_block");

		forBlockItem(ExtraDelightItems.HASH_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/hash_block_stage0"));
		forItem(ExtraDelightItems.HASH, "hash");

		forBlockItem(ExtraDelightItems.POT_ROAST_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/potroast_block_stage0"));
		forItem(ExtraDelightItems.POT_ROAST, "pot_roast");

		forBlockItem(ExtraDelightItems.BBQ_RIBS_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/bbq_ribs_block_stage0"));
		forItem(ExtraDelightItems.BBQ_RIBS, "bbq_ribs");

		forBlockItem(ExtraDelightItems.MEAT_PIE_BLOCK_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/meat_pie"));
		forItem(ExtraDelightItems.MEAT_PIE_SLICE, "meat_pie_slice");

		forBlockItem(ExtraDelightItems.PULLED_PORK_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/pulled_pork_block_stage0"));
		forItem(ExtraDelightItems.PULLED_PORK_SANDWICH, "pulled_pork_sandwich");

		forBlockItem(ExtraDelightItems.RACK_LAMB_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/rack_lamb_block_stage0"));
		forItem(ExtraDelightItems.RACK_LAMB, "rack_lamb");

		forBlockItem(ExtraDelightItems.BEEF_WELLINGTON_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/beef_wellington_block_stage0"));
		forItem(ExtraDelightItems.BEEF_WELLINGTON, "beef_wellington");

		forBlockItem(ExtraDelightItems.HAGGIS_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/haggis_block_stage0"));
		forItem(ExtraDelightItems.HAGGIS, "haggis");

		forBlockItem(ExtraDelightItems.STIRFRY_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/stirfry_block_stage0"));
		forItem(ExtraDelightItems.STIRFRY, "stirfry");

		forBlockItem(ExtraDelightItems.MEAT_LOAF_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/meatloaf_block_stage0"));

		getBuilder(ExtraDelightItems.BEEF_STEW_FEAST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")))
				.texture("1", modLoc("block/beef_stew"));
		getBuilder(ExtraDelightItems.CHICKEN_STEW_FEAST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")))
				.texture("1", modLoc("block/chicken_stew"));
		getBuilder(ExtraDelightItems.FISH_STEW_FEAST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")))
				.texture("1", modLoc("block/fish_stew"));
		getBuilder(ExtraDelightItems.LAMB_STEW_FEAST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")))
				.texture("1", modLoc("block/lamb_stew"));
		getBuilder(ExtraDelightItems.PORK_STEW_FEAST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")))
				.texture("1", modLoc("block/pork_stew"));
		getBuilder(ExtraDelightItems.RABBIT_STEW_FEAST.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(
						new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")))
				.texture("1", modLoc("block/rabbit_stew"));
		getBuilder(ExtraDelightItems.CURRY_FEAST.getId().getPath()).parent(new ModelFile.UncheckedModelFile(
				new ResourceLocation(ExtraDelight.MOD_ID, "block/curry_block_stage0")));

		this.jellyBlock(ExtraDelightItems.JELLY_WHITE_FEAST_ITEM, "white");
		this.jellyBlock(ExtraDelightItems.JELLY_ORANGE_FEAST_ITEM, "orange");
		this.jellyBlock(ExtraDelightItems.JELLY_MAGENTA_FEAST_ITEM, "magenta");
		this.jellyBlock(ExtraDelightItems.JELLY_LIGHT_BLUE_FEAST_ITEM, "light_blue");
		this.jellyBlock(ExtraDelightItems.JELLY_YELLOW_FEAST_ITEM, "yellow");
		this.jellyBlock(ExtraDelightItems.JELLY_LIME_FEAST_ITEM, "lime");
		this.jellyBlock(ExtraDelightItems.JELLY_PINK_FEAST_ITEM, "pink");
		this.jellyBlock(ExtraDelightItems.JELLY_GREY_FEAST_ITEM, "grey");
		this.jellyBlock(ExtraDelightItems.JELLY_LIGHT_GREY_FEAST_ITEM, "light_grey");
		this.jellyBlock(ExtraDelightItems.JELLY_CYAN_FEAST_ITEM, "cyan");
		this.jellyBlock(ExtraDelightItems.JELLY_PURPLE_FEAST_ITEM, "purple");
		this.jellyBlock(ExtraDelightItems.JELLY_BLUE_FEAST_ITEM, "blue");
		this.jellyBlock(ExtraDelightItems.JELLY_BROWN_FEAST_ITEM, "brown");
		this.jellyBlock(ExtraDelightItems.JELLY_GREEN_FEAST_ITEM, "green");
		this.jellyBlock(ExtraDelightItems.JELLY_RED_FEAST_ITEM, "red");
		this.jellyBlock(ExtraDelightItems.JELLY_BLACK_FEAST_ITEM, "black");

		forItem(ExtraDelightItems.JELLY_WHITE, "jelly_white");
		forItem(ExtraDelightItems.JELLY_ORANGE, "jelly_orange");
		forItem(ExtraDelightItems.JELLY_MAGENTA, "jelly_magenta");
		forItem(ExtraDelightItems.JELLY_LIGHT_BLUE, "jelly_light_blue");
		forItem(ExtraDelightItems.JELLY_YELLOW, "jelly_yellow");
		forItem(ExtraDelightItems.JELLY_LIME, "jelly_lime");
		forItem(ExtraDelightItems.JELLY_PINK, "jelly_pink");
		forItem(ExtraDelightItems.JELLY_GREY, "jelly_grey");
		forItem(ExtraDelightItems.JELLY_LIGHT_GREY, "jelly_light_grey");
		forItem(ExtraDelightItems.JELLY_CYAN, "jelly_cyan");
		forItem(ExtraDelightItems.JELLY_PURPLE, "jelly_purple");
		forItem(ExtraDelightItems.JELLY_BLUE, "jelly_blue");
		forItem(ExtraDelightItems.JELLY_BROWN, "jelly_brown");
		forItem(ExtraDelightItems.JELLY_GREEN, "jelly_green");
		forItem(ExtraDelightItems.JELLY_RED, "jelly_red");
		forItem(ExtraDelightItems.JELLY_BLACK, "jelly_black");

		forItem(ExtraDelightItems.MACARONI, "macaroni");
		forItem(ExtraDelightItems.LASAGNA_NOODLES, "lasagna_noodles");

		forItem(ExtraDelightItems.SEAWEED_CRISPS, "seaweed_crisps");
		forItem(ExtraDelightItems.SEAWEED_SALAD, "seaweed_salad");
		forItem(ExtraDelightItems.FURIKAKE, "furikake");
		forItem(ExtraDelightItems.FURIKAKE_RICE, "furikake_rice");
		forItem(ExtraDelightItems.FISH_FLAKES, "fish_flakes");
		forItem(ExtraDelightItems.CURRY_POWDER, "curry_powder");
		forItem(ExtraDelightItems.FISH_CAKES, "fish_cakes");
		forItem(ExtraDelightItems.FISH_AND_CHIPS, "fish_chips");
		forItem(ExtraDelightItems.FRIED_MUSHROOMS, "fried_mushrooms");
		forItem(ExtraDelightItems.MUSHROOM_RISOTTO, "mushroom_risotto");
		forItem(ExtraDelightItems.STUFFED_MUSHROOMS, "stuffed_mushrooms");
		forItem(ExtraDelightItems.MUSHROOM_BURGER, "mushroom_burger");

		forItem(ExtraDelightItems.COOKED_PASTA, "cooked_pasta");
		forItem(ExtraDelightItems.BUTTERED_PASTA, "buttered_pasta");

		forItem(ExtraDelightItems.CURRY, "curry");
		forItem(ExtraDelightItems.CHICKEN_STEW, "chicken_stew");

		forItem(ExtraDelightItems.MEAT_LOAF, "meatloaf");
		forItem(ExtraDelightItems.MEAT_LOAF_SANDWICH, "meatloaf_sandwich");

		forBlockItem(ExtraDelightItems.MACARONI_CHEESE_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/macaroni_cheese_block_stage0"));
		forItem(ExtraDelightItems.MACARONI_CHEESE, "macaroni_cheese");

		forBlockItem(ExtraDelightItems.HOTDISH_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/hotdish_block_stage0"));
		forItem(ExtraDelightItems.HOTDISH, "hotdish");

		forBlockItem(ExtraDelightItems.LASAGNA_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/lasagna_block_stage0"));
		forItem(ExtraDelightItems.LASAGNA, "lasagna");

		forItem(ExtraDelightItems.BREAD_CRUMBS, "breadcrumbs");
		forItem(ExtraDelightItems.BREADING_MISANPLAS, "breading_misanplas");

		forItem(ExtraDelightItems.BACON_EGG_SANDWICH, "bacon_egg_sandwich");
		forItem(ExtraDelightItems.BACON_EGG_CHEESE_SANDWICH, "bacon_egg_cheese_sandwich");
		forItem(ExtraDelightItems.BUTTERED_TOAST, "buttered_toast");
		forItem(ExtraDelightItems.CROUTONS, "croutons");

		forItem(ExtraDelightItems.SALAD, "chef_salad");
		forBlockItem(ExtraDelightItems.SALAD_FEAST_ITEM,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/salad_block_stage0"));

		forItem(ExtraDelightItems.ALFREDO_SAUCE, "alfredo_sauce");
		forItem(ExtraDelightItems.CHICKEN_ALFREDO, "chicken_alfredo");
		forItem(ExtraDelightItems.PASTA_ALFREDO, "pasta_alfredo_sauce");
		forItem(ExtraDelightItems.PASTA_TOMATO, "pasta_tomato_sauce");
		forItem(ExtraDelightItems.CHICKEN_PARM, "chicken_parm");
		forItem(ExtraDelightItems.CHEESEBURGER, "cheeseburger");
		forItem(ExtraDelightItems.BACON_CHEESEBURGER, "bacon_cheeseburger");

		forItem(ExtraDelightItems.RICEBALL, "riceball");
		forItem(ExtraDelightItems.RICEBALL_FILLED, "riceball_filled");

		forItem(ExtraDelightItems.FISH_SALAD, "fish_salad");
		forItem(ExtraDelightItems.FISH_SALAD_SANDWICH, "fish_salad_sandwich");

		forItem(ExtraDelightItems.SLICED_TOMATO, "sliced_tomato");
		forItem(ExtraDelightItems.SLICED_ONION, "sliced_onion");

		forItem(ExtraDelightItems.COOKED_PASTA, "cooked_pasta");
		forItem(ExtraDelightItems.BUTTERED_PASTA, "buttered_pasta");

		forItem(ExtraDelightItems.BAD_FOOD, "badfood");

		forItem(ExtraDelightItems.CACTUS, "cactus_paddle");
		forItem(ExtraDelightItems.COOKED_CACTUS, "cactus_paddle_cooked");
		forItem(ExtraDelightItems.CACTUS_SALAD, "cactus_salad");
		forItem(ExtraDelightItems.CACTUS_SOUP, "cactus_soup");
		forItem(ExtraDelightItems.CACTUS_EGGS, "cactus_eggs");
		forItem(ExtraDelightItems.CACTUS_JUICE, "cactus_juice");
		forItem(ExtraDelightItems.STUFFED_CACTUS, "stuffed_cactus");

		forItem(ExtraDelightItems.CORN_SEEDS, "crops/corn_seeds");
		forItem(ExtraDelightItems.CORN_COB, "crops/corn_cob");
		forItem(ExtraDelightItems.CORN_HUSK, "crops/corn_husk");
		forItem(ExtraDelightItems.CORN_ON_COB, "crops/corn_on_cob");
		forItem(ExtraDelightItems.CORN_SILK, "crops/corn_silk");
		forItem(ExtraDelightItems.DRIED_CORN_HUSK, "crops/dried_corn_husk");
		forItem(ExtraDelightItems.UNSHUCKED_CORN, "crops/unshucked_corn");
		forItem(ExtraDelightItems.CORN_MEAL, "cornmeal");

		forItem(ExtraDelightItems.CORN_CHOWDER, "corn_chowder");
		forItem(ExtraDelightItems.CREAM_CORN, "creamed_corn");
		forItem(ExtraDelightItems.CORN_FRITTERS, "corn_fritters");
		forItem(ExtraDelightItems.POPCORN, "popcorn");
		forItem(ExtraDelightItems.GRILLED_CORN_ON_COB, "grilled_corn_on_cob");
		forItem(ExtraDelightItems.COOKED_CORN, "cooked_corn");
		forItem(ExtraDelightItems.ROASTED_PUMPKIN_SEEDS, "roasted_pumpkin_seeds");
		forItem(ExtraDelightItems.CORN_SILK_TEA, "corn_silk_tea");
		forItem(ExtraDelightItems.STEWED_APPLES, "stewed_apples");
		forItem(ExtraDelightItems.APPLE_FRITTERS, "apple_fritters");
		forItem(ExtraDelightItems.CARAMEL_SAUCE, "caramel_sauce");
		forItem(ExtraDelightItems.CARAMEL_CANDY, "caramel_candy");
		forItem(ExtraDelightItems.CANDY_APPLE, "candy_apple");
		forItem(ExtraDelightItems.CARAMEL_APPLE, "caramel_apple");
		forItem(ExtraDelightItems.CANDY_GOLDEN_APPLE, "candy_golden_apple");
		forItem(ExtraDelightItems.CARAMEL_GOLDEN_APPLE, "caramel_golden_apple");
		forItem(ExtraDelightItems.CARAMEL_POPCORN, "caramel_corn");
		forItem(ExtraDelightItems.CARAMEL_CHEESECAKE_ITEM, "caramel_cheesecake");
		forItem(ExtraDelightItems.CARAMEL_CHEESECAKE_SLICE, "caramel_cheesecake_slice");
		forItem(ExtraDelightItems.CARAMEL_CUSTARD, "caramel_custard");
		forItem(ExtraDelightItems.CARAMEL_POPSICLE, "caramel_popsicle");
		forItem(ExtraDelightItems.PUMPKIN_PIE_ITEM, "pumpkin_pie");
		forItem(ExtraDelightItems.PUMPKIN_PIE_SLICE, "pumpkin_pie_slice");
//		forItem(ExtraDelightItems.CANDY, "candy");

		forItem(ExtraDelightItems.CORNBREAD, "cornbread");
		forBlockItem(ExtraDelightItems.CORNBREAD_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/cornbread_stage0"));

		forItem(ExtraDelightItems.CORN_PUDDING, "corn_pudding");
		forBlockItem(ExtraDelightItems.CORN_PUDDING_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/corn_pudding_stage0"));

		forItem(ExtraDelightItems.PUMPKIN_ROLL, "pumpkin_roll");
		forBlockItem(ExtraDelightItems.PUMPKIN_ROLL_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/pumpkin_roll_stage0"));

		forItem(ExtraDelightItems.APPLE_CRISP, "apple_crisp");
		forBlockItem(ExtraDelightItems.APPLE_CRISP_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/apple_crisp_stage0"));

		forItem(ExtraDelightItems.STUFFING, "stuffing");
		forBlockItem(ExtraDelightItems.STUFFING_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/stuffing_stage0"));

		forItem(ExtraDelightItems.POTATO_AU_GRATIN, "potato_au_gratin");
		forBlockItem(ExtraDelightItems.POTATO_AU_GRATIN_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/potato_au_gratin_stage0"));

		forBlockItem(ExtraDelightItems.FLOUR_SACK, "flour_sack");
		forBlockItem(ExtraDelightItems.CORNMEAL_SACK, "cornmeal_sack");
		forBlockItem(ExtraDelightItems.SUGAR_SACK, "sugar_sack");
		forBlockItem(ExtraDelightItems.CORN_CRATE, "corn_crate");
		forBlockItem(ExtraDelightItems.CORN_HUSK_BUNDLE, "corn_husk_bundle");
		forBlockItem(ExtraDelightItems.DRIED_CORN_HUSK_BUNDLE, "dried_corn_husk_bundle");
		forBlockItem(ExtraDelightItems.CORN_COB_BUNDLE, "dried_corn_husk_bundle");

		// Holiday
		forBlockItem(ExtraDelightItems.STRIPPED_CINNAMON_LOG, "stripped_cinnamon_log");
		forBlockItem(ExtraDelightItems.CINNAMON_LOG, "cinnamon_log");
		forBlockItem(ExtraDelightItems.CINNAMON_LEAVES, "cinnamon_leaves");
		forBlockItem(ExtraDelightItems.CINNAMON_PLANKS, "cinnamon_planks");
		forBlockItem(ExtraDelightItems.CINNAMON_FENCE,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/cinnamon_fence_inventory"));
		forItem(ExtraDelightItems.CINNAMON_DOOR, "cinnamon_door");
		forBlockItem(ExtraDelightItems.CINNAMON_FENCE_GATE, "cinnamon_fence_gate");
		forBlockItem(ExtraDelightItems.CINNAMON_STAIRS, "cinnamon_stairs");
		forBlockItem(ExtraDelightItems.CINNAMON_TRAPDOOR,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/cinnamon_trapdoor_bottom"));
		forBlockItem(ExtraDelightItems.CINNAMON_CABINET, "cinnamon_cabinet");
		this.slab(ExtraDelightItems.CINNAMON_SLAB.getId().getPath(), modLoc("block/cinnamon_planks"),
				modLoc("block/cinnamon_planks"), modLoc("block/cinnamon_planks"));
		forBlockItemWithParent(ExtraDelightItems.CINNAMON_SAPLING);
		forItem(ExtraDelightItems.CINNAMON_BARK, "cinnamon_bark");
		forItem(ExtraDelightItems.CINNAMON_STICK, "cinnamon_stick");
		forItem(ExtraDelightItems.GROUND_CINNAMON, "ground_cinnamon");
		forItem(ExtraDelightItems.RAW_CINNAMON, "raw_cinnamon");

		forItem(ExtraDelightItems.MILKSHAKE, "milkshake");
		forItem(ExtraDelightItems.APPLE_MILKSHAKE, "apple_milkshake");
		forItem(ExtraDelightItems.CHOCOLATE_MILKSHAKE, "chocolate_milkshake");
		forItem(ExtraDelightItems.GLOW_BERRY_MILKSHAKE, "glow_berry_milkshake");
		forItem(ExtraDelightItems.HONEY_MILKSHAKE, "honey_milkshake");
		forItem(ExtraDelightItems.PUMPKIN_MILKSHAKE, "pumpkin_milkshake");
		forItem(ExtraDelightItems.SWEET_BERRY_MILKSHAKE, "sweet_berry_milkshake");
		forItem(ExtraDelightItems.COOKIE_DOUGH_MILKSHAKE, "cookie_dough_milkshake");
		forItem(ExtraDelightItems.MINT_CHIP_MILKSHAKE, "mint_chip_milkshake");

		forItem(ExtraDelightItems.CHOCOLATE_MILK, "chocolate_milk");

		forItem(ExtraDelightItems.ICE_CREAM, "ice_cream");
		forItem(ExtraDelightItems.APPLE_ICE_CREAM, "apple_ice_cream");
		forItem(ExtraDelightItems.CHOCOLATE_ICE_CREAM, "chocolate_ice_cream");
		forItem(ExtraDelightItems.GLOW_BERRY_ICE_CREAM, "glow_berry_ice_cream");
		forItem(ExtraDelightItems.HONEY_ICE_CREAM, "honey_ice_cream");
		forItem(ExtraDelightItems.PUMPKIN_ICE_CREAM, "pumpkin_ice_cream");
		forItem(ExtraDelightItems.SWEET_BERRY_ICE_CREAM, "sweet_berry_ice_cream");
		forItem(ExtraDelightItems.COOKIE_DOUGH_ICE_CREAM, "cookie_dough_ice_cream");
		forItem(ExtraDelightItems.MINT_CHIP_ICE_CREAM, "mint_chip_ice_cream");

		forItem(ExtraDelightItems.APPLE_COOKIE_DOUGH, "apple_cookie_dough");
		forItem(ExtraDelightItems.CHOCOLATE_CHIP_COOKIE_DOUGH, "chocolate_chip_cookie_dough");
		forItem(ExtraDelightItems.GINGERBREAD_COOKIE_DOUGH, "gingerbread_cookie_dough");
		forItem(ExtraDelightItems.GLOW_BERRY_COOKIE_DOUGH, "glow_berry_cookie_dough");
		forItem(ExtraDelightItems.HONEY_COOKIE_DOUGH, "honey_cookie_dough");
		forItem(ExtraDelightItems.PUMPKIN_COOKIE_DOUGH, "pumpkin_cookie_dough");
		forItem(ExtraDelightItems.SUGAR_COOKIE_DOUGH, "sugar_cookie_dough");
		forItem(ExtraDelightItems.SWEET_BERRY_COOKIE_DOUGH, "sweet_berry_cookie_dough");

		forItem(ExtraDelightItems.GINGERBREAD_ALEX, "gingerbread_alex");
		forItem(ExtraDelightItems.GINGERBREAD_COOKIE, "gingerbread_cookie");
		forItem(ExtraDelightItems.GINGERBREAD_CREEPER, "gingerbread_creeper");
		forItem(ExtraDelightItems.GINGERBREAD_PICKAXE, "gingerbread_pickaxe");
		forItem(ExtraDelightItems.GINGERBREAD_STEVE, "gingerbread_steve");
		forItem(ExtraDelightItems.GINGERBREAD_SWORD, "gingerbread_sword");
		forItem(ExtraDelightItems.GINGERBREAD_VILLAGER, "gingerbread_villager");
		forItem(ExtraDelightItems.GINGERBREAD_DIAMOND, "gingerbread_diamond");
		forItem(ExtraDelightItems.GINGERBREAD_EMERALD, "gingerbread_emerald");

		forItem(ExtraDelightItems.SUGAR_COOKIE_ALEX, "sugar_cookie_alex");
		forItem(ExtraDelightItems.SUGAR_COOKIE_CREEPER, "sugar_cookie_creeper");
		forItem(ExtraDelightItems.SUGAR_COOKIE_PICKAXE, "sugar_cookie_pickaxe");
		forItem(ExtraDelightItems.SUGAR_COOKIE_STEVE, "sugar_cookie_steve");
		forItem(ExtraDelightItems.SUGAR_COOKIE_SWORD, "sugar_cookie_sword");
		forItem(ExtraDelightItems.SUGAR_COOKIE_VILLAGER, "sugar_cookie_villager");
		forItem(ExtraDelightItems.SUGAR_COOKIE_DIAMOND, "sugar_cookie_diamond");
		forItem(ExtraDelightItems.SUGAR_COOKIE_EMERALD, "sugar_cookie_emerald");

		forItem(ExtraDelightItems.RAW_GINGERBREAD_ALEX, "raw_gingerbread_alex");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_CREEPER, "raw_gingerbread_creeper");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_PICKAXE, "raw_gingerbread_pickaxe");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_STEVE, "raw_gingerbread_steve");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_SWORD, "raw_gingerbread_sword");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_VILLAGER, "raw_gingerbread_villager");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_DIAMOND, "raw_gingerbread_diamond");
		forItem(ExtraDelightItems.RAW_GINGERBREAD_EMERALD, "raw_gingerbread_emerald");

		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_ALEX, "raw_sugar_cookie_alex");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_CREEPER, "raw_sugar_cookie_creeper");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_PICKAXE, "raw_sugar_cookie_pickaxe");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_STEVE, "raw_sugar_cookie_steve");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_SWORD, "raw_sugar_cookie_sword");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_VILLAGER, "raw_sugar_cookie_villager");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_DIAMOND, "raw_sugar_cookie_diamond");
		forItem(ExtraDelightItems.RAW_SUGAR_COOKIE_EMERALD, "raw_sugar_cookie_emerald");

		forBlockItem(ExtraDelightItems.APPLE_COOKIE_BLOCK, "apple_cookie_block");
		forBlockItem(ExtraDelightItems.CHOCOLATE_CHIP_COOKIE_BLOCK, "chocolate_chip_cookie_block");
		forBlockItem(ExtraDelightItems.GINGERBREAD_COOKIE_BLOCK, "gingerbread_cookie_block");
		forBlockItem(ExtraDelightItems.GLOW_BERRY_COOKIE_BLOCK, "glow_berry_cookie_block");
		forBlockItem(ExtraDelightItems.HONEY_COOKIE_BLOCK, "honey_cookie_block");
		forBlockItem(ExtraDelightItems.PUMPKIN_COOKIE_BLOCK, "pumpkin_cookie_block");
		forBlockItem(ExtraDelightItems.SUGAR_COOKIE_BLOCK, "sugar_cookie_block");
		forBlockItem(ExtraDelightItems.SWEET_BERRY_COOKIE_BLOCK, "sweet_berry_cookie_block");

		forItem(ExtraDelightItems.GINGER, "ginger");
		forItem(ExtraDelightItems.GINGER_CUTTING, "ginger_cutting");
		forItem(ExtraDelightItems.PEELED_GINGER, "peeled_ginger");
		forItem(ExtraDelightItems.SLICED_GINGER, "sliced_ginger");
		forItem(ExtraDelightItems.GRATED_GINGER, "grated_ginger");
		forItem(ExtraDelightItems.FROSTING_WHITE, "frosting_white");
		forItem(ExtraDelightItems.FROSTING_ORANGE, "frosting_orange");
		forItem(ExtraDelightItems.FROSTING_MAGENTA, "frosting_magenta");
		forItem(ExtraDelightItems.FROSTING_LIGHT_BLUE, "frosting_light_blue");
		forItem(ExtraDelightItems.FROSTING_YELLOW, "frosting_yellow");
		forItem(ExtraDelightItems.FROSTING_LIME, "frosting_lime");
		forItem(ExtraDelightItems.FROSTING_PINK, "frosting_pink");
		forItem(ExtraDelightItems.FROSTING_GRAY, "frosting_gray");
		forItem(ExtraDelightItems.FROSTING_LIGHT_GRAY, "frosting_light_gray");
		forItem(ExtraDelightItems.FROSTING_CYAN, "frosting_cyan");
		forItem(ExtraDelightItems.FROSTING_PURPLE, "frosting_purple");
		forItem(ExtraDelightItems.FROSTING_BLUE, "frosting_blue");
		forItem(ExtraDelightItems.FROSTING_BROWN, "frosting_brown");
		forItem(ExtraDelightItems.FROSTING_GREEN, "frosting_green");
		forItem(ExtraDelightItems.FROSTING_RED, "frosting_red");
		forItem(ExtraDelightItems.FROSTING_BLACK, "frosting_black");

		forItem(ExtraDelightItems.CANDY_WHITE, "candy_white");
		forItem(ExtraDelightItems.CANDY_ORANGE, "candy_orange");
		forItem(ExtraDelightItems.CANDY_MAGENTA, "candy_magenta");
		forItem(ExtraDelightItems.CANDY_LIGHT_BLUE, "candy_light_blue");
		forItem(ExtraDelightItems.CANDY_YELLOW, "candy_yellow");
		forItem(ExtraDelightItems.CANDY_LIME, "candy_lime");
		forItem(ExtraDelightItems.CANDY_PINK, "candy_pink");
		forItem(ExtraDelightItems.CANDY_GRAY, "candy_gray");
		forItem(ExtraDelightItems.CANDY_LIGHT_GRAY, "candy_light_gray");
		forItem(ExtraDelightItems.CANDY_CYAN, "candy_cyan");
		forItem(ExtraDelightItems.CANDY_PURPLE, "candy_purple");
		forItem(ExtraDelightItems.CANDY_BLUE, "candy_blue");
		forItem(ExtraDelightItems.CANDY_BROWN, "candy_brown");
		forItem(ExtraDelightItems.CANDY_GREEN, "candy_green");
		forItem(ExtraDelightItems.CANDY_RED, "candy_red");
		forItem(ExtraDelightItems.CANDY_BLACK, "candy_black");

		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_WHITE,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_white"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_ORANGE,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_orange"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_MAGENTA,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_magenta"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_LIGHT_BLUE,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_light_blue"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_YELLOW,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_yellow"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_LIME,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_lime"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_PINK,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_pink"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_GRAY,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_grey"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_LIGHT_GRAY,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_light_grey"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_CYAN,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_cyan"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_PURPLE,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_purple"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_BLUE,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_blue"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_BROWN,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_brown"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_GREEN,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_green"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_RED,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_red"));
		forBlockItem(ExtraDelightItems.GINGERBREAD_BLOCK_BLACK,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/gingerbread_block_creeper_black"));

		forBlockItem(ExtraDelightItems.CANDY_BOWL_ITEM, "candy_bowl");
		forItem(ExtraDelightItems.MINT, "mint");

		forItem(ExtraDelightItems.MINT_CANDY_GREEN, "mint_candy_green");
		forItem(ExtraDelightItems.MINT_CANDY_RED, "mint_candy_red");
		forItem(ExtraDelightItems.MINT_CANDY_BLUE, "mint_candy_blue");
		forItem(ExtraDelightItems.CANDY_CANE_GREEN, "candy_cane_green");
		forItem(ExtraDelightItems.CANDY_CANE_RED, "candy_cane_red");
		forItem(ExtraDelightItems.CANDY_CANE_BLUE, "candy_cane_blue");
		forBlockItem(ExtraDelightItems.CANDY_CANE_GREEN_BLOCK, "candy_cane_green_block");
		forBlockItem(ExtraDelightItems.CANDY_CANE_RED_BLOCK, "candy_cane_red_block");
		forBlockItem(ExtraDelightItems.CANDY_CANE_BLUE_BLOCK, "candy_cane_blue_block");

		forItem(ExtraDelightItems.GINGER_BEER, "ginger_beer");
		forItem(ExtraDelightItems.GINGER_TEA, "ginger_tea");
		forItem(ExtraDelightItems.HORCHATA, "horchata");
		forItem(ExtraDelightItems.EGGNOG, "eggnog");

		forItem(ExtraDelightItems.FRENCH_TOAST, "french_toast");
		forItem(ExtraDelightItems.CONGEE, "congee");
		forItem(ExtraDelightItems.LUGAW, "lugaw");
		forItem(ExtraDelightItems.RICE_PUDDING, "rice_pudding");
		forItem(ExtraDelightItems.MUFFIN_APPLE, "apple_muffin");
		forItem(ExtraDelightItems.MUFFIN_CINNAMON, "cinnamon_muffin");
		forItem(ExtraDelightItems.MUFFIN_GINGER, "ginger_muffin");
		forItem(ExtraDelightItems.MUFFIN_SWEET_BERRY, "sweet_berry_muffin");
		forItem(ExtraDelightItems.ROLL, "roll");
		forItem(ExtraDelightItems.DRIED_FRUIT, "dried_fruit");
		forItem(ExtraDelightItems.FRUIT_BREAD, "fruit_bread");
		forItem(ExtraDelightItems.PICKLED_GINGER, "pickled_ginger");
		forItem(ExtraDelightItems.CANDIED_GINGER, "ginger_candy");
		forItem(ExtraDelightItems.CINNAMON_POPSICLE, "cinnamon_popsicle");
		forItem(ExtraDelightItems.MINT_TEA, "mint_tea");
		forItem(ExtraDelightItems.BEET_MINT_SALAD, "beet_mint_salad");
		forItem(ExtraDelightItems.MINT_JELLY, "mint_jelly");
		forItem(ExtraDelightItems.CRACKERS, "crackers");
		forItem(ExtraDelightItems.CROQUE_MADAME, "croque_madame");
		forItem(ExtraDelightItems.CROQUE_MONSIEUR, "croque_monsieur");

		forItem(ExtraDelightItems.CINNAMON_ROLL, "cinnamon_roll");
		forItem(ExtraDelightItems.MONKEY_BREAD, "monkey_bread");
		forItem(ExtraDelightItems.COFFEE_CAKE_SLICE, "coffee_cake_slice");
		forItem(ExtraDelightItems.MINT_LAMB, "mint_lamb");
		forItem(ExtraDelightItems.CHARCUTERIE_BOARD, "charcuterie_board");
		forItem(ExtraDelightItems.CHRISTMAS_PUDDING, "christmas_pudding");
		forItem(ExtraDelightItems.MILK_TART_SLICE, "milk_tart_slice");
		forItem(ExtraDelightItems.PUNCH, "punch");

		forBlockItem(ExtraDelightItems.CINNAMON_ROLLS_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/cinnamon_rolls_stage0"));
		forBlockItem(ExtraDelightItems.MONKEY_BREAD_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/monkey_bread_stage0"));
		forItem(ExtraDelightItems.COFFEE_CAKE_FEAST, "coffee_cake");
		forBlockItem(ExtraDelightItems.MINT_LAMB_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/mint_lamb_stage0"));
		forBlockItem(ExtraDelightItems.CHARCUTERIE_BOARD_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/charcuterie_stage0"));
		forBlockItem(ExtraDelightItems.CHRISTMAS_PUDDING_FEAST,
				new ResourceLocation(ExtraDelight.MOD_ID, "block/christmas_pudding_stage0"));
		forItem(ExtraDelightItems.MILK_TART_FEAST, "milk_tart");
		forBlockItem(ExtraDelightItems.PUNCH_FEAST, new ResourceLocation(ExtraDelight.MOD_ID, "block/punch_stage0"));
		forBlockItem(ExtraDelightItems.WILD_GINGER, "wild_ginger");
		
		forBlockItem(ExtraDelightItems.CHEESE_STAIRS_BLOCK_ITEM, "cheese_stairs");
		forBlockItem(ExtraDelightItems.CHEESE_SLAB_BLOCK_ITEM, "cheese_slab");
		forBlockItem(ExtraDelightItems.BUTTER_STAIRS_BLOCK_ITEM, "butter_stairs");
		forBlockItem(ExtraDelightItems.BUTTER_SLAB_BLOCK_ITEM, "butter_slab");
		
		forBlockItem(ExtraDelightItems.BREADCRUMB_SACK, "breadcrumb_sack");
		forBlockItem(ExtraDelightItems.EGG_CRATE, "egg_crate");
		forBlockItem(ExtraDelightItems.RAW_CINNAMON_BLOCK, "raw_cinnamon_block");
		forBlockItem(ExtraDelightItems.CINNAMON_STICK_BLOCK, "cinnamon_stick_block");
		forBlockItem(ExtraDelightItems.GROUND_CINNAMON_BLOCK_ITEM, "ground_cinnamon_block");
		forBlockItem(ExtraDelightItems.GINGER_CRATE, "ginger_crate");
		forBlockItem(ExtraDelightItems.MINT_SACK, "mint_sack");
		forBlockItem(ExtraDelightItems.APPLE_CRATE, "apple_crate");
		forBlockItem(ExtraDelightItems.GOLDEN_APPLE_CRATE, "golden_apple_crate");
		forBlockItem(ExtraDelightItems.RED_MUSHROOM_CRATE, "red_mushroom_crate");
		forBlockItem(ExtraDelightItems.BROWN_MUSHROOM_CRATE, "brown_mushroom_crate");
		forBlockItem(ExtraDelightItems.SWEET_BERRY_CRATE, "sweet_berry_crate");
		forBlockItem(ExtraDelightItems.GLOW_BERRY_CRATE, "glow_berry_crate");
		forBlockItem(ExtraDelightItems.CORN_SILK_SACK, "corn_silk_sack");

		AestheticBlocks.itemModel(this);
	}

	public void forItem(RegistryObject<? extends Item> item, String name) {
		this.singleTexture(item.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + name));
	}

	public void forBlockItem(RegistryObject<? extends BlockItem> item, String name) {
		getBuilder(item.getId().getPath())
				.parent(new ModelFile.UncheckedModelFile(new ResourceLocation(ExtraDelight.MOD_ID,
						"block/" + ForgeRegistries.BLOCKS.getKey(item.get().getBlock()).getPath())));
	}

	public void forBlockItem(RegistryObject<? extends BlockItem> item, ResourceLocation modelLocation) {
		getBuilder(item.getId().getPath()).parent(new ModelFile.UncheckedModelFile(modelLocation));
	}

	public void forBlockItem(RegistryObject<? extends BlockItem> item, ResourceLocation modelLocation, String key,
			ResourceLocation texture) {
		getBuilder(item.getId().getPath()).parent(new ModelFile.UncheckedModelFile(modelLocation)).texture(key,
				texture);
	}

	public void jellyBlock(RegistryObject<? extends BlockItem> item, String color) {
		ModelFile jellyModel = new ModelFile.UncheckedModelFile(modLoc("block/jelly_block_stage0"));

		getBuilder(item.getId().getPath()).parent(jellyModel).texture("1",
				new ResourceLocation(ExtraDelight.MOD_ID, "block/jelly_" + color));
	}

	private void forBlockItemWithParent(RegistryObject<? extends BlockItem> item) {
		singleTexture(item.getId().getPath(), mcLoc("item/generated"), "layer0",
				modLoc("block/" + item.getId().getPath()));
	}

}