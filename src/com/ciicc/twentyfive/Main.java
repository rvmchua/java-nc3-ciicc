package com.ciicc.twentyfive;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape oval = new Oval();
        Shape square = new Square();

        Shape[] shapes = {triangle, oval, square};

        for (Shape shape : shapes) {
            shape.print();
            if (shape instanceof Oval ovalShape) {
                ovalShape.calculateArea();
            }
        }
    }
}
