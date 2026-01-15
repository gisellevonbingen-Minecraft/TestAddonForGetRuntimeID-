package mc_addon.cool.core.common.block;

import org.jetbrains.annotations.NotNull;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import com.minecolonies.core.blocks.huts.BlockHutAlchemist;

import mc_addon.cool.core.common.init.AddonBuildings;

public class BlockHutCoolBuilding extends AbstractBlockHut<BlockHutAlchemist>
{
	public static final String HUT_NAME = "blockhutcoolbuilding";

	@NotNull
	@Override
	public String getHutName()
	{
		return HUT_NAME;
	}

	@Override
	public BuildingEntry getBuildingEntry()
	{
		return AddonBuildings.COOL_BUILDING.get();
	}

}
