package mc_addon.geek.core.common.init;

import com.minecolonies.api.colony.buildings.registry.BuildingEntry;

import mc_addon.geek.core.common.colony.module.GeekModule;

public class AddonBuildingModules
{
	public static final BuildingEntry.ModuleProducer<GeekModule, GeekModule.View> GEEK_MODULE_1 = //
			new BuildingEntry.ModuleProducer<>("geek_module_1", () -> new GeekModule(1), () -> GeekModule.View::new);

	public static final BuildingEntry.ModuleProducer<GeekModule, GeekModule.View> GEEK_MODULE_2 = //
			new BuildingEntry.ModuleProducer<>("geek_module_2", () -> new GeekModule(2), () -> GeekModule.View::new);

	public static final BuildingEntry.ModuleProducer<GeekModule, GeekModule.View> GEEK_MODULE_3 = //
			new BuildingEntry.ModuleProducer<>("geek_module_3", () -> new GeekModule(3), () -> GeekModule.View::new);
}
