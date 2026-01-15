package mc_addon.nice.core.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.minecolonies.api.creativetab.ModCreativeTabs;

import mc_addon.nice.core.common.init.AddonBlocks;
import mc_addon.nice.core.common.init.AddonBuildings;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod(NiceAddon.MOD_ID)
public class NiceAddon
{
	public static final String MOD_ID = "mc_addon_nice";
	public static final Logger LOGGER = LogManager.getLogger();

	public NiceAddon()
	{
		var fml_bus = FMLJavaModLoadingContext.get().getModEventBus();
		AddonBuildings.REGISTER.register(fml_bus);
		fml_bus.addListener(this::register);
		fml_bus.addListener(this::onFMLCommonSetup);
		fml_bus.addListener(this::onBuildCreativeModeTabContents);
	}

	public void register(RegisterEvent event)
	{
		var registryKey = event.getRegistryKey();

		if (registryKey.equals(ForgeRegistries.Keys.BLOCKS))
		{
			AddonBlocks.registerBlock(event.getForgeRegistry());
		}
		else if (registryKey.equals(ForgeRegistries.Keys.ITEMS))
		{
			AddonBlocks.registerBlockItem(event.getForgeRegistry());
		}

	}

	private void onFMLCommonSetup(FMLCommonSetupEvent e)
	{
		e.enqueueWork(() ->
		{
		});
	}

	private void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent e)
	{
		if (e.getTab() == ModCreativeTabs.HUTS.get())
		{
			e.accept(AddonBlocks.BLOCK_HUT_NICE_BUILDING);
		}

	}

	public static ResourceLocation rl(String path)
	{
		return new ResourceLocation(MOD_ID, path);
	}

}
