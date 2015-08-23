package com.magui.storage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by matias on 16/8/15.
 */
public class Splash {
    public static Sprite spSplash;
    public static Texture imgSplash;
    public static BitmapFont maguiFont, presentFont;

    public static void load(){

        imgSplash = new Texture("backGround/Splash.png");
        imgSplash.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spSplash = new Sprite(imgSplash);
        spSplash.setSize(General.w, General.h);
        maguiFont = new BitmapFont(Gdx.files.internal("fonts/fontMagui.fnt"));
        presentFont = new BitmapFont(Gdx.files.internal("fonts/fontPresents.fnt"));
        maguiFont.setScale(General.ratio);
        presentFont.setScale(General.ratio);
    }
}
