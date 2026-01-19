package mc_addon.cool.core.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.minecolonies.api.IMinecoloniesAPI;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.creativetab.ModCreativeTabs;

import mc_addon.cool.core.common.init.AddonBlocks;
import mc_addon.cool.core.common.init.AddonBuildingModules;
import mc_addon.cool.core.common.init.AddonBuildings;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

@Mod(CoolAddon.MOD_ID)
public class CoolAddon
{
	public static final String MOD_ID = "mc_addon_a_cool";
	public static final Logger LOGGER = LogManager.getLogger();

	public CoolAddon()
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
		else if (registryKey.equals(IMinecoloniesAPI.getInstance().getBuildingRegistry().getRegistryKey()))
		{
			ModBuildings.deliveryman.get().getModuleProducers().add(AddonBuildingModules.COOL_MODULE_1);
			ModBuildings.deliveryman.get().getModuleProducers().add(AddonBuildingModules.COOL_MODULE_2);
			ModBuildings.deliveryman.get().getModuleProducers().add(AddonBuildingModules.COOL_MODULE_3);
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
			e.accept(AddonBlocks.BLOCK_HUT_COOL_BUILDING);
		}

	}

	public static ResourceLocation rl(String path)
	{
		return new ResourceLocation(MOD_ID, path);
	}

}
