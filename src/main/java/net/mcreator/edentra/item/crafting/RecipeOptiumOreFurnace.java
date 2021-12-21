
package net.mcreator.edentra.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.edentra.item.ItemOptiumIngot;
import net.mcreator.edentra.block.BlockOptiumOre;
import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class RecipeOptiumOreFurnace extends ElementsEdentra.ModElement {
	public RecipeOptiumOreFurnace(ElementsEdentra instance) {
		super(instance, 66);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockOptiumOre.block, (int) (1)), new ItemStack(ItemOptiumIngot.block, (int) (1)), 1F);
	}
}
