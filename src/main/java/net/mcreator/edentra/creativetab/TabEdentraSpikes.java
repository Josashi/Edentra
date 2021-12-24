
package net.mcreator.edentra.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.edentra.block.BlockTest;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class TabEdentraSpikes extends ElementsEdentra.ModElement {
	public TabEdentraSpikes(ElementsEdentra instance) {
		super(instance, 131);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabedentraspikes") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockTest.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
