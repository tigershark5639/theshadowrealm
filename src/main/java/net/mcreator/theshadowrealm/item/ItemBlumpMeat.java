
package net.mcreator.theshadowrealm.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.theshadowrealm.ElementsTheShadowRealm;

@ElementsTheShadowRealm.ModElement.Tag
public class ItemBlumpMeat extends ElementsTheShadowRealm.ModElement {
	@GameRegistry.ObjectHolder("theshadowrealm:blumpmeat")
	public static final Item block = null;
	public ItemBlumpMeat(ElementsTheShadowRealm instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("theshadowrealm:blumpmeat", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 2f, false);
			setUnlocalizedName("blumpmeat");
			setRegistryName("blumpmeat");
			setCreativeTab(CreativeTabs.FOOD);
			setMaxStackSize(1);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
