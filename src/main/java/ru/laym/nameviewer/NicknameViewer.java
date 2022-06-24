package ru.laym.nameviewer;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "nameviewer", name = "NicknameViewer", version = "1.0")
public class NicknameViewer {
  
    public static int xPosition;
    public static int yPosition;
  
    @EventHandler
    public void init(FMLInitializationEvent event) {
        DrawHandler drawhandler = new DrawHandler();
        MinecraftForge.EVENT_BUS.register(drawhandler);
        FMLCommonHandler.instance().bus().register(drawhandler);
    }
  
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
      
    }

    @EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
      
     }
}