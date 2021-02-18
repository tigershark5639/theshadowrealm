
package net.mcreator.theshadowrealm.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.theshadowrealm.ElementsTheShadowRealm;

@ElementsTheShadowRealm.ModElement.Tag
public class BlockShadeDirt extends ElementsTheShadowRealm.ModElement {
	@GameRegistry.ObjectHolder("theshadowrealm:shadedirt")
	public static final Block block = null;
	public BlockShadeDirt(ElementsTheShadowRealm instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("shadedirt"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("theshadowrealm:shadedirt", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GROUND);
			setUnlocalizedName("shadedirt");
			setSoundType(SoundType.SAND);
			setHarvestLevel("shovel", 0);
			setHardness(0.5F);
			setResistance(0.6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}
	}
}
