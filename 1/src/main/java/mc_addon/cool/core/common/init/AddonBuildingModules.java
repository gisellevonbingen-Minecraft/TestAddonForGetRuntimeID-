package mc_addon.cool.core.common.init;

import com.minecolonies.api.colony.buildings.registry.BuildingEntry;

import mc_addon.cool.core.common.colony.module.CoolModule;

public class AddonBuildingModules
{
	public static final BuildingEntry.ModuleProducer<CoolModule, CoolModule.View> COOL_MODULE_1 = //
			new BuildingEntry.ModuleProducer<>("cool_module_1", () -> new CoolModule(1), () -> CoolModule.View::new);

	public static final BuildingEntry.ModuleProducer<CoolModule, CoolModule.View> COOL_MODULE_2 = //
			new BuildingEntry.ModuleProducer<>("cool_module_2", () -> new CoolModule(2), () -> CoolModule.View::new);

	public static final BuildingEntry.ModuleProducer<CoolModule, CoolModule.View> COOL_MODULE_3 = //
			new BuildingEntry.ModuleProducer<>("cool_module_3", () -> new CoolModule(3), () -> CoolModule.View::new);
}
