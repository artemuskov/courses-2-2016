package com.courses.spalah.Homework;

/**
 * Created by Artem Uskov on 12.10.2016.
 */
public class Main {

    private static Ball ball = new Ball();
    private static Form form;

    public static void main(String[] args) {
        ball.setRandomColor();
        ball.setRandomSpeedX();
        ball.setRandomSpeedY();
        ball.setRandomRadius();
        form = new Form();

        System.out.println("Radius = " + ball.getRadius());
        System.out.println("Speed = " + ball.getSpeedX());
        System.out.println("Speed = " + ball.getSpeedY());
        System.out.println("Color = " + ball.getColor());
    }

}
