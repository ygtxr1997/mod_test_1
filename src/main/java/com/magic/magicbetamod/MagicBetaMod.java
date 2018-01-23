package com.magic.magicbetamod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MagicBetaMod.MODID, version = MagicBetaMod.VERSION)
public class MagicBetaMod
{
    public static final String MODID = "magicbeta";
    public static final String VERSION = "0.0.0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // coding here
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
