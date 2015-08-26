package com.magui.draw;

import com.magui.general.Main;
import com.magui.storage.General;

/**
 * Created by matias on 23/8/15.
 */
public class Running {

    public static void draw(){

        com.magui.storage.Running.spGame.draw(General.batch);
        com.magui.storage.Running.spLine.draw(General.batch);
        Main.line.spLine.draw(General.batch);
        Main.ball.spBall.draw(General.batch);


    }
}
