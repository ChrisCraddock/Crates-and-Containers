
package net.mcreator.blocktesting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.blocktesting.block.IceCrate132x32Block;
import net.mcreator.blocktesting.BlocktestingModElements;

@BlocktestingModElements.ModElement.Tag
public class SnowyCratesItemGroup extends BlocktestingModElements.ModElement {
	public SnowyCratesItemGroup(BlocktestingModElements instance) {
		super(instance, 138);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsnowy_crates") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IceCrate132x32Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
