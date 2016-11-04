package com.drasticdemise.TCaddons.common;

import com.drasticdemise.TCaddons.common.items.BOPTerrainCrystalAbstract;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TCAddons.MODID, name = TCAddons.MODNAME, useMetadata = true, version = TCAddons.VERSION, dependencies = TCAddons.DEPENDENCIES)


public class TCAddons {
    public static final String MODID = "terrainCrystalsAddons";
    public static final String MODNAME = "Terrain CrystalsAddons";
    public static final String VERSION = "1.0.2";
    public static final String URL = "https://raw.githubusercontent.com/DrasticDemise/Terrain-Crystals-Addons/master/1.9%20Update%20Handler";
    public static final String DEPENDENCIES = "required-after:terrainCrystals;required-after:BiomesOPlenty";

    @SidedProxy
    public static CommonProxy proxy;

    @Mod.Instance
    public static TCAddons instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    public static class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {
            //	Configuration config = new Configuration(e.getSuggestedConfigurationFile());
            //	ConfigurationFile.configFile(config);
            //Initialization of Blocks and Items
            InitItems.init();
        }

        public void init(FMLInitializationEvent e) {
            InitItems.recipes();
        }

        public void postInit(FMLPostInitializationEvent e) {

            BOPTerrainCrystalAbstract.initInvalidBOPSpaces();
        }
    }

    public static class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);
            //Initialization of models
            InitItems.initModels();
            new VersionChecker().init();
        }

    }

    public static class ServerProxy extends CommonProxy {

    }

}


