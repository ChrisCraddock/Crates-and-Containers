
package net.mcreator.blocktesting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.blocktesting.block.SnowyDarkBlueContainer2Block;
import net.mcreator.blocktesting.BlocktestingModElements;

@BlocktestingModElements.ModElement.Tag
public class SnowContainers32x32ItemGroup extends BlocktestingModElements.ModElement {
	public SnowContainers32x32ItemGroup(BlocktestingModElements instance) {
		super(instance, 137);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsnow_containers_32x_32") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SnowyDarkBlueContainer2Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
