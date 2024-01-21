package com.lance5057.extradelight.data;

import com.lance5057.extradelight.ExtraDelight;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ExtraDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();

		generator.addProvider(event.includeClient(), new ItemModels(generator, helper));
		generator.addProvider(true, new BlockModels(generator, helper));

		generator.addProvider(true, new AllLootTables(generator));

		EDBlockTags blockTags = new EDBlockTags(generator, ExtraDelight.MOD_ID, event.getExistingFileHelper());
		generator.addProvider(true, blockTags);
		generator.addProvider(true, new EDItemTags(generator, blockTags, ExtraDelight.MOD_ID, helper));

		generator.addProvider(event.includeServer(), new Recipes(generator));
		generator.addProvider(event.includeServer(), new LootModifiers(generator));
		generator.addProvider(event.includeServer(), new Advancements(generator, helper));
		generator.addProvider(event.includeClient(), new EnglishLoc(generator));

		generator.addProvider(event.includeClient(), new PatchouliGen(generator, ExtraDelight.MOD_ID, "en_us"));
	}
}