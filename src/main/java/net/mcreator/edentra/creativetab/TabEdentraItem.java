
package net.mcreator.edentra.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.edentra.item.ItemAdamantiumStick;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class TabEdentraItem extends ElementsEdentra.ModElement {
	public TabEdentraItem(ElementsEdentra instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabedentraitem") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAdamantiumStick.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
