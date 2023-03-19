package org.example.opp.shapepackage;

import java.awt.*;

public class Circle extends AbstracShape {
    Point centre;
    double radius;

    public Circle(String color, String id, Point centre, double radius) {
        super(color, id);
        this.centre = centre;
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    @Override
    double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    void move(Point point) {
        setCentre(new Point(getCentre().x + point.x, getCentre().y + point.y));
    }

    @Override
    void resize(double scale) {
        setRadius(getRadius() * scale);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
