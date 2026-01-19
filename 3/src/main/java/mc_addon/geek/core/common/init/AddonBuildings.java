package mc_addon.geek.core.common.init;

import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.api.util.constant.Constants;
import com.minecolonies.core.colony.buildings.views.EmptyView;

import mc_addon.geek.core.common.GeekAddon;
import mc_addon.geek.core.common.colony.building.GeekBuilding;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AddonBuildings
{
	public final static DeferredRegister<BuildingEntry> REGISTER = DeferredRegister.create(new ResourceLocation(Constants.MOD_ID, "buildings"), GeekAddon.MOD_ID);

	public static final String GEEK_BUILDING_ID = "geek_building";
	public static final RegistryObject<BuildingEntry> GEEK_BUILDING = REGISTER.register(GEEK_BUILDING_ID, () -> new BuildingEntry.Builder()//
			.setBuildingBlock(AddonBlocks.BLOCK_HUT_GEEK_BUILDING)//
			.setBuildingProducer(GeekBuilding::new)//
			.setBuildingViewProducer(() -> EmptyView::new)//
			.setRegistryName(GeekAddon.rl(GEEK_BUILDING_ID))//
			.addBuildingModuleProducer(AddonBuildingModules.GEEK_MODULE_1)//
			.addBuildingModuleProducer(AddonBuildingModules.GEEK_MODULE_2)//
			.addBuildingModuleProducer(AddonBuildingModules.GEEK_MODULE_3)//
			.createBuildingEntry());

	private AddonBuildings()
	{

	}

}
