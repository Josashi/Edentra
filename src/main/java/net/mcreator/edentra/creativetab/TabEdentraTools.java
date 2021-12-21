
package net.mcreator.edentra.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.edentra.item.ItemAdamantiumPickaxe;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class TabEdentraTools extends ElementsEdentra.ModElement {
	public TabEdentraTools(ElementsEdentra instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabedentratools") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAdamantiumPickaxe.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
