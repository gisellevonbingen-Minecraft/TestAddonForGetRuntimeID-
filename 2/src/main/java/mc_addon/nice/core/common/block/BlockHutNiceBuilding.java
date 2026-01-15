package mc_addon.nice.core.common.block;

import org.jetbrains.annotations.NotNull;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.core.blocks.huts.BlockHutAlchemist;

import mc_addon.nice.core.common.init.AddonBuildings;

public class BlockHutNiceBuilding extends AbstractBlockHut<BlockHutAlchemist>
{
	public static final String HUT_NAME = "blockhutnicebuilding";

	@NotNull
	@Override
	public String getHutName()
	{
		return HUT_NAME;
	}

	@Override
	public BuildingEntry getBuildingEntry()
	{
		return AddonBuildings.NICE_BUILDING.get();
	}

}
