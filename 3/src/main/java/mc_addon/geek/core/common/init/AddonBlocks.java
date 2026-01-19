package mc_addon.geek.core.common.init;

import mc_addon.geek.core.common.block.BlockHutGeekBuilding;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class AddonBlocks
{
	public static final BlockHutGeekBuilding BLOCK_HUT_GEEK_BUILDING = new BlockHutGeekBuilding();

	public static void registerBlock(IForgeRegistry<Block> registry)
	{
		BLOCK_HUT_GEEK_BUILDING.registerBlock(registry);
	}

	public static void registerBlockItem(IForgeRegistry<Item> registry)
	{
		BLOCK_HUT_GEEK_BUILDING.registerBlockItem(registry, new Item.Properties());
	}

	private AddonBlocks()
	{

	}

}
