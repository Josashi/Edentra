
package net.mcreator.edentra.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.edentra.item.ItemMithrilIngot;
import net.mcreator.edentra.block.BlockMithrilOre;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class RecipeMithrilOreFurnace extends ElementsEdentra.ModElement {
	public RecipeMithrilOreFurnace(ElementsEdentra instance) {
		super(instance, 65);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMithrilOre.block, (int) (1)), new ItemStack(ItemMithrilIngot.block, (int) (1)), 1F);
	}
}
