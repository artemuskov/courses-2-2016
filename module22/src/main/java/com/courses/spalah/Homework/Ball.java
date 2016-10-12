package com.courses.spalah.Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Artem Uskov on 12.10.2016.
 */
public class Ball {
    private int positionX;
    private int positionY;
    private int radius;
    private final List<Color> COLORS = Collections.unmodifiableList(Arrays.asList(Color.values()));
    private final int SIZE = COLORS.size();
    private final Random RANDOM = new Random();
    private Color color;
    private int direction;
    private int speed;

    public Color setRandomColor() {
        color = COLORS.get(RANDOM.nextInt(SIZE));
        return color;
    }

    public int setRandomRadius() {
        radius = RANDOM.nextInt(40) + 10;
        return radius;
    }

    public int setRandomSpeed() {
        speed = RANDOM.nextInt(20) + 5;
        return speed;
    }

    public int getPosotionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public void setPositionX(int x) {
        positionX = x;
    }

    public void setPositionY(int y) {
        positionY = y;
    }
}
