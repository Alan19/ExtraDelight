package com.lance5057.extradelight;

import java.util.Map;

import com.lance5057.extradelight.aesthetics.block.cornhuskdoll.CornHuskDollRenderer;
import com.lance5057.extradelight.displays.food.FoodDisplayRenderer;
import com.lance5057.extradelight.displays.knife.KnifeBlockRenderer;
import com.lance5057.extradelight.displays.spice.SpiceRackRenderer;
import com.lance5057.extradelight.workstations.dryingrack.DryingRackRenderer;
import com.lance5057.extradelight.workstations.mixingbowl.MixingBowlRenderer;
import com.lance5057.extradelight.workstations.mortar.MortarRenderer;
import com.lance5057.extradelight.workstations.oven.recipetab.OvenRecipeCatagories;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent.RegisterAdditional;
import net.minecraftforge.client.event.RegisterRecipeBookCategoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtraDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExtraDelightClientEvents {

	@SubscribeEvent
	public static void onRegisterRecipeBookCategories(RegisterRecipeBookCategoriesEvent event) {
		OvenRecipeCatagories.init(event);
	}

	public static void setTERenderers() {
		BlockEntityRenderers.register(ExtraDelightBlockEntities.FOOD_DISPLAY.get(), FoodDisplayRenderer::new);
		BlockEntityRenderers.register(ExtraDelightBlockEntities.KNIFE_BLOCK.get(), KnifeBlockRenderer::new);
		BlockEntityRenderers.register(ExtraDelightBlockEntities.SPICE_RACK.get(), SpiceRackRenderer::new);
		BlockEntityRenderers.register(ExtraDelightBlockEntities.MORTAR.get(), MortarRenderer::new);
		BlockEntityRenderers.register(ExtraDelightBlockEntities.MIXING_BOWL.get(), MixingBowlRenderer::new); 
		BlockEntityRenderers.register(ExtraDelightBlockEntities.DRYING_RACK.get(), DryingRackRenderer::new);
		BlockEntityRenderers.register(ExtraDelightBlockEntities.CORN_HUSK_DOLL.get(), CornHuskDollRenderer::new);
	}

	@SubscribeEvent
	public static void RegisterExtraModels(RegisterAdditional event) {
		Map<ResourceLocation, Resource> rrs = Minecraft.getInstance().getResourceManager().listResources("models/extra",
				(p_215600_) -> {
					return p_215600_.getPath().endsWith(".json");
				});

		rrs.forEach((rl, r) -> {
			String s = rl.toString();

			s = s.substring(s.indexOf('/') + 1, s.indexOf('.'));

			ExtraDelight.logger.debug(s);

			ResourceLocation rl2 = new ResourceLocation(rl.getNamespace(), s);

			event.register(rl2);
		});
	}
}
