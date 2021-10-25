
package net.mcreator.blocktesting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.blocktesting.block.WhiteContainer2Block;
import net.mcreator.blocktesting.BlocktestingModElements;

@BlocktestingModElements.ModElement.Tag
public class Containers32x32ItemGroup extends BlocktestingModElements.ModElement {
	public Containers32x32ItemGroup(BlocktestingModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcontainers_32x_32") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WhiteContainer2Block.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
