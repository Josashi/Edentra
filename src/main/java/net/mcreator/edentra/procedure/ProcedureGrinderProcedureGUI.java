package net.mcreator.edentra.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.IProperty;

import net.mcreator.edentra.gui.GuiGrinderGUI;
import net.mcreator.edentra.block.BlockGrinderBlock2;
import net.mcreator.edentra.block.BlockGrinderBlock1;
import net.mcreator.edentra.ElementsEdentra;
import net.mcreator.edentra.Edentra;

@ElementsEdentra.ModElement.Tag
public class ProcedureGrinderProcedureGUI extends ElementsEdentra.ModElement {
	public ProcedureGrinderProcedureGUI(ElementsEdentra instance) {
		super(instance, 103);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GrinderProcedureGUI!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure GrinderProcedureGUI!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure GrinderProcedureGUI!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure GrinderProcedureGUI!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure GrinderProcedureGUI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.NORTH)
				&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock()))
				&& (((((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 2)))).getBlock() == BlockGrinderBlock1.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 2)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
						&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 2)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 2))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))))
						&& (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 2)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 2))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 2))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))))
						&& (((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 2))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 1))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 2))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))))))
				&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
						.getDefaultState().getBlock()))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(Edentra.instance, GuiGrinderGUI.GUIID, world, x, y, z);
		}
		if ((((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.SOUTH)
				&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock()))
				&& (((((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 2)))).getBlock() == BlockGrinderBlock1.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 2)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
						&& ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 2)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 2))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 0))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z + 0))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))))
						&& (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 2)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 2))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 2))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))))
						&& (((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 2))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 2))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))))))
				&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
						.getDefaultState().getBlock()))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(Edentra.instance, GuiGrinderGUI.GUIID, world, x, y, z);
		}
		if ((((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.EAST)
				&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock()))
				&& (((((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 1)))).getBlock() == BlockGrinderBlock1.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
						&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z + 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z + 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))))
						&& (((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z + 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z - 0))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 0))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))))
						&& (((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 0), (int) (z - 0))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 0))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 0))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))))))
				&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
						.getDefaultState().getBlock()))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(Edentra.instance, GuiGrinderGUI.GUIID, world, x, y, z);
		}
		if ((((((new Object() {
			public EnumFacing getEnumFacing(BlockPos pos) {
				try {
					IBlockState _bs = world.getBlockState(pos);
					for (IProperty<?> prop : _bs.getProperties().keySet()) {
						if (prop.getName().equals("facing"))
							return _bs.getValue((PropertyDirection) prop);
					}
					return EnumFacing.NORTH;
				} catch (Exception e) {
					return EnumFacing.NORTH;
				}
			}
		}.getEnumFacing(new BlockPos((int) x, (int) y, (int) z))) == EnumFacing.WEST)
				&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) (z - 0)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock()))
				&& (((((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 1)))).getBlock() == BlockGrinderBlock1.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z + 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
						&& ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z + 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 0), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))))
						&& (((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z - 1)))).getBlock() == BlockGrinderBlock1.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) (z + 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 1), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock1.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) (z - 0))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))))
						&& (((((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 0), (int) (z - 0))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
								&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z - 1))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 0), (int) (z + 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())))
								&& ((((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) (z - 0))))
										.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
										&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))
										&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 0))))
												.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock())
												&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))))
														.getBlock() == BlockGrinderBlock2.block.getDefaultState().getBlock()))))))
				&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 0)))).getBlock() == BlockGrinderBlock2.block
						.getDefaultState().getBlock()))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(Edentra.instance, GuiGrinderGUI.GUIID, world, x, y, z);
		}
	}
}
