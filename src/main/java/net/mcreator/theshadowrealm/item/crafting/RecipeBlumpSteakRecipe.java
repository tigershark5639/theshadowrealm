
package net.mcreator.theshadowrealm.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.theshadowrealm.item.ItemBlumpSteak;
import net.mcreator.theshadowrealm.item.ItemBlumpMeat;
import net.mcreator.theshadowrealm.ElementsTheShadowRealm;

@ElementsTheShadowRealm.ModElement.Tag
public class RecipeBlumpSteakRecipe extends ElementsTheShadowRealm.ModElement {
	public RecipeBlumpSteakRecipe(ElementsTheShadowRealm instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemBlumpMeat.block, (int) (1)), new ItemStack(ItemBlumpSteak.block, (int) (1)), 1F);
	}
}
