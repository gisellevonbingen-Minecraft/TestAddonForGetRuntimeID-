package mc_addon.geek.core.common.colony.building;

import com.minecolonies.api.colony.IColony;
import com.minecolonies.core.colony.buildings.AbstractBuilding;

import net.minecraft.core.BlockPos;

public class GeekBuilding extends AbstractBuilding
{
	public static final String SCHEMATIC_NAME = "geek_building";

	public GeekBuilding(IColony colony, BlockPos pos)
	{
		super(colony, pos);
	}

	@Override
	public String getSchematicName()
	{
		return SCHEMATIC_NAME;
	}

}
