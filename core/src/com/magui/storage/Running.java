package com.magui.storage;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by matias on 23/8/15.
 */
public class Running {
    public static Sprite spGame, spLine;
    private static Texture imgGame,imgLine;

    public static void load(){
        imgGame = new Texture("backGround/backGroundGame.png");
        imgGame.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spGame = new Sprite(imgGame);
        spGame.setSize(General.w, General.h);

        imgLine = new Texture("backGround/linea.png");
        imgLine.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

        spLine = new Sprite(imgLine);
        spLine.setSize(General.w, General.h);
        spLine.setPosition(0,General.h/2 - spLine.getHeight()/2 - General.h/4);

    }
}
