package mc_addon.cool.core.common.init;

import mc_addon.cool.core.common.block.BlockHutCoolBuilding;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class AddonBlocks
{
	public static final BlockHutCoolBuilding BLOCK_HUT_COOL_BUILDING = new BlockHutCoolBuilding();

	public static void registerBlock(IForgeRegistry<Block> registry)
	{
		BLOCK_HUT_COOL_BUILDING.registerBlock(registry);
	}

	public static void registerBlockItem(IForgeRegistry<Item> registry)
	{
		BLOCK_HUT_COOL_BUILDING.registerBlockItem(registry, new Item.Properties());
	}

	private AddonBlocks()
	{

	}

}
