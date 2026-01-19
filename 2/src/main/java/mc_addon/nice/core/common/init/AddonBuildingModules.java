package mc_addon.nice.core.common.init;

import com.minecolonies.api.colony.buildings.registry.BuildingEntry;

import mc_addon.nice.core.common.colony.module.NiceModule;

public class AddonBuildingModules
{
	public static final BuildingEntry.ModuleProducer<NiceModule, NiceModule.View> NICE_MODULE_1 = //
			new BuildingEntry.ModuleProducer<>("nice_module_1", () -> new NiceModule(1), () -> NiceModule.View::new);

	public static final BuildingEntry.ModuleProducer<NiceModule, NiceModule.View> NICE_MODULE_2 = //
			new BuildingEntry.ModuleProducer<>("nice_module_2", () -> new NiceModule(2), () -> NiceModule.View::new);

	public static final BuildingEntry.ModuleProducer<NiceModule, NiceModule.View> NICE_MODULE_3 = //
			new BuildingEntry.ModuleProducer<>("nice_module_3", () -> new NiceModule(3), () -> NiceModule.View::new);
}
