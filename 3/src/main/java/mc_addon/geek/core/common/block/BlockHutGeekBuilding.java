package mc_addon.geek.core.common.block;

import org.jetbrains.annotations.NotNull;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.core.blocks.huts.BlockHutAlchemist;

import mc_addon.geek.core.common.init.AddonBuildings;

public class BlockHutGeekBuilding extends AbstractBlockHut<BlockHutAlchemist>
{
	public static final String HUT_NAME = "blockhutgeekbuilding";

	@NotNull
	@Override
	public String getHutName()
	{
		return HUT_NAME;
	}

	@Override
	public BuildingEntry getBuildingEntry()
	{
		return AddonBuildings.GEEK_BUILDING.get();
	}

}
