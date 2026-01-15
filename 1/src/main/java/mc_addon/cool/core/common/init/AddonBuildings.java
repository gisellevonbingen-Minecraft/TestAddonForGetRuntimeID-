package mc_addon.cool.core.common.init;

import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.util.constant.Constants;
import com.minecolonies.core.colony.buildings.views.EmptyView;

import mc_addon.cool.core.common.CoolAddon;
import mc_addon.cool.core.common.colony.building.CoolBuilding;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AddonBuildings
{
	public final static DeferredRegister<BuildingEntry> REGISTER = DeferredRegister.create(new ResourceLocation(Constants.MOD_ID, "buildings"), CoolAddon.MOD_ID);

	public static final String COOL_BUILDING_ID = "cool_building";
	public static final RegistryObject<BuildingEntry> COOL_BUILDING = REGISTER.register(COOL_BUILDING_ID, () -> new BuildingEntry.Builder()//
			.setBuildingBlock(AddonBlocks.BLOCK_HUT_COOL_BUILDING)//
			.setBuildingProducer(CoolBuilding::new)//
			.setBuildingViewProducer(() -> EmptyView::new)//
			.setRegistryName(CoolAddon.rl(COOL_BUILDING_ID))//
			.addBuildingModuleProducer(AddonBuildingModules.COOL_MODULE_1)//
			.addBuildingModuleProducer(AddonBuildingModules.COOL_MODULE_2)//
			.addBuildingModuleProducer(AddonBuildingModules.COOL_MODULE_3)//
			.createBuildingEntry());

	private AddonBuildings()
	{

	}

}
