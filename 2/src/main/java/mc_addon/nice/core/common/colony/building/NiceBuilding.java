package mc_addon.nice.core.common.colony.building;

import com.minecolonies.api.colony.IColony;
import com.minecolonies.core.colony.buildings.AbstractBuilding;

import net.minecraft.core.BlockPos;

public class NiceBuilding extends AbstractBuilding
{
	public static final String SCHEMATIC_NAME = "nice_building";

	public NiceBuilding(IColony colony, BlockPos pos)
	{
		super(colony, pos);
	}

	@Override
	public String getSchematicName()
	{
		return SCHEMATIC_NAME;
	}

}
