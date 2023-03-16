package org.example.opp.basic;

import java.awt.*;

public class Circle {
    Point centre;
    int radius;
    public Circle(Point center, int radius) {
        this.centre = center;
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimetre(){
        return 2 * Math.PI * this.radius;
    }

    public double getArea(){
        return 4 * Math.PI * this.radius * this.radius;
    }

    public boolean contains(Point point){
        return this.centre.distance(point) <= this.radius;
    }

    public void translate(int dx, int dy){
        this.centre.x += dx;
        this.centre.y += dy;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre +
                ", radius=" + radius +
                '}';
    }
}
