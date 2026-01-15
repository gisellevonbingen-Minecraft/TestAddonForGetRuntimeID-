package mc_addon.cool.core.common.colony.building;

import com.minecolonies.api.colony.IColony;
import com.minecolonies.core.colony.buildings.AbstractBuilding;

import net.minecraft.core.BlockPos;

public class CoolBuilding extends AbstractBuilding
{
	public static final String SCHEMATIC_NAME = "cool_building";

	public CoolBuilding(IColony colony, BlockPos pos)
	{
		super(colony, pos);
	}

	@Override
	public String getSchematicName()
	{
		return SCHEMATIC_NAME;
	}

}
