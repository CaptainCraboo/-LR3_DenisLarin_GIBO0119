package ru.mirea.gibo01.pr3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circleTest = new Circle();
        circleTest.setRadius(10);
        System.out.println("Площадь круга равна: " + circleTest.getSquare(circleTest.getRadius()));
        System.out.println("Диаметр круга равен: " + circleTest.getCircleLength(circleTest.getRadius()));
    }
}