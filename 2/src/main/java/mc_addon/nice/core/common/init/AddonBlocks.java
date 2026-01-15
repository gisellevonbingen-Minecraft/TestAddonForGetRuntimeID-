package mc_addon.nice.core.common.init;

import mc_addon.nice.core.common.block.BlockHutNiceBuilding;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class AddonBlocks
{
	public static final BlockHutNiceBuilding BLOCK_HUT_NICE_BUILDING = new BlockHutNiceBuilding();

	public static void registerBlock(IForgeRegistry<Block> registry)
	{
		BLOCK_HUT_NICE_BUILDING.registerBlock(registry);
	}

	public static void registerBlockItem(IForgeRegistry<Item> registry)
	{
		BLOCK_HUT_NICE_BUILDING.registerBlockItem(registry, new Item.Properties());
	}

	private AddonBlocks()
	{

	}

}
