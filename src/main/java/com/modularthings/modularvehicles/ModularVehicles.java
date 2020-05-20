package com.modularthings.modularvehicles;
import com.modularthings.modularvehicles.proxy.CommonProxy;
import com.modularthings.modularvehicles.utils.Reference;
import net.minecraft.client.main.Main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class ModularVehicles {
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent preInitializationEvent) {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent initializationEvent) {
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent postInitializationEvent) {
    }
}
