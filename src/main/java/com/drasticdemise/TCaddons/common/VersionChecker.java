package com.drasticdemise.TCaddons.common;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

import java.io.IOException;

public class VersionChecker {
    public static String version = "";
    public static boolean doneChecking = false;

    public void init() {
        new ThreadVersionChecker();
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void onTick(ClientTickEvent event) throws IOException {
        if (!doneChecking && Minecraft.getMinecraft().thePlayer != null) {
            EntityPlayer player = Minecraft.getMinecraft().thePlayer;
            if (!VersionChecker.version.equals(TCAddons.VERSION)) {
                System.out.println("VC: " + VersionChecker.version + " " + "TC V: " + TCAddons.VERSION);
                player.addChatComponentMessage(new TextComponentTranslation("There is a new version of Extra Terrain Crystals Available!"));

            }
            VersionChecker.doneChecking = true;
        }
    }
}
