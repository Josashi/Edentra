
package net.mcreator.edentra.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.edentra.block.BlockAdamantiumOre;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class TabEdentraOre extends ElementsEdentra.ModElement {
	public TabEdentraOre(ElementsEdentra instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabedentraore") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockAdamantiumOre.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
