package mc_addon.nice.core.common.colony.module;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.ldtteam.blockui.views.BOWindow;
import com.minecolonies.api.colony.buildings.modules.AbstractBuildingModule;
import com.minecolonies.api.colony.buildings.modules.AbstractBuildingModuleView;

import mc_addon.nice.core.client.gui.NiceModuleWindow;
import mc_addon.nice.core.common.NiceAddon;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;

public class NiceModule extends AbstractBuildingModule
{
	private final int j;

	public NiceModule(int j)
	{
		this.j = j;
	}

	@Override
	public void serializeToView(FriendlyByteBuf buf)
	{
		buf.writeInt(this.j);

		NiceAddon.LOGGER.info("NICE_MODULE.getRuntimeID(): " + this.getProducer().key + "=" + this.getProducer().getRuntimeID());
	}

	public static class View extends AbstractBuildingModuleView
	{
		private int j;

		@Override
		public void deserialize(@NotNull FriendlyByteBuf buf)
		{
			this.j = buf.readInt();
		}

		@Override
		public BOWindow getWindow()
		{
			return new NiceModuleWindow(this);
		}

		@Override
		public @Nullable Component getDesc()
		{
			return Component.literal("NICE MODULE: " + j);
		}

	}

}
