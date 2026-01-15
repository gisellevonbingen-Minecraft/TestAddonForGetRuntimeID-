package mc_addon.nice.core.common.init;

import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.util.constant.Constants;
import com.minecolonies.core.colony.buildings.views.EmptyView;

import mc_addon.nice.core.common.NiceAddon;
import mc_addon.nice.core.common.colony.building.NiceBuilding;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AddonBuildings
{
	public final static DeferredRegister<BuildingEntry> REGISTER = DeferredRegister.create(new ResourceLocation(Constants.MOD_ID, "buildings"), NiceAddon.MOD_ID);

	public static final String NICE_BUILDING_ID = "nice_building";
	public static final RegistryObject<BuildingEntry> NICE_BUILDING = REGISTER.register(NICE_BUILDING_ID, () -> new BuildingEntry.Builder()//
			.setBuildingBlock(AddonBlocks.BLOCK_HUT_NICE_BUILDING)//
			.setBuildingProducer(NiceBuilding::new)//
			.setBuildingViewProducer(() -> EmptyView::new)//
			.setRegistryName(NiceAddon.rl(NICE_BUILDING_ID))//
			.addBuildingModuleProducer(AddonBuildingModules.NICE_MODULE_1)//
			.addBuildingModuleProducer(AddonBuildingModules.NICE_MODULE_2)//
			.addBuildingModuleProducer(AddonBuildingModules.NICE_MODULE_3)//
			.createBuildingEntry());

	private AddonBuildings()
	{

	}

}
