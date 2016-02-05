package com.company;

import java.awt.*;

/**
 * Created by zidan on 5.2.2016.
 */
public class GObject {
    private int x;
    private int y;
    private int sizeInPixels;
    private Color color;

    public GObject(int x, int y, int sizeInPixels, Color color){
        setX(x);
        setY(y);
        setSizeInPixels(sizeInPixels);
        setColor(color);
    }

    public void draw(Graphics2D g2){
        g2.setColor(color);
        g2.fillRect(x, y,sizeInPixels,sizeInPixels);
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getSizeInPixels(){
        return sizeInPixels;
    }

    public void setSizeInPixels(int sizeInPixels){
        this.sizeInPixels = sizeInPixels;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }



}
