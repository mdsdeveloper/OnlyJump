package com.magui.draw;

import com.magui.general.Main;
import com.magui.storage.General;

/**
 * Created by matias on 20/8/15.
 */
public class Splash {


    public static void draw(){
        if(Main.time > 0 && General.estado == General.state.splash){
            Main.time --;
            if(Main.time == 0){
                General.estado = General.state.menu;
            }
        }
        com.magui.storage.Splash.spSplash.draw(General.batch);
        com.magui.storage.Splash.maguiFont.draw(General.batch, "MAGUI STUDIO", (General.w - com.magui.storage.Splash.maguiFont.getBounds("MAGUI STUDIO").width) / 2, General.h - General.h/3);
        com.magui.storage.Splash.presentFont.draw(General.batch, "presents", (General.w - com.magui.storage.Splash.presentFont.getBounds("presents").width) / 2, General.h - General.h / 3 - 60);


    }
}
