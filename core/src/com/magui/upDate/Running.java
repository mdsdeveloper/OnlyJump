package com.magui.upDate;

import com.badlogic.gdx.Gdx;
import com.magui.general.Main;
import com.magui.storage.General;

/**
 * Created by matias on 23/8/15.
 */
public class Running {
    public static int point, currently_touch, last_touch, counter = 0;

    public static void upDate(){

        while(Gdx.input.isTouched(point)){
            point++;
        }
        currently_touch = point;

        Main.ball.rotate();

        //**************aqui salta la bola*************************
        if(Gdx.input.isTouched() && last_touch != currently_touch){
            counter ++;
            if(counter <= 3)
              Main.ball.setAltura(General.h * 0.10f);
        }
        Main.ball.Jump();

        if(Main.ball.getY() > Main.ball.position_initial) {
            Main.ball.setAltura(Main.ball.getAltura() - General.h * 0.005f);
        }
        else {
            Main.ball.setAltura(0);
            Main.ball.setPosition(Main.ball.getX(), Main.ball.position_initial);
            counter = 0;
        }
        Gdx.app.log("0", "este es el contador : " + Integer.toString(point));



        // aqui se mueve la barra de arriba.
        if(Main.line.getPosition_x()+Main.line.spLine.getWidth() < 0)
            Main.line.setPosition_x(General.w);
        Main.line.setPosition_x(Main.line.getPosition_x()-5);



        point = 0;
        last_touch = currently_touch;
        currently_touch = 0;

    }
}
