package ru.laym.nameviewer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DrawHandler {
  
    private Minecraft mc = Minecraft.getMinecraft();
    private ScaledResolution scaled = new ScaledResolution(mc);
    private int scaledX = scaled.getScaledWidth();
    private int scaledY = scaled.getScaledHeight();
  
    public String getString(){ 
        String string =  EnumChatFormatting.GOLD + "Ник: " + Minecraft.getMinecraft().thePlayer.getDisplayName();
        return string;
    }
  
    public  int getPosX(int xPos){
        return xPos;
    }
  
    public int getPosY(int yPos){
        return yPos;
    }
  
    public  void draw() {
        Minecraft.getMinecraft().fontRendererObj.drawString(getString(), getPosX(NicknameViewer.xPosition) , getPosY(NicknameViewer.yPosition), 0xFFFFFF);
    }
      
    @SubscribeEvent
    public void onRenderOverlay(RenderGameOverlayEvent event) {
        if (event.type == ElementType.TEXT) {
            DrawHandler dh = new DrawHandler();
            dh.draw(); 
        }
    }
}