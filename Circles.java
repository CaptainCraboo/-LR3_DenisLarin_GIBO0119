package ru.mirea.gibo01.pr3;

import java.util.Arrays;

public class Circles {
    private Circle[] circles;
    private int circleCount = circles.length;
    //Метод для нахождения самой большой окрукжности
    public Circle getMaxCircle(Circle[] circles) {
        Circle tempCircle = circles[0];
        for (int i = 1; i < circleCount; i++) {
            if (tempCircle.getSquare(tempCircle.getRadius()) < circles[i].
                    getSquare(circles[i].getRadius())) {
                tempCircle = circles[i];
            }
        }
        return tempCircle;
    }
    //Метод для нахождения самой маленькой окрукжности
    public Circle getMinCircle(Circle[] circles) {
        Circle tempCircle = circles[0];
        for (int i = 1; i < circleCount; i++) {
            if (tempCircle.getSquare(tempCircle.getRadius()) > circles[i].
                    getSquare(circles[i].getRadius())) {
                tempCircle = circles[i];
            }
        }
        return tempCircle;
    }
    //Метод упорядочивающий хранение окружностей в массив
    public void sort (Circle[] circles) {
        Arrays.sort(circles);
    }
}