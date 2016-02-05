package com.company;

import sun.rmi.log.LogInputStream;

import java.awt.*;
import java.nio.file.DirectoryNotEmptyException;
import java.util.ArrayList;

/**
 * Created by zidan on 5.2.2016.
 */
public class Snake extends GObject {
    public enum Direction{
        UP, DOWN, RIGHT, LEFT
    }

    private java.util.List<GObject> body;
    private Color colorbody;
    private Direction direct;

    public Snake(int x, int y, int sizeInPixels, Color color, Color colorbody) {
        super(x, y, sizeInPixels, color);
        body = new ArrayList<>();
        setColorBody(colorbody);
        setDirect(Direction.DOWN);
    }

    public void draw(Graphics2D g2) {
        g2.setColor(getColor());
        g2.fillRect(getX(), getY(), getSizeInPixels(), getSizeInPixels());

        for (GObject ob : body) {
            ob.draw(g2);
        }
    }

        public Color getColorBody(){
        return colorbody;
    }

    public void setColorBody(Color colorBody){
        this.colorbody = colorBody;
    }

    public Direction getDirect(){
        return direct;
    }

    public void setDirect(Direction direct){
        this.direct = direct;
    }

    public  void expandBody(){
        body.add(0,new GObject(getX(),getY(),getSizeInPixels(),getColorBody()));
        moveHead();
    }

    public List<GObject> getBody(){
        return body;
    }


}
