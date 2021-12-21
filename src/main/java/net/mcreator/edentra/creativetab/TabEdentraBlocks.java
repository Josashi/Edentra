
package net.mcreator.edentra.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.edentra.block.BlockAdamantiumFurnaceBlock;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class TabEdentraBlocks extends ElementsEdentra.ModElement {
	public TabEdentraBlocks(ElementsEdentra instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabedentrablocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockAdamantiumFurnaceBlock.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
