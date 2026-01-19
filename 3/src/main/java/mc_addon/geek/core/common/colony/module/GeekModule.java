package mc_addon.geek.core.common.colony.module;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.ldtteam.blockui.views.BOWindow;
import com.minecolonies.api.colony.buildings.modules.AbstractBuildingModule;
import com.minecolonies.api.colony.buildings.modules.AbstractBuildingModuleView;

import mc_addon.geek.core.client.gui.GeekModuleWindow;
import mc_addon.geek.core.common.GeekAddon;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;

public class GeekModule extends AbstractBuildingModule
{
	private final int j;

	public GeekModule(int j)
	{
		this.j = j;
	}

	@Override
	public void serializeToView(FriendlyByteBuf buf)
	{
		buf.writeInt(this.j);

		GeekAddon.LOGGER.info("GEEK_MODULE.getRuntimeID(): " + this.getProducer().key + "=" + this.getProducer().getRuntimeID());
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
			return new GeekModuleWindow(this);
		}

		@Override
		public @Nullable Component getDesc()
		{
			return Component.literal("GEEK MODULE: " + j);
		}

	}

}
