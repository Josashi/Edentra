
package net.mcreator.edentra.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.edentra.creativetab.TabEdentraTools;
import net.mcreator.edentra.ElementsEdentra;

import java.util.Set;
import java.util.HashMap;

@ElementsEdentra.ModElement.Tag
public class ItemAdamantiumShovel extends ElementsEdentra.ModElement {
	@GameRegistry.ObjectHolder("edentra:adamantiumshovel")
	public static final Item block = null;
	public ItemAdamantiumShovel(ElementsEdentra instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("ADAMANTIUMSHOVEL", 2, 250, 6f, -2f, 14)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("adamantiumshovel").setRegistryName("adamantiumshovel").setCreativeTab(TabEdentraTools.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("edentra:adamantiumshovel", "inventory"));
	}
}
