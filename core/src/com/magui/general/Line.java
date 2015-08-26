package com.magui.general;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by matias on 23/8/15.
 */
public class Line {

    public static Texture texture;
    public static Sprite spLine;
    private static float position_x,position_y;

    public Line(Texture tex,float pos_x,float pos_y, float size_x, float size_y){
        texture = tex;
        position_x = pos_x;
        position_y = pos_y;
        spLine = new Sprite(texture);
        spLine.setPosition(position_x,position_y);
        spLine.setSize(size_x,size_y);

    }
    public float getPosition_x(){
        return spLine.getX();
    }
    public float getPosition_y(){
        return spLine.getY();
    }
    public float getBase(){
        return spLine.getY()+spLine.getHeight();
    }
    public void setPosition_x(float pos){
        spLine.setPosition(pos, spLine.getY());
    }

}
