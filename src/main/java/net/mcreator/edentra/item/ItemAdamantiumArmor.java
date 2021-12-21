
package net.mcreator.edentra.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.edentra.ElementsEdentra;

@ElementsEdentra.ModElement.Tag
public class ItemAdamantiumArmor extends ElementsEdentra.ModElement {
	@GameRegistry.ObjectHolder("edentra:adamantiumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("edentra:adamantiumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("edentra:adamantiumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("edentra:adamantiumarmorboots")
	public static final Item boots = null;
	public ItemAdamantiumArmor(ElementsEdentra instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ADAMANTIUMARMOR", "edentra:adamantium", 20, new int[]{3, 7, 7, 3}, 20,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("adamantiumarmorhelmet")
				.setRegistryName("adamantiumarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("adamantiumarmorbody")
				.setRegistryName("adamantiumarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("adamantiumarmorlegs")
				.setRegistryName("adamantiumarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("adamantiumarmorboots")
				.setRegistryName("adamantiumarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("edentra:adamantiumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("edentra:adamantiumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("edentra:adamantiumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("edentra:adamantiumarmorboots", "inventory"));
	}
}
