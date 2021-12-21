
package net.mcreator.edentra.gui;

import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;

import net.mcreator.edentra.ElementsEdentra;
import net.mcreator.edentra.Edentra;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import java.io.IOException;

@ElementsEdentra.ModElement.Tag
public class GuiDiamondChest extends ElementsEdentra.ModElement {
	public static int GUIID = 11;
	public static HashMap guistate = new HashMap();
	public GuiDiamondChest(ElementsEdentra instance) {
		super(instance, 128);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		elements.addNetworkMessage(GUIButtonPressedMessageHandler.class, GUIButtonPressedMessage.class, Side.SERVER);
		elements.addNetworkMessage(GUISlotChangedMessageHandler.class, GUISlotChangedMessage.class, Side.SERVER);
	}
	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		private IInventory internal;
		private World world;
		private EntityPlayer entity;
		private int x, y, z;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		public GuiContainerMod(World world, int x, int y, int z, EntityPlayer player) {
			this.world = world;
			this.entity = player;
			this.x = x;
			this.y = y;
			this.z = z;
			this.internal = new InventoryBasic("", true, 117);
			TileEntity ent = world.getTileEntity(new BlockPos(x, y, z));
			if (ent instanceof IInventory)
				this.internal = (IInventory) ent;
			this.customSlots.put(13, this.addSlotToContainer(new Slot(internal, 13, 5, 13) {
			}));
			this.customSlots.put(14, this.addSlotToContainer(new Slot(internal, 14, 23, 13) {
			}));
			this.customSlots.put(15, this.addSlotToContainer(new Slot(internal, 15, 41, 13) {
			}));
			this.customSlots.put(16, this.addSlotToContainer(new Slot(internal, 16, 59, 13) {
			}));
			this.customSlots.put(17, this.addSlotToContainer(new Slot(internal, 17, 77, 13) {
			}));
			this.customSlots.put(18, this.addSlotToContainer(new Slot(internal, 18, 95, 13) {
			}));
			this.customSlots.put(19, this.addSlotToContainer(new Slot(internal, 19, 113, 13) {
			}));
			this.customSlots.put(20, this.addSlotToContainer(new Slot(internal, 20, 131, 13) {
			}));
			this.customSlots.put(21, this.addSlotToContainer(new Slot(internal, 21, 149, 13) {
			}));
			this.customSlots.put(22, this.addSlotToContainer(new Slot(internal, 22, 167, 13) {
			}));
			this.customSlots.put(23, this.addSlotToContainer(new Slot(internal, 23, 185, 13) {
			}));
			this.customSlots.put(24, this.addSlotToContainer(new Slot(internal, 24, 203, 13) {
			}));
			this.customSlots.put(25, this.addSlotToContainer(new Slot(internal, 25, 221, 13) {
			}));
			this.customSlots.put(26, this.addSlotToContainer(new Slot(internal, 26, 239, 13) {
			}));
			this.customSlots.put(27, this.addSlotToContainer(new Slot(internal, 27, 257, 13) {
			}));
			this.customSlots.put(28, this.addSlotToContainer(new Slot(internal, 28, 275, 13) {
			}));
			this.customSlots.put(29, this.addSlotToContainer(new Slot(internal, 29, 293, 13) {
			}));
			this.customSlots.put(30, this.addSlotToContainer(new Slot(internal, 30, 311, 13) {
			}));
			this.customSlots.put(40, this.addSlotToContainer(new Slot(internal, 40, 329, 13) {
			}));
			this.customSlots.put(41, this.addSlotToContainer(new Slot(internal, 41, 5, 31) {
			}));
			this.customSlots.put(42, this.addSlotToContainer(new Slot(internal, 42, 23, 31) {
			}));
			this.customSlots.put(43, this.addSlotToContainer(new Slot(internal, 43, 41, 31) {
			}));
			this.customSlots.put(44, this.addSlotToContainer(new Slot(internal, 44, 59, 31) {
			}));
			this.customSlots.put(45, this.addSlotToContainer(new Slot(internal, 45, 77, 31) {
			}));
			this.customSlots.put(46, this.addSlotToContainer(new Slot(internal, 46, 95, 31) {
			}));
			this.customSlots.put(47, this.addSlotToContainer(new Slot(internal, 47, 113, 31) {
			}));
			this.customSlots.put(48, this.addSlotToContainer(new Slot(internal, 48, 131, 31) {
			}));
			this.customSlots.put(49, this.addSlotToContainer(new Slot(internal, 49, 149, 31) {
			}));
			this.customSlots.put(50, this.addSlotToContainer(new Slot(internal, 50, 167, 31) {
			}));
			this.customSlots.put(51, this.addSlotToContainer(new Slot(internal, 51, 185, 31) {
			}));
			this.customSlots.put(52, this.addSlotToContainer(new Slot(internal, 52, 203, 31) {
			}));
			this.customSlots.put(53, this.addSlotToContainer(new Slot(internal, 53, 221, 31) {
			}));
			this.customSlots.put(54, this.addSlotToContainer(new Slot(internal, 54, 239, 31) {
			}));
			this.customSlots.put(55, this.addSlotToContainer(new Slot(internal, 55, 257, 31) {
			}));
			this.customSlots.put(56, this.addSlotToContainer(new Slot(internal, 56, 275, 31) {
			}));
			this.customSlots.put(57, this.addSlotToContainer(new Slot(internal, 57, 293, 31) {
			}));
			this.customSlots.put(58, this.addSlotToContainer(new Slot(internal, 58, 311, 31) {
			}));
			this.customSlots.put(59, this.addSlotToContainer(new Slot(internal, 59, 329, 31) {
			}));
			this.customSlots.put(60, this.addSlotToContainer(new Slot(internal, 60, 5, 49) {
			}));
			this.customSlots.put(61, this.addSlotToContainer(new Slot(internal, 61, 23, 49) {
			}));
			this.customSlots.put(62, this.addSlotToContainer(new Slot(internal, 62, 41, 49) {
			}));
			this.customSlots.put(63, this.addSlotToContainer(new Slot(internal, 63, 59, 49) {
			}));
			this.customSlots.put(64, this.addSlotToContainer(new Slot(internal, 64, 77, 49) {
			}));
			this.customSlots.put(65, this.addSlotToContainer(new Slot(internal, 65, 95, 49) {
			}));
			this.customSlots.put(66, this.addSlotToContainer(new Slot(internal, 66, 113, 49) {
			}));
			this.customSlots.put(67, this.addSlotToContainer(new Slot(internal, 67, 131, 49) {
			}));
			this.customSlots.put(68, this.addSlotToContainer(new Slot(internal, 68, 149, 49) {
			}));
			this.customSlots.put(69, this.addSlotToContainer(new Slot(internal, 69, 167, 49) {
			}));
			this.customSlots.put(70, this.addSlotToContainer(new Slot(internal, 70, 185, 49) {
			}));
			this.customSlots.put(71, this.addSlotToContainer(new Slot(internal, 71, 203, 49) {
			}));
			this.customSlots.put(72, this.addSlotToContainer(new Slot(internal, 72, 221, 49) {
			}));
			this.customSlots.put(73, this.addSlotToContainer(new Slot(internal, 73, 239, 49) {
			}));
			this.customSlots.put(74, this.addSlotToContainer(new Slot(internal, 74, 257, 49) {
			}));
			this.customSlots.put(75, this.addSlotToContainer(new Slot(internal, 75, 275, 49) {
			}));
			this.customSlots.put(76, this.addSlotToContainer(new Slot(internal, 76, 293, 49) {
			}));
			this.customSlots.put(77, this.addSlotToContainer(new Slot(internal, 77, 311, 49) {
			}));
			this.customSlots.put(78, this.addSlotToContainer(new Slot(internal, 78, 329, 49) {
			}));
			this.customSlots.put(79, this.addSlotToContainer(new Slot(internal, 79, 5, 67) {
			}));
			this.customSlots.put(80, this.addSlotToContainer(new Slot(internal, 80, 23, 67) {
			}));
			this.customSlots.put(81, this.addSlotToContainer(new Slot(internal, 81, 41, 67) {
			}));
			this.customSlots.put(82, this.addSlotToContainer(new Slot(internal, 82, 59, 67) {
			}));
			this.customSlots.put(83, this.addSlotToContainer(new Slot(internal, 83, 77, 67) {
			}));
			this.customSlots.put(84, this.addSlotToContainer(new Slot(internal, 84, 95, 67) {
			}));
			this.customSlots.put(85, this.addSlotToContainer(new Slot(internal, 85, 113, 67) {
			}));
			this.customSlots.put(86, this.addSlotToContainer(new Slot(internal, 86, 131, 67) {
			}));
			this.customSlots.put(87, this.addSlotToContainer(new Slot(internal, 87, 149, 67) {
			}));
			this.customSlots.put(88, this.addSlotToContainer(new Slot(internal, 88, 167, 67) {
			}));
			this.customSlots.put(89, this.addSlotToContainer(new Slot(internal, 89, 185, 67) {
			}));
			this.customSlots.put(90, this.addSlotToContainer(new Slot(internal, 90, 203, 67) {
			}));
			this.customSlots.put(91, this.addSlotToContainer(new Slot(internal, 91, 221, 67) {
			}));
			this.customSlots.put(92, this.addSlotToContainer(new Slot(internal, 92, 239, 67) {
			}));
			this.customSlots.put(93, this.addSlotToContainer(new Slot(internal, 93, 257, 67) {
			}));
			this.customSlots.put(94, this.addSlotToContainer(new Slot(internal, 94, 275, 67) {
			}));
			this.customSlots.put(95, this.addSlotToContainer(new Slot(internal, 95, 293, 67) {
			}));
			this.customSlots.put(96, this.addSlotToContainer(new Slot(internal, 96, 311, 67) {
			}));
			this.customSlots.put(97, this.addSlotToContainer(new Slot(internal, 97, 329, 67) {
			}));
			this.customSlots.put(98, this.addSlotToContainer(new Slot(internal, 98, 5, 85) {
			}));
			this.customSlots.put(99, this.addSlotToContainer(new Slot(internal, 99, 23, 85) {
			}));
			this.customSlots.put(100, this.addSlotToContainer(new Slot(internal, 100, 41, 85) {
			}));
			this.customSlots.put(101, this.addSlotToContainer(new Slot(internal, 101, 59, 85) {
			}));
			this.customSlots.put(102, this.addSlotToContainer(new Slot(internal, 102, 77, 85) {
			}));
			this.customSlots.put(103, this.addSlotToContainer(new Slot(internal, 103, 95, 85) {
			}));
			this.customSlots.put(104, this.addSlotToContainer(new Slot(internal, 104, 113, 85) {
			}));
			this.customSlots.put(105, this.addSlotToContainer(new Slot(internal, 105, 131, 85) {
			}));
			this.customSlots.put(106, this.addSlotToContainer(new Slot(internal, 106, 149, 85) {
			}));
			this.customSlots.put(107, this.addSlotToContainer(new Slot(internal, 107, 167, 85) {
			}));
			this.customSlots.put(108, this.addSlotToContainer(new Slot(internal, 108, 185, 85) {
			}));
			this.customSlots.put(109, this.addSlotToContainer(new Slot(internal, 109, 203, 85) {
			}));
			this.customSlots.put(110, this.addSlotToContainer(new Slot(internal, 110, 221, 85) {
			}));
			this.customSlots.put(111, this.addSlotToContainer(new Slot(internal, 111, 239, 85) {
			}));
			this.customSlots.put(112, this.addSlotToContainer(new Slot(internal, 112, 257, 85) {
			}));
			this.customSlots.put(113, this.addSlotToContainer(new Slot(internal, 113, 275, 85) {
			}));
			this.customSlots.put(114, this.addSlotToContainer(new Slot(internal, 114, 293, 85) {
			}));
			this.customSlots.put(115, this.addSlotToContainer(new Slot(internal, 115, 311, 85) {
			}));
			this.customSlots.put(116, this.addSlotToContainer(new Slot(internal, 116, 329, 85) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlotToContainer(new Slot(player.inventory, sj + (si + 1) * 9, 87 + 8 + sj * 18, 37 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlotToContainer(new Slot(player.inventory, si, 87 + 8 + si * 18, 37 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(EntityPlayer player) {
			return internal.isUsableByPlayer(player);
		}

		@Override
		public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 95) {
					if (!this.mergeItemStack(itemstack1, 95, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 95, false)) {
					if (index < 95 + 27) {
						if (!this.mergeItemStack(itemstack1, 95 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 95, 95 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && itemstack.getItem() == stack.getItem()
							&& (!stack.getHasSubtypes() || stack.getMetadata() == itemstack.getMetadata())
							&& ItemStack.areItemStackTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.splitStack(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.splitStack(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(EntityPlayer playerIn) {
			super.onContainerClosed(playerIn);
			if ((internal instanceof InventoryBasic) && (playerIn instanceof EntityPlayerMP)) {
				this.clearContainer(playerIn, playerIn.world, internal);
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote) {
				Edentra.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class GuiWindow extends GuiContainer {
		private World world;
		private int x, y, z;
		private EntityPlayer entity;
		public GuiWindow(World world, int x, int y, int z, EntityPlayer entity) {
			super(new GuiContainerMod(world, x, y, z, entity));
			this.world = world;
			this.x = x;
			this.y = y;
			this.z = z;
			this.entity = entity;
			this.xSize = 350;
			this.ySize = 239;
		}
		private static final ResourceLocation texture = new ResourceLocation("edentra:textures/diamondchest.png");
		@Override
		public void drawScreen(int mouseX, int mouseY, float partialTicks) {
			this.drawDefaultBackground();
			super.drawScreen(mouseX, mouseY, partialTicks);
			this.renderHoveredToolTip(mouseX, mouseY);
		}

		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			this.mc.renderEngine.bindTexture(texture);
			int k = (this.width - this.xSize) / 2;
			int l = (this.height - this.ySize) / 2;
			this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
			zLevel = 100.0F;
		}

		@Override
		public void updateScreen() {
			super.updateScreen();
		}

		@Override
		protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
			super.mouseClicked(mouseX, mouseY, mouseButton);
		}

		@Override
		protected void keyTyped(char typedChar, int keyCode) throws IOException {
			super.keyTyped(typedChar, keyCode);
		}

		@Override
		protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		}

		@Override
		public void onGuiClosed() {
			super.onGuiClosed();
			Keyboard.enableRepeatEvents(false);
		}

		@Override
		public void initGui() {
			super.initGui();
			this.guiLeft = (this.width - 350) / 2;
			this.guiTop = (this.height - 239) / 2;
			Keyboard.enableRepeatEvents(true);
			this.buttonList.clear();
		}

		@Override
		protected void actionPerformed(GuiButton button) {
			Edentra.PACKET_HANDLER.sendToServer(new GUIButtonPressedMessage(button.id, x, y, z));
			handleButtonAction(entity, button.id, x, y, z);
		}

		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
	}

	public static class GUIButtonPressedMessageHandler implements IMessageHandler<GUIButtonPressedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUIButtonPressedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			return null;
		}
	}

	public static class GUISlotChangedMessageHandler implements IMessageHandler<GUISlotChangedMessage, IMessage> {
		@Override
		public IMessage onMessage(GUISlotChangedMessage message, MessageContext context) {
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> {
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			return null;
		}
	}

	public static class GUIButtonPressedMessage implements IMessage {
		int buttonID, x, y, z;
		public GUIButtonPressedMessage() {
		}

		public GUIButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(buttonID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			buttonID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
		}
	}

	public static class GUISlotChangedMessage implements IMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage() {
		}

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			buf.writeInt(slotID);
			buf.writeInt(x);
			buf.writeInt(y);
			buf.writeInt(z);
			buf.writeInt(changeType);
			buf.writeInt(meta);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			slotID = buf.readInt();
			x = buf.readInt();
			y = buf.readInt();
			z = buf.readInt();
			changeType = buf.readInt();
			meta = buf.readInt();
		}
	}
	private static void handleButtonAction(EntityPlayer entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}

	private static void handleSlotAction(EntityPlayer entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
