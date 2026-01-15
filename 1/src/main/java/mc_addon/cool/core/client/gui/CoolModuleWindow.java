package mc_addon.cool.core.client.gui;

import com.minecolonies.core.client.gui.AbstractModuleWindow;

import mc_addon.cool.core.common.CoolAddon;
import mc_addon.cool.core.common.colony.module.CoolModule;

public class CoolModuleWindow extends AbstractModuleWindow<CoolModule.View>
{
	public CoolModuleWindow(CoolModule.View moduleView)
	{
		super(null, moduleView, CoolAddon.rl("gui/layouthuts/layoutcoolmodule.xml"));
	}

}
