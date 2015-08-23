package com.magui.storage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.magui.general.SimpleButton;
import com.magui.general.MusicButton;
import com.magui.general.SoundButton;

/**
 * Created by matias on 20/8/15.
 */
public class Menu {
    public static Sprite spBackGroundGame;
    public static Texture imgBackGround, imgBTMenu, imgSound_on, imgSound_off, imgMusic_on, imgMusic_off;
    public static BitmapFont nameGameFont, helpFont;
    public static SimpleButton button;
    public static MusicButton buttonMusic;
    public static SoundButton buttonSound;
    public static void load(){
        // backGround menu.
        imgBackGround = new Texture("backGround/backGroundMenu.png");
        imgBackGround.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        spBackGroundGame = new Sprite(imgBackGround);
        spBackGroundGame.setSize(General.w, General.h);

        // Fonts of the menu.     ******************* HAY QUE CAMBIAR LAS FUENTES. ************
        nameGameFont = new BitmapFont(Gdx.files.internal("fonts/fontMagui.fnt"));
        helpFont = new BitmapFont(Gdx.files.internal("fonts/fontPresents.fnt"));
        nameGameFont.setScale(General.ratio);
        helpFont.setScale(General.ratio);

        imgBTMenu = new Texture("buttons/home.png");
        imgBTMenu.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        imgMusic_on = new Texture("buttons/music_on.png");
        imgMusic_on.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        imgMusic_off = new Texture("buttons/music_off.png");
        imgMusic_off.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        imgSound_on = new Texture("buttons/sound_on.png");
        imgSound_on.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        imgSound_off = new Texture("buttons/sound_off.png");
        imgSound_off.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        button = new SimpleButton(General.w/10,General.w/10,600 - (General.w/10)/2,General.h/4 + 160,imgBTMenu);
        buttonSound = new SoundButton(General.w/10, General.w/10,360 - (General.w/10)/2, General.h/4 + 100,imgSound_on,imgSound_off);
        buttonMusic = new MusicButton(General.w/10,General.w/10, 120 -(General.w/10)/2 , General.h/4 + 50,imgMusic_on,imgMusic_off);
// width screen is 720 then i get the mesure for the button div 720 / 6 = 1(120) 2(240) 3(360) 4(480) 5(600)
        // in thos mesure i put the button in the eje x


    }
}
