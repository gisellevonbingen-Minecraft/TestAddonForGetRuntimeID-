package mc_addon.geek.core.client.gui;

import com.minecolonies.core.client.gui.AbstractModuleWindow;

import mc_addon.geek.core.common.GeekAddon;
import mc_addon.geek.core.common.colony.module.GeekModule;

public class GeekModuleWindow extends AbstractModuleWindow<GeekModule.View>
{
	public GeekModuleWindow(GeekModule.View moduleView)
	{
		super(null, moduleView, GeekAddon.rl("gui/layouthuts/layoutgeekmodule.xml"));
	}

}
