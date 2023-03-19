package org.example.opp.shapepackage;

import java.awt.*;

public class Rectangle extends AbstracShape {
    Point bottomRight;
    Point upperLeft;

    public Rectangle(String color, String id, Point bottomRight, Point upperLeft) {
        super(color, id);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    double getArea() {
        return Math.abs(getBottomRight().getX() - getUpperLeft().getX()) * Math.abs(getUpperLeft().getY() - getBottomRight().getY());
    }

    @Override
    double getPerimeter() {
        return Math.abs(getBottomRight().getX() - getUpperLeft().getX()) * 2 + Math.abs(getUpperLeft().getY() - getBottomRight().getY()) * 2;
    }

    @Override
    void move(Point point) {
        setUpperLeft(new Point(getUpperLeft().x + point.x, getUpperLeft().y + point.y));
        setBottomRight(new Point(getBottomRight().x + point.x, getBottomRight().y + point.y));
    }

    @Override
    void resize(double scale) {
        setBottomRight(new Point((int)(getBottomRight().x * scale), (int)(getBottomRight().y * scale)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomRight=" + bottomRight +
                ", upperLeft=" + upperLeft +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
