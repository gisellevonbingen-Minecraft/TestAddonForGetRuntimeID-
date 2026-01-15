package mc_addon.cool.core.common.colony.module;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.ldtteam.blockui.views.BOWindow;
import com.minecolonies.api.colony.buildings.modules.AbstractBuildingModule;
import com.minecolonies.api.colony.buildings.modules.AbstractBuildingModuleView;

import mc_addon.cool.core.client.gui.CoolModuleWindow;
import mc_addon.cool.core.common.CoolAddon;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;

public class CoolModule extends AbstractBuildingModule
{
	private final int i;

	public CoolModule(int i)
	{
		this.i = i;
	}

	@Override
	public void serializeToView(FriendlyByteBuf buf)
	{
		buf.writeInt(this.i);

		CoolAddon.LOGGER.info("COOL_MODULE.getRuntimeID(): " + this.getProducer().key + "=" + this.getProducer().getRuntimeID());
	}

	public static class View extends AbstractBuildingModuleView
	{
		private int i;

		@Override
		public void deserialize(@NotNull FriendlyByteBuf buf)
		{
			this.i = buf.readInt();
		}

		@Override
		public BOWindow getWindow()
		{
			return new CoolModuleWindow(this);
		}

		@Override
		public @Nullable Component getDesc()
		{
			return Component.literal("COOL MODULE: " + this.i);
		}

	}

}
