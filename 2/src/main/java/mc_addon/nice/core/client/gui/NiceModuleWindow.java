package mc_addon.nice.core.client.gui;

import com.minecolonies.core.client.gui.AbstractModuleWindow;

import mc_addon.nice.core.common.NiceAddon;
import mc_addon.nice.core.common.colony.module.NiceModule;

public class NiceModuleWindow extends AbstractModuleWindow<NiceModule.View>
{
	public NiceModuleWindow(NiceModule.View moduleView)
	{
		super(null, moduleView, NiceAddon.rl("gui/layouthuts/layoutnicemodule.xml"));
	}

}
