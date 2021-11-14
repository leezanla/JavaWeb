package com.lee.work;

public class AbstractClassTest {

    public static void main(String[] args) {
        Shapes circle = new Circle(4);
        System.out.println(circle.getInfo("circle"));
        Shapes square = new Square(6, 9);
        System.out.println(square.getInfo("square"));
    }
}

abstract class Shapes{
    public String getInfo(String shape)
    {
        return shape + " information are:perimeter is " + String.format("%.2f",getPerimeter())
                + ",area is " + String.format("%.2f", getArea());
    }

    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends Shapes{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    double getPerimeter() {
        return Math.PI * this.getRadius() * 2;
    }
}
class Square extends Shapes{

    private double width;
    private double height;

    public Square() {
    }

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    double getPerimeter() {
        return (this.getHeight() + this.getWidth()) * 2;
    }
}