package com.magui.general;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by matias on 20/8/15.
 */
public class Ball {
    private Texture textura;
    private float position_x,position_y;
    public Sprite spBall;
    public float position_initial, altura;

    public Ball(Texture tex,float pos_x,float pos_y, float size_x, float size_y){
        textura = tex;
        position_x = pos_x;
        position_y = pos_y;
        spBall = new Sprite(textura);
        spBall.setSize(size_x, size_y);
        spBall.setPosition(position_x, position_y);
        position_initial = pos_y;
    }
    public void rotate(){
        spBall.setOrigin(spBall.getWidth() / 2, spBall.getHeight() / 2);
        spBall.rotate(-3);
    }
    public float getWidth(){
       return spBall.getWidth();
    }
    public float getHeight(){
        return spBall.getHeight();
    }
    public float getX(){
        return spBall.getX();
    }
    public float getY(){
        return spBall.getY();
    }
    public void setPosition(float x,float y){
        spBall.setPosition(x,y);
    }
    public void setAltura(float y){
        altura = y;
    }
    public float getAltura(){
        return altura;
    }
    public void Jump(){
        setPosition(getX(), getY() + (altura)* Gdx.graphics.getDeltaTime()*4);
    }

}
