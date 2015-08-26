package com.magui.storage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by matias on 16/8/15.
 */
public class General {
    public static SpriteBatch batch;
    public static state estado;
    public static float w,h;
    public static float ratio;
    public enum state{
        splash,
        menu,
        running,
        preGameover,
        pause,
        gameOver;
    }

    public static void load(){
        //Screen Sizes. DON'T CHANGE THEM!
        w = Gdx.graphics.getWidth();
        h = Gdx.graphics.getHeight();

        //Ratio is used for text size
        float ratio1 = (float) (w / 720.0);
        float ratio2 = (float) (h / 1280.0);

        //The ratio is used for text size
        if (ratio1 > ratio2)
            ratio = ratio2;
        else
            ratio = ratio1;
        /////////////END SIZE VARIABLES DECLARATION////////////////////////
        batch = new SpriteBatch();
        w = Gdx.graphics.getWidth();
        h = Gdx.graphics.getHeight();
        estado = state.running;

    }
}
