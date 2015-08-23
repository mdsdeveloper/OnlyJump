package com.magui.general;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by matias on 21/8/15.
 */
public interface Button {
    public static Sound sound =  Gdx.audio.newSound(Gdx.files.getFileHandle("sounds/ButtonSound.mp3", Files.FileType.Internal));
    public void setTexture(Texture tex);
    public boolean isClicked();
    public void increaseButton(float delta);
    public void decreaseButton(float delta);
    public float getHeight();
    public float getWidth();
    public void setHeight(float h);
    public void setWidth(float w);
}
