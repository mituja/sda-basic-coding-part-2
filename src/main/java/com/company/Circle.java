package com.company;

public class Circle implements Figure {

    private Point middle;
    private double radius;

    public Circle(Point middle, double radius) {
        this.middle = middle;
        this.radius = radius;
    }

    @Override
    public boolean containsPoint(Point point) {
        double pointDistance = Math.sqrt(Math.pow(point.x - middle.x, 2) + Math.pow(point.y - middle.y, 2));
        if (pointDistance<=radius){
            return true;
        }
        return false;
    }
}
