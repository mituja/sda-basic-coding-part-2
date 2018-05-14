package com.company;

public class Rectangle implements Figure {

    private Point p1,p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public boolean containsPoint(Point point) {
        double min_x = p1.x < p2.x ? p1.x : p2.x;
        double min_y = p1.y < p2.y ? p1.y : p2.y;
        double max_x = p1.x > p2.x ? p1.x : p2.x;
        double max_y = p1.y > p2.y ? p1.y : p2.y;
        return point.x >= min_x && point.x <= max_x && point.y >= min_y && point.y <= max_y;
    }
}
