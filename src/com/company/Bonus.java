package com.company;

import java.awt.*;
import java.util.Random;

/**
 * Created by zidan on 5.2.2016.
 */
public class Bonus extends GObject {
    private final int maxX;
    private final int maxY;
    private Random rand;

    public Bonus(int sizeInPixels, Color color, int maxX, int maxY) {
        super(0, 0, sizeInPixels, color);
        this.maxX = maxX;
        this.maxY = maxY;
        rand = new Random();
    }

    public void locateBonus(){
        int tmp;
        tmp = rand.nextInt(maxX/getSizeInPixels());
        setX(tmp*getSizeInPixels());
        tmp = rand.nextInt(maxY/getSizeInPixels());
        setY(tmp*getSizeInPixels());
    }
}
