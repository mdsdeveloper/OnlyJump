package com.magui.general;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.magui.storage.General;

/**
 * Created by matias on 20/8/15.
 */
public class SimpleButton implements Button {
    private  float h_init,w_init,h_fin,w_fin,position_x,position_y, x_increase, y_increase;
    private  Texture tex;
    public  Sprite spButton;
    private  boolean click = false;
    private float time = 0.1f;
    private  int pointer =0;
    private  int last_touched, currently_touch=0;

    public SimpleButton(float height, float width, float pos_x, float pos_y, Texture texture){
        h_init  = height;
        w_init  = width;
        x_increase = w_init*0.1f;
        y_increase = h_init*0.1f;
        h_fin = h_init + y_increase;
        w_fin = w_init + x_increase;
        position_x = pos_x;
        position_y = pos_y;
        tex = texture;
        spButton = new Sprite(tex);
        spButton.setSize(width, height);
        spButton.setPosition(position_x, position_y);
        spButton.setCenter(pos_x + (w_init / 2), pos_y + (h_init / 2));
    }


    public void setTexture(Texture tex) {

    }

    public boolean isClicked(){
        while (Gdx.input.isTouched(pointer)) {
            pointer++;
        }
        currently_touch = pointer;
        if((Gdx.input.isTouched()) && (Gdx.input.getX() >= spButton.getX() && Gdx.input.getX() <= spButton.getX() + spButton.getWidth())
                && (General.h - Gdx.input.getY() >= spButton.getY() && General.h - Gdx.input.getY() <= spButton.getY() + spButton.getHeight())){
            click = true;
            increaseButton(Gdx.graphics.getDeltaTime());
            if (Gdx.input.isTouched() && last_touched != currently_touch)
                sound.play(0.2f);
        }
        else {
            click = false;
            decreaseButton(Gdx.graphics.getDeltaTime());
        }

        pointer = 0;
        last_touched = currently_touch;
        return click;
    }
    public void increaseButton(float delta) {
         if (getWidth() + delta*(x_increase/time) <= w_fin) {
             spButton.setSize(getWidth() + delta*(x_increase/time), getHeight() + delta*(y_increase/time));
         } else {
             spButton.setSize(w_fin, h_fin);
         }
    }
    public void decreaseButton(float delta){
        if (getWidth() - delta*(x_increase/time) >= w_init) {
            spButton.setSize(getWidth() - delta*(x_increase/time), getHeight() - delta*(y_increase/time));
        } else {
            spButton.setSize(w_init, h_init);
        }
    }



    public float getHeight(){
        return spButton.getHeight();
    }
    public float getWidth(){
        return spButton.getWidth();
    }
    public void setHeight(float h){
        this.h_init = h;
    }
    public void setWidth(float w){
        this.w_init = w;
    }


}
